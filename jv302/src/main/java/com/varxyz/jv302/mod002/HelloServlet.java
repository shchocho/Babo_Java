package com.varxyz.jv302.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageTitle = "Hello World";
		String pageGuGu = "";
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>" );
		out.println("<body>");
		out.println("<h3>Welcom to 서블릿 프로그래밍</h3>");
		out.println("<div></div>");
		out.println("</body></html>");
		out.close();
	}

}

//for(int j = 1; j < 10; j++) {				
//
//for (int i = 2; i < 10; i++) {
//System.out.print(i + "*" + j + "=" + i*j +"\t");
//
//}
//System.out.println("");
//
//}
