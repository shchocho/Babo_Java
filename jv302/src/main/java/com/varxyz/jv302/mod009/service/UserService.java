package com.varxyz.jv302.mod009.service;

import java.util.List;

import com.varxyz.jv302.mod009.dao.UserDao;
import com.varxyz.jv302.mod009.domain.User;

public class UserService {
	UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		userDao.addUser(user);	
	}

	public List<User> findAllUser() {
		return userDao.findAllUser();		
	}
	
	public User findUserByUserId(String userId) {
		return userDao.findUserByUserId(userId);
	}
	
	public boolean isValidUser(String userId, String passwd) {		
		User user = userDao.findUserByUserId(userId);
		if(user == null) {			
			return false;
		}else {		
			System.out.println(user.getPasswd());
			System.out.println(passwd);
			if(user.getPasswd().equals(passwd)) {			
				return true;
			}else {				
				return false;
			}			
		}		
	}

	public void editUser(User user) {
		userDao.editUser(user);
		
	}

}
