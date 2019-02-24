package com.week.member.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//HttpServlet 을 상속받는 순간부터, 웹서버에서 실행될수 잇는
//서블릿이 된다!!
public class MemberController extends HttpServlet{
	
	//클라이언트가  http 전송방식을 post로 전송했을때 아래의 메서드가
	//동작된다!!
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}	
	//클라이언트가 post, get이건 상관없이 아래의 메서드에서 공통코드를 
	//수행버리자!! 이렇게 하면 코드 중복을 피할 수 있다
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//응답시 html 컨텐츠 안에 들어있는 한글이 깨지지 않도록!!
		response.setCharacterEncoding("utf-8");
		
		//클라인트가 전송한 데이터중에 한글이 껴있다면 , 파라미터가 깨지지
		//않도록 처리..
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		PrintWriter out=response.getWriter();
		
		out.print("당신이 넘긴 아이디는 "+id);
		out.print("<br>");
		out.print("당신이 넘긴 비밀번호는 "+pw);
	}	
	
}







