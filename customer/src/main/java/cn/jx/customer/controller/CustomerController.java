package cn.jx.customer.controller;

import cn.jx.common.pageutil.Page;
import cn.jx.common.util.format.DateFormatHelper;
import cn.jx.common.util.json.JsonHelper;
import cn.jx.customer.entity.Customer;
import cn.jx.customer.entity.CustomerQueryModel;
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
	public String add(@ModelAttribute("cm")Customer customer){
		customer.setRegisterTime(DateFormatHelper.longToStr(System.currentTimeMillis()));

		ics.insert(customer);
		return "customer/success";
	}

	@RequestMapping(value = "/toUpdate/(customerUuid)",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("uuid") int customerUuid){
		model.addAttribute("cm",ics.getByPrimaryKey(customerUuid));
		return "customer/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("cm") Customer customer){
		ics.updateByPrimaryKey(customer);

		return "customer/success";
	}

	@RequestMapping(value = "/todelete/(customerUuid)",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("uuid") int customerUuid){
		model.addAttribute("cm",ics.getByPrimaryKey(customerUuid));
		return "customer/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int customerUuid){
		ics.deleteByPrimaryKey(customerUuid);
		return "customer/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@RequestParam(value="queryJsonStr",defaultValue = "") String queryJson, @ModelAttribute("page") Page page, Model model){
		CustomerQueryModel cqm = null;
		if(queryJson == null || queryJson.trim().length()==0){
			cqm = new CustomerQueryModel();
		}else {
			cqm= (CustomerQueryModel) JsonHelper.str2Object(queryJson,CustomerQueryModel.class);
		}
		cqm.getPage().setNowPage(page.getNowPage());
		Page dbPage = ics.getByConditionPage(cqm);
		model.addAttribute("queryJsonStr",queryJson);
		model.addAttribute("page",dbPage);


		return "customer/list";
	}


}
