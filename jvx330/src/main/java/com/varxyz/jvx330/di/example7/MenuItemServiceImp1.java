package com.varxyz.jvx330.di.example7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("menuItemService")
public class MenuItemServiceImp1 implements MenuItemService {
	@Autowired
	private MenuItemDao itemDao;

	@Override
	public void addMenuItem(MenuItem item) {
		itemDao.save(item);
	}

	@Override
	public List<MenuItem> findAllMenuItem() {		
		return itemDao.findAllMenuItemList();
	}

	@Override
	public MenuItem findMenuItemByName(String name) {		
		return itemDao.findByName(name);
	}

}
