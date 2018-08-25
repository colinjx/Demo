package cn.jx.store.controller;

import cn.jx.common.pageutil.Page;
import cn.jx.common.util.json.JsonHelper;
import cn.jx.store.model.Store;
import cn.jx.store.model.StoreWeb;
import cn.jx.store.servise.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/store")
public class StoreController {
	@Autowired
	private StoreService cs;

	@RequestMapping(value = "/toAdd",method = RequestMethod.GET)
	public String toAdd(){
		return "store/add";
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@ModelAttribute("store")Store store){

		cs.insert(store);
		return "store/success";
	}

	@RequestMapping(value = "/toUpdate/{uuid}",method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("uuid") int uuid){

		model.addAttribute("store", cs.getByPrimaryKey(uuid));
		return "store/update";
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updated(@ModelAttribute("store") Store store){
		cs.updateByPrimaryKey(store);

		return "store/success";
	}

	@RequestMapping(value = "/toDelete/{uuid}",method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("uuid") int uuid){
		model.addAttribute("store", cs.getByPrimaryKey(uuid));
		return "store/delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleted(@RequestParam(value = "uuid") int uuid){
		cs.deleteByPrimaryKey(uuid);
		return "store/success";
	}

	@RequestMapping(value = "/toList",method = RequestMethod.GET)
	public String toList(@ModelAttribute("storeWeb")StoreWeb storeWeb, Model model){
		Store store;

		if(storeWeb.getQueryJsonStr()== null || storeWeb.getQueryJsonStr().trim().length()==0){
			store = new Store();
		}else {
			store= (Store) JsonHelper.str2Object(storeWeb.getQueryJsonStr(), Store.class);
		}
		store.getPage().setNowPage(storeWeb.getNowPage());
		if(storeWeb.getPageShow() > 0){
			store.getPage().setPageShow(storeWeb.getPageShow());
		}

		Page dbPage = cs.getByConditionPage(store);
		model.addAttribute("storeWeb",storeWeb);
		model.addAttribute("page",dbPage);


		return "store/list";
	}


	@RequestMapping(value = "/toQuery",method = RequestMethod.GET)
	public String toQuery(){

		return "store/query";
	}


}
