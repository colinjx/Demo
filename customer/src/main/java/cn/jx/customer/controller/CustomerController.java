package cn.jx.customer.controller;

import cn.jx.common.pageutil.Page;
import cn.jx.common.util.format.DateFormatHelper;
import cn.jx.common.util.json.JsonHelper;
import cn.jx.customer.entity.Customer;
import cn.jx.customer.entity.CustomerQueryModel;
import cn.jx.customer.entity.CustomerWeb;
import cn.jx.customer.servise.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	@Autowired
	private ICustomerService ics ;

	@RequestMapping(value = "/toAdd",method = RequestMethod.GET)
	public String toAdd(){
		return "customer/add";
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@ModelAttribute("customer")Customer customer){
		customer.setRegisterTime(DateFormatHelper.longToStr(System.currentTimeMillis()));

		ics.insert(customer);
		return "customer/success";
	}

	@RequestMapping(value = "/toUpdate/{customerUuid}",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid){

		model.addAttribute("customer",ics.getByPrimaryKey(customerUuid));
		return "customer/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("customer") Customer customer){
		ics.updateByPrimaryKey(customer);

		return "customer/success";
	}

	@RequestMapping(value = "/toDelete/{customerUuid}",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("customerUuid") int customerUuid){
		model.addAttribute("customer",ics.getByPrimaryKey(customerUuid));
		return "customer/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int customerUuid){
		ics.deleteByPrimaryKey(customerUuid);
		return "customer/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@ModelAttribute("customerWeb")CustomerWeb customerWeb, Model model){
		CustomerQueryModel cqm = null;

		if(customerWeb.getQueryJsonStr()== null || customerWeb.getQueryJsonStr().trim().length()==0){
			cqm = new CustomerQueryModel();
		}else {
			cqm= (CustomerQueryModel) JsonHelper.str2Object(customerWeb.getQueryJsonStr(),CustomerQueryModel.class);
		}
		cqm.getPage().setNowPage(customerWeb.getNowPage());
		if(customerWeb.getPageShow() > 0){
			cqm.getPage().setPageShow(customerWeb.getPageShow());
		}

		Page dbPage = ics.getByConditionPage(cqm);
		model.addAttribute("customerWeb",customerWeb);
		model.addAttribute("page",dbPage);


		return "customer/list";
	}


	@RequestMapping(value = "/toQuery",method = RequestMethod.GET)
	public String toQuery(){

		return "customer/query";
	}


}
