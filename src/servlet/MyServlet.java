/*
 * �ڹٴ� Ŭ���� ����� ����̹Ƿ�, javaEE�� �������� �� �ٺ������
 * Ŭ�����̴�!! ���� �����α׷��� Ŭ���� ������ν���ȴ�..
 * �׷� jsp �� ����� �����ΰ�? 
 *  - jsp�� ��� Ŭ��������.. 
 *     �����ڰ� jsp�� �ۼ��ϸ�, �����̳� ������ Tomcat ���� �������� 
 *     jsp�ڵ带  java�� Ŭ���� ��ȯ��...���ʿ� �ѹ��� , ���� �ҽ��� ����Ǹ�
 *     Ŭ������ ������ �ٽ� �ۼ��ϰ� �������Ѵ�..
 *     
 *     �� ����������  ������ �����ϴ� ������ �ƴ�, �����ڰ� �ֵ��Ͽ�
 *     ������ �����ϰ� ������� �غ���!!
 *     ���谳���ڵ��� �������� ������..
 * */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��ӹ޴� ��������, �Ʒ��� Ŭ������ ������������ ����� �� �ִ�
//������ �ȴ�!!
//���������� �������� �ִ� ������ jpg, html, img,,,Ŭ������ �Ұ���
//���� ���� ���������� ����ǵ��� �ؾ� �Ѵ�, �׸��� �� ������� 
//���� �� �ִ�..
public class MyServlet extends HttpServlet{
								/* is a : �ڷ����� ���� */
	//������ Ŭ���̾�Ʈ�� ��û�� �ޱ� ���� �����ֱ� �޼��带�����ϹǷ�
	//������ �� ��û �ܰ踶�� ������ �޼��带 �������̵��ϸ� ��.
	
	//��û�� �޴� �޼��� ���� 
	//Ŭ���̾�Ʈ�� ��û�� get --> doGet() ������, 
	//post --> doPost() ������..
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�������� ��ü�� response ��½�Ʈ���� ���ͼ� �������� ���
		
		//�Ʒ��� �ڵ�� jsp������ page ���ÿ����� ����!!
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		//�Ʒ��� �ڵ�� jsp������ out ���尴ü�� ����
		PrintWriter out=response.getWriter();
		out.print("���� ù ���� �׽�Ʈ!! nice!!");
		out.print("<img src='/images/sea.jpg' />");
	}
}







