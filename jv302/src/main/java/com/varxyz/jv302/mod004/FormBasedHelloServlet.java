package com.varxyz.jv302.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormBasedHelloServlet
 */
@WebServlet("/mod004/hello.do")
public class FormBasedHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DEFULAT_NAME = "world";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		if(name == null || name.length() ==0) {
			name = DEFULAT_NAME;
			
		}
		String pageTitle = "Hello World";
		
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>" );
		out.println("<body>");
		out.println("<h3>"+ name +"</h3>");
		out.println("<div></div>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
