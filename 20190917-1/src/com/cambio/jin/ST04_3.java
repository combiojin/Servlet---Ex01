package com.cambio.jin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ST04_3")
public class ST04_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ST04_3() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String passwordtrue = request.getParameter("passwordtrue");
		String adress = request.getParameter("adress");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String[] hobby = request.getParameterValues("hobby");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>");
		out.println("작성하신 내용은 아래와 같습니다.");
		out.println("</h2>");
		out.println("이름 : " + name +"<hr/>");
		out.println("성별 : " + gender +"<hr/>");
		out.println("아이디 : " + id +"<hr/>");
		out.println("주소 : " + adress +"<hr/>");
		out.println("전화번호 : " + number +"<hr/>");
		out.println("이메일주소 : " + email +"<hr/>");
		out.println("취미 : ");
		if ( hobby == null ) {
			out.println("[선택한 취미가 없습니다]");
		} else {
			out.println("<table border = \"1\">");
			for(int i = 0 ; i <hobby.length ; i++) {
				out.println("<tr>");
				out.println("<td width = \"80\" align = \" center\">");
				out.println(hobby[i]);
				out.println("</td>");
				out.println("</tr>");
			}
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
