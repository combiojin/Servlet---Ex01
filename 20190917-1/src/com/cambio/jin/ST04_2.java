package com.cambio.jin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ST04_2")
public class ST04_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ST04_2() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		if ( name.equals("admin") && password.equals("1234")) {
			out.println("<h2>");
			out.println("로그인을 환영합니다.");
			out.println("</h2>");
		} else if ( name.equals("admin") || password.equals("1234")) {
			out.println("<h2>");
			out.println("아이디나 비밀번호가 일치하지 않습니다.");
			out.println("</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
