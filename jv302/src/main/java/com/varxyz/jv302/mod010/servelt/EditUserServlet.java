package com.varxyz.jv302.mod010.servelt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varxyz.jv302.mod009.dao.UserDao;
import com.varxyz.jv302.mod009.domain.User;
import com.varxyz.jv302.mod009.service.UserService;


@WebServlet("/mod010/update_user.do")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	private UserService userService;
	
	public void init() {
		userService = new UserService(new UserDao());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");	
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		user.setUserName(userName);
		user.setSsn(ssn);
		user.setEmail(email1 + "@" + email2);
		user.setAddr(addr1 + " " + addr2);
		
		userService.editUser(user);		
		request.setAttribute("user", user);
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("/mod009/success.jsp");
		dispatcher.forward(request, response);		

	}

}
