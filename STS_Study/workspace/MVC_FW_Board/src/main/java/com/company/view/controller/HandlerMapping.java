package com.company.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.company.view.board.DeleteBoardController;
import com.company.view.board.GetBoardController;
import com.company.view.board.GetBoardListController;
import com.company.view.board.UpdateBoardController;
import com.company.view.user.LoginController;
import com.company.view.user.LogoutController;

public class HandlerMapping {

	private Map<String, Controller> mappings;
	
	//생성자
	public HandlerMapping() {
		//자료구조 => HashMap 객체 생성
		mappings = new HashMap<String, Controller>();
		
		//key 가 longin.do 값이 LoginController()
		//login.do가 들어오면 LoginController가 처리해줘라~
		
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardController());
		mappings.put("/getBoard.do", new GetBoardListController());
		mappings.put("/updateBoard.do",new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do",new LogoutController());
		
	}
	
	//사용자 정의 메소드 구현
	public Controller getController(String path) {
		//매개변수인 path인 login.do와 같은 path이다.	
		//mappings.get(key)가 LoginController같은 것을 리턴.
		
		return mappings.get(path);
	}
	
}
