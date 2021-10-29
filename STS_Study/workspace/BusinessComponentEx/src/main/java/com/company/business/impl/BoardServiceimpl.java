package com.company.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;
import com.company.business.common.LogAdvice;

/*
 * 구현 클래스이다.
 * 어느 클래스 선언부 위에 @Service 어노테이션을 붙이면
 * 이 클래스는 비지니스 로직을 처리하는 클래스라고 스프링 컨테이너에게 알려준다.
 */

@Service("boardService")
public class BoardServiceimpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	//추가
	private LogAdvice log;
	
	
	//생성자
	public BoardServiceimpl() {
		log = new LogAdvice();	
	}
	
	@Override
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		//추가
		//log.printLog();		//공통부분
		//보안 처리 소스 
		return boardDAO.getBoardList(boardDO);
		//트랜잭션 처리 소스
	}

	@Override
	public BoardDO getBoard(BoardDO boardDO) {
		//log.printLog();		//공통부분
		//return boardDAO.getBoard(boardDO);
		//보안 처리 소스
		return boardDO;
		//트랜잭션 처리 소스
	}

	@Override
	public void insertBoard(BoardDO boardDO) {
		//log.printLog();		//공통부분
		boardDAO.insertBoard(boardDO);
	}

	@Override
	public void updateBoard(BoardDO boardDO) {
		//log.printLog();		//공통부분
		//return boardDAO.updateBoard(boardDO);
	}

	@Override
	public void deleteBoard(BoardDO boardDO) {
		//log.printLog();		//공통부분
		//return boardDAO.deleteBoard(boardDO);
	}

}
