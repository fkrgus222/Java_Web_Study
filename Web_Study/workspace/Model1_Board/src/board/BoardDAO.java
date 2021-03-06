package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.JDBCUtil;

public class BoardDAO {
	
	//DB 관련 변수 선언
	private Connection conn = null;
	private PreparedStatement pstnt = null;
	private ResultSet rs = null;
	
	//전체 게시글 목록 조회 메소드
	public List<BoardDO> getBoardList(String searchField, String searchText){
		System.out.println("===> getBoardList() 기능 처리됨!");
		
		List<BoardDO> boardList = new ArrayList<BoardDO>(); //가변 배열 객체 생성
		
		try {
			conn = JDBCUtil.getConnection();
			
			/*
			 * [중요] 게시물 검색 시 => '제목' 검색 혹은 '작성자' 검색 조건 제시하는 SQL문장을 어떻게 작성?
			 */
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		
	}
}
