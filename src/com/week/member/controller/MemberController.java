package com.week.member.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//HttpServlet �� ��ӹ޴� ��������, ���������� ����ɼ� �մ�
//������ �ȴ�!!
public class MemberController extends HttpServlet{
	
	//Ŭ���̾�Ʈ��  http ���۹���� post�� ���������� �Ʒ��� �޼��尡
	//���۵ȴ�!!
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}	
	//Ŭ���̾�Ʈ�� post, get�̰� ������� �Ʒ��� �޼��忡�� �����ڵ带 
	//���������!! �̷��� �ϸ� �ڵ� �ߺ��� ���� �� �ִ�
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//����� html ������ �ȿ� ����ִ� �ѱ��� ������ �ʵ���!!
		response.setCharacterEncoding("utf-8");
		
		//Ŭ����Ʈ�� ������ �������߿� �ѱ��� ���ִٸ� , �Ķ���Ͱ� ������
		//�ʵ��� ó��..
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		PrintWriter out=response.getWriter();
		
		out.print("����� �ѱ� ���̵�� "+id);
		out.print("<br>");
		out.print("����� �ѱ� ��й�ȣ�� "+pw);
	}	
	
}







