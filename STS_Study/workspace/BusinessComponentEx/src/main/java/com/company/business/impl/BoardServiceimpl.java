package com.company.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;
import com.company.business.common.LogAdvice;

/*
 * ���� Ŭ�����̴�.
 * ��� Ŭ���� ����� ���� @Service ������̼��� ���̸�
 * �� Ŭ������ �����Ͻ� ������ ó���ϴ� Ŭ������� ������ �����̳ʿ��� �˷��ش�.
 */

@Service("boardService")
public class BoardServiceimpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	//�߰�
	private LogAdvice log;
	
	
	//������
	public BoardServiceimpl() {
		log = new LogAdvice();	
	}
	
	@Override
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		//�߰�
		//log.printLog();		//����κ�
		//���� ó�� �ҽ� 
		return boardDAO.getBoardList(boardDO);
		//Ʈ����� ó�� �ҽ�
	}

	@Override
	public BoardDO getBoard(BoardDO boardDO) {
		//log.printLog();		//����κ�
		//return boardDAO.getBoard(boardDO);
		//���� ó�� �ҽ�
		return boardDO;
		//Ʈ����� ó�� �ҽ�
	}

	@Override
	public void insertBoard(BoardDO boardDO) {
		//log.printLog();		//����κ�
		boardDAO.insertBoard(boardDO);
	}

	@Override
	public void updateBoard(BoardDO boardDO) {
		//log.printLog();		//����κ�
		//return boardDAO.updateBoard(boardDO);
	}

	@Override
	public void deleteBoard(BoardDO boardDO) {
		//log.printLog();		//����κ�
		//return boardDAO.deleteBoard(boardDO);
	}

}
