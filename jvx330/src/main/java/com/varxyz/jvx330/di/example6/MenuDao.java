package com.varxyz.jvx330.di.example6;

import java.util.ArrayList;
import java.util.List;

public class MenuDao {
	List<MenuItem> list = new ArrayList<MenuItem>();

	public MenuItem findMenuItemByName(String name) {
		for(MenuItem menuItem : list) {
			if(menuItem.getName().equals(name)) {
				return menuItem;
			}
		}		
		return null;
	}

	public List<MenuItem> findAllMenuItem() {
		
		return list;
	}

	public void addMenuItem(MenuItem menuItem) {
		list.add(menuItem);		
	}

}
