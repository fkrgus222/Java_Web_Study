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
	
	//������
	public HandlerMapping() {
		//�ڷᱸ�� => HashMap ��ü ����
		mappings = new HashMap<String, Controller>();
		
		//key �� longin.do ���� LoginController()
		//login.do�� ������ LoginController�� ó�������~
		
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardController());
		mappings.put("/getBoard.do", new GetBoardListController());
		mappings.put("/updateBoard.do",new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do",new LogoutController());
		
	}
	
	//����� ���� �޼ҵ� ����
	public Controller getController(String path) {
		//�Ű������� path�� login.do�� ���� path�̴�.	
		//mappings.get(key)�� LoginController���� ���� ����.
		
		return mappings.get(path);
	}
	
}
