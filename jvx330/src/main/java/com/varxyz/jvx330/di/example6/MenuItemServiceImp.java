package com.varxyz.jvx330.di.example6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuItemServiceImp implements MenuItemService{
	
	@Autowired	
	private MenuDao menuDao;

	@Override
	public void addMenuItem(MenuItem menuItem) {
		menuDao.addMenuItem(menuItem);		
	}

	@Override
	public List<MenuItem> findAllMenuItem() {
		return menuDao.findAllMenuItem();	
		
	}

	@Override
	public MenuItem findMenuItemByName(String name) {		
		return menuDao.findMenuItemByName(name);	
	}

}
