package com.varxyz.jv302.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormBasedLoginServlet
 */
@WebServlet("/mod005/login.do")

public class FormBasedLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");		
		String userPW = request.getParameter("userPW");
		String name = request.getParameter("userName");
		String ssn = request.getParameter("userSsn");
		String email1 = request.getParameter("userEmail1");
		String email2 = request.getParameter("globalEmail");
		String[] concerns = request.getParameterValues("hobby");
		
		
		
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Login</title></head>" );
		out.println("<body>");
		out.println("<h3>등록된 회원정보</h3>");
		out.println("<ul>");
		out.println("<li>"+ userId+ "</li>");
		out.println("<li>"+ userPW+ "</li>");		
		out.println("<li>"+ name+ "</li>");
		out.println("<li>"+ ssn+ "</li>");		
		out.println("<li>"+ email1+ " @ " + email2 + "</li>");
		for(String s : concerns) {
			out.println("<li>"+ s + "</li>");
		}
		
		out.println("</body></html>");
		out.close();		
		
	}
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
