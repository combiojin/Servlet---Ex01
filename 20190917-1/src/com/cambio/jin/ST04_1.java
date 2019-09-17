package com.cambio.jin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST04_1")
public class ST04_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ST04_1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		
		System.out.println("name =" +name);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>");
		out.println("이 요청은 doPost 에서 처리 되었습니다.<br>");
		out.println("</h2>");
		out.println("<h2>");
		out.println("name : " + "[" + name + "]");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		

	}

}
