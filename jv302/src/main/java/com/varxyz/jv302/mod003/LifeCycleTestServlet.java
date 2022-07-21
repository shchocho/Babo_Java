package com.varxyz.jv302.mod003;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet{
	public void init(ServletConfig config)	throws ServletException
	{
		System.out.print("init() method called");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		System.out.println("service() method called.");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Servlet Liftcycle Test</h3>");
		out.println("</body></html>");
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() methed called");
	}
}
