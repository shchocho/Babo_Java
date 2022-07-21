package com.varxyz.jv302.mod009.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varxyz.jv302.mod009.dao.UserDao;
import com.varxyz.jv302.mod009.domain.User;
import com.varxyz.jv302.mod009.service.UserService;


@WebServlet("/mod009/find_user.do")
public class FindUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	
	public void init(ServletConfig config) throws ServletException {
		userService = new UserService(new UserDao());
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.비즈니스 서비스 호출
		List<User> userList = userService.findAllUser();		
		request.setAttribute("userList", userList);
		//request.setAttribute("user", user);
		
		//4.NextPage	
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("find_Alluser.jsp");
		dispatcher.forward(request, response);		
	}

}
