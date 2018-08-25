package cn.jx.goods.controller;

import cn.jx.common.pageutil.Page;
import cn.jx.common.util.json.JsonHelper;
import cn.jx.goods.model.Goods;
import cn.jx.goods.model.GoodsWeb;
import cn.jx.goods.servise.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
	@Autowired
	private GoodsService cs;

	@RequestMapping(value = "/toAdd",method = RequestMethod.GET)
	public String toAdd(){
		return "goods/add";
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@ModelAttribute("goods")Goods goods){

		cs.insert(goods);
		return "goods/success";
	}

	@RequestMapping(value = "/toUpdate/{uuid}",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("uuid") int uuid){

		model.addAttribute("goods", cs.getByPrimaryKey(uuid));
		return "goods/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("goods") Goods goods){
		cs.updateByPrimaryKey(goods);

		return "goods/success";
	}

	@RequestMapping(value = "/toDelete/{uuid}",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("uuid") int uuid){
		model.addAttribute("goods", cs.getByPrimaryKey(uuid));
		return "goods/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int uuid){
		cs.deleteByPrimaryKey(uuid);
		return "goods/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@ModelAttribute("goodsWeb")GoodsWeb goodsWeb, Model model){
        Goods goods;

		if(goodsWeb.getQueryJsonStr()== null || goodsWeb.getQueryJsonStr().trim().length()==0){
			goods = new Goods();
		}else {
			goods= (Goods) JsonHelper.str2Object(goodsWeb.getQueryJsonStr(), Goods.class);
		}
		goods.getPage().setNowPage(goodsWeb.getNowPage());
		if(goodsWeb.getPageShow() > 0){
			goods.getPage().setPageShow(goodsWeb.getPageShow());
		}

		Page dbPage = cs.getByConditionPage(goods);
		model.addAttribute("goodsWeb",goodsWeb);
		model.addAttribute("page",dbPage);


		return "goods/list";
	}


	@RequestMapping(value = "/toQuery",method = RequestMethod.GET)
	public String toQuery(){

		return "goods/query";
	}


}
