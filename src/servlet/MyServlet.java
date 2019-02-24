/*
 * 자바는 클래스 기반의 언어이므로, javaEE가 웹일지라도 그 근본기술은
 * 클래스이다!! 따라서 웹프로그램도 클래스 기반으로실행된다..
 * 그럼 jsp 의 존재는 무엇인가? 
 *  - jsp도 사실 클래스였다.. 
 *     개발자가 jsp를 작성하면, 컨테이너 서버인 Tomcat 등이 실행전에 
 *     jsp코드를  java의 클래스 변환함...최초에 한번만 , 만약 소스가 변경되면
 *     클래스의 내용을 다시 작성하고 컴파일한다..
 *     
 *     이 수업에서는  서버가 생성하는 서블릿이 아닌, 개발자가 주도하여
 *     서블릿을 정의하고 실행까지 해본다!!
 *     선배개발자들은 서블릿으로 개발함..
 * */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//상속받는 순간부터, 아래의 클래스는 웹서버에서만 실행될 수 있는
//서블릿이 된다!!
//브라우저에서 보여질수 있는 파일은 jpg, html, img,,,클래스는 불가능
//따라서 서블릿 서버측에서 실행되도록 해야 한다, 그리고 그 결과만을 
//받을 수 있다..
public class MyServlet extends HttpServlet{
								/* is a : 자료형이 같다 */
	//서블릿은 클라이언트의 요청을 받기 위한 생명주기 메서드를지원하므로
	//개발자 각 요청 단계마다 적절한 메서드를 오버라이드하면 됨.
	
	//요청을 받는 메서드 정의 
	//클라이언트의 요청이 get --> doGet() 재정의, 
	//post --> doPost() 재정의..
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답정보 객체인 response 출력스트림을 얻어와서 브라우저에 출력
		
		//아래의 코드는 jsp에서의 page 지시영역과 같다!!
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		//아래의 코드는 jsp에서의 out 내장객체와 같다
		PrintWriter out=response.getWriter();
		out.print("나의 첫 서블릿 테스트!! nice!!");
		out.print("<img src='/images/sea.jpg' />");
	}
}







