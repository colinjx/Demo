package cn.jx.cart.controller;

import cn.jx.cart.model.Cart;
import cn.jx.cart.model.CartWeb;
import cn.jx.cart.servise.CartService;
import cn.jx.common.pageutil.Page;
import cn.jx.common.util.json.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/cart")
public class CartController {
	@Autowired
	private CartService cs;

	@RequestMapping(value = "/toAdd",method = RequestMethod.GET)
	public String toAdd(){
		return "cart/add";
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@ModelAttribute("cart")Cart cart){

		cs.insert(cart);
		return "cart/success";
	}

	@RequestMapping(value = "/toUpdate/{uuid}",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("uuid") int uuid){

		model.addAttribute("cart", cs.getByPrimaryKey(uuid));
		return "cart/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("cart") Cart cart){
		cs.updateByPrimaryKey(cart);

		return "cart/success";
	}

	@RequestMapping(value = "/toDelete/{uuid}",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("uuid") int uuid){
		model.addAttribute("cart", cs.getByPrimaryKey(uuid));
		return "cart/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int uuid){
		cs.deleteByPrimaryKey(uuid);
		return "cart/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@ModelAttribute("cartWeb")CartWeb cartWeb, Model model){
		Cart cart;

		if(cartWeb.getQueryJsonStr()== null || cartWeb.getQueryJsonStr().trim().length()==0){
			cart = new Cart();
		}else {
			cart= (Cart) JsonHelper.str2Object(cartWeb.getQueryJsonStr(), Cart.class);
		}
		cart.getPage().setNowPage(cartWeb.getNowPage());
		if(cartWeb.getPageShow() > 0){
			cart.getPage().setPageShow(cartWeb.getPageShow());
		}

		Page dbPage = cs.getByConditionPage(cart);
		model.addAttribute("cartWeb",cartWeb);
		model.addAttribute("page",dbPage);


		return "cart/list";
	}


	@RequestMapping(value = "/toQuery",method = RequestMethod.GET)
	public String toQuery(){

		return "cart/query";
	}


}
