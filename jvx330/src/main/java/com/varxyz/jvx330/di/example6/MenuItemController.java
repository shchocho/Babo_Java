package com.varxyz.jvx330.di.example6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class MenuItemController {
	@Autowired	
	private MenuItemService service;
	
	public MenuItemController() {
		System.out.println("MenuItemControllers 생성");
	}
	
	public void procssRequestAdd(MenuItem menuItem) {
		service.addMenuItem(menuItem);
	}
	
	public List<MenuItem> procssRequestFindAll() {
		return service.findAllMenuItem();
	}
	
	public MenuItem procssRequestFindItem(String name) {
		return service.findMenuItemByName(name);
	}
	
}
