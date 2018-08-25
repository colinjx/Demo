package cn.jx.Order.controller;

import cn.jx.Order.model.Order;
import cn.jx.Order.model.OrderWeb;
import cn.jx.Order.servise.OrderService;
import cn.jx.common.pageutil.Page;
import cn.jx.common.util.json.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/order")
public class OderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/toAdd",method = RequestMethod.GET)
	public String toAdd(){
		return "order/add";
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@ModelAttribute("order")Order order){

		orderService.insert(order);
		return "order/success";
	}

	@RequestMapping(value = "/toUpdate/{uuid}",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("uuid") int uuid){

		model.addAttribute("order", orderService.getByPrimaryKey(uuid));
		return "order/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("order") Order order){
		orderService.updateByPrimaryKey(order);

		return "order/success";
	}

	@RequestMapping(value = "/toDelete/{uuid}",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("uuid") int uuid){
		model.addAttribute("order", orderService.getByPrimaryKey(uuid));
		return "order/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int uuid){
		orderService.deleteByPrimaryKey(uuid);
		return "order/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@ModelAttribute("orderWeb")OrderWeb orderWeb, Model model){
		Order order;

		if(orderWeb.getQueryJsonStr()== null || orderWeb.getQueryJsonStr().trim().length()==0){
			order = new Order();
		}else {
			order= (Order) JsonHelper.str2Object(orderWeb.getQueryJsonStr(), Order.class);
		}
		order.getPage().setNowPage(orderWeb.getNowPage());
		if(orderWeb.getPageShow() > 0){
			order.getPage().setPageShow(orderWeb.getPageShow());
		}

		Page dbPage = orderService.getByConditionPage(order);
		model.addAttribute("orderWeb",orderWeb);
		model.addAttribute("page",dbPage);


		return "order/list";
	}


	@RequestMapping(value = "/toQuery",method = RequestMethod.GET)
	public String toQuery(){

		return "order/query";
	}


}
