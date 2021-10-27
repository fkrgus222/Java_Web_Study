package com.company.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	//객체 참조변수 선언
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	//수동으로 필요 메소드 오버라이딩 시키는 방법 => i + ctrl + spacebar => init() 선택
	@Override
	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}
	
    public DispatcherServlet() {
        
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	
	//사용자 정의 메소드 
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//클라이언트의 요청을 받고 응답을 처리할 수 있다.
		//1. 클라이언트의 요청 path 정보 추출
		//(예) "http://localhost:8080/MVC_FW_Board/login.do" 요청을 가정하여 
		String uri = request.getRequestURI();  // --> "/MVC_FW_Board/login.do"를 얻어오게 된다.
		int lastposition = uri.lastIndexOf("/");  // --> 13
		String filePath = uri.substring(lastposition);   //"/login.do"을 얻어옴!
		
		//2. HandlerMapping을 통해서 filePath에 해당하는 Controller를 검색한다.
		Controller ctrl = handlerMapping.getController(filePath);
	
		//3. 검색된 Controller를 실행한다.
		String viewName = ctrl.handleRequest(request,response);
		
		//4.ViewResolver를 통해서 viewName에 해당하는 페이지(포워딩)을 검색한다.
		String view = null;
		
		//로그인 성공 시에는 "getBoardList.do"문자열이 넘어오고,
		//로그인 실패 시에는 "login" 만 넘어온다.
		if(viewName.contains(".do")) {
			view = viewName;
		}else {		//"./login.jsp" 가 된다.
			view = viewResolver.getView(viewName);
		}
		
		//5.페이지 푸워딩
		response.sendRedirect(view);
		
	}
}
