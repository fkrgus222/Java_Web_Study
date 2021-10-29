package com.company.business.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ���� Ŭ���� 
 */

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. ������ �����̳� ����
		AbstractApplicationContext container
			 = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)container.getBean("boardService");

		
		//2.�Խñ� ��� �׽�Ʈ
		BoardDO boardDO = new BoardDO();
		boardDO.setTitle("������ ������̼� ��� ����");
		boardDO.setWriter("������");
		boardDO.setContent("������̼� ���� �н�");
		boardService.insertBoard(boardDO);
		
		//3.�Խñ� ��ü ��� ���⸦ �ܼ�â���� Ȯ�ο�!
		List<BoardDO> boardList = boardService.getBoardList(boardDO);
		
		for(BoardDO board : boardList) {
			System.out.println("---> " +  board.toString() );
		}
		
		//4. ������ �����̳� ����
		container.close();
		
	}

}