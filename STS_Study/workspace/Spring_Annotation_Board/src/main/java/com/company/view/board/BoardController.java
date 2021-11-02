package com.company.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.annotation.board.BoardDAO;
import com.company.annotation.board.BoardDO;

@Controller
public class BoardController {

	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDO boardDO, BoardDAO boardDAO, Model model,
							String searchField, String searchText) {
		
		model.addAttribute("boardList", boardDAO.getBoardList(searchField, searchText));
		return "getBoardList.jsp";
	}
	
	//게시글 상세보기
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDO boardDO, BoardDAO boardDAO, Model model) {
		
		//model 객체는 select 작업일때 필요하다. 
		model.addAttribute("board",boardDAO.getBoard(boardDO));
		
		return "getBoard.jsp";
		
	}
	
	//게시글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDO boardDO, BoardDAO boardDAO) {
		
		boardDAO.insertBoard(boardDO);
		
		return "getBoardList.do";
	}
	
	
	
}
