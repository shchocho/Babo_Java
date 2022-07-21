package com.varxyz.jv302.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuguDanServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageTitle = "Hello World";	
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>" );
		out.println("<body style='text-align: center;'>");
		out.println("<h3>Welcom to 서블릿 프로그래밍</h3>");
		out.println("<div style='display:flex; justify-content:center; aling-items:center; margin:0 auto;'>");
		for(int j = 1; j < 10; j++) {				
			out.println("<div m-around; width:80px; height:520px; border:1px solid blue;'>");
			for (int i = 2; i < 10; i++) {
			out.println(i + "*" + j + "=" + i*j +"\t");
			
			}
			out.println("");
			out.println("</div>");
			}
		out.println("</div>");
		out.println("</body></html>");
		out.close();
	}

}
