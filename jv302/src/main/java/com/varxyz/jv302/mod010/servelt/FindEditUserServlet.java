package com.varxyz.jv302.mod010.servelt;

import java.io.IOException;

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


@WebServlet("/mod010/edit_user.do")
public class FindEditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
       
   
    public FindEditUserServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		userService = new UserService(new UserDao());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		User user = userService.findUserByUserId(userId);	
		request.setAttribute("user", user);
		
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("edit_user.jsp");
		dispatcher.forward(request, response);		
	}

}
