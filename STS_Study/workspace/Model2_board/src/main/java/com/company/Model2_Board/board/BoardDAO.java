package com.company.Model2_Board.board;

 

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;

 

import com.company.Model2_Board.board.BoardDO;

import com.company.Model2_Board.common.JDBCUtil;

 

public class BoardDAO {

	//�Խñ۹�ȣ ���ǿ� �´� �ش� �Խñ۸� �˻��ϴ� �޼ҵ�
	
	public BoardDO getBoard(BoardDO boardDO) {
	
		System.out.println("===> getBoard() ó����!");
	
		
	
		BoardDO board = null;
	
		
	
		try {
	
			conn = JDBCUtil.getConnction();
	
			
	
			//[�߿�] �ش� �Խñ��� ��ȸ��(cnt)�� 1���� ��Ų��.
	
			String UPDATE_CNT = "update board set cnt=cnt+1 where seq=?";
	
			pstmt = conn.prepareStatement(UPDATE_CNT);
	
			pstmt.setInt(1, boardDO.getSeq());
	
			pstmt.executeUpdate();   //DML �۾� �ÿ��� executeUpdate() �޼ҵ� ȣ��
	
			
	
			//�׷� ���� �ش� �Խñ� ��������
	
			String BOARD_GET = "select * from board where  seq=?";
	
			pstmt = conn.prepareStatement(BOARD_GET);
	
			pstmt.setInt(1, boardDO.getSeq());
	
			rs = pstmt.executeQuery();
	
			
	
			if(rs.next()) {
	
				board = new BoardDO();
	
				
	
				board.setSeq(rs.getInt("SEQ"));
	
				board.setTitle(rs.getString("TITLE"));
	
				board.setWriter(rs.getString("WRITER"));
	
				board.setContent(rs.getString("CONTENT"));
	
				board.setRegdate(rs.getDate("REGDATE"));
	
				board.setCnt(rs.getInt("CNT"));
	
			}
	
		}catch(Exception e) {
	
			e.printStackTrace();
	
		}finally {
	
			JDBCUtil.close(rs, pstmt, conn);
	
		}
	
		return board;
	
	} //end getBoard() ===============================================



	//DB ���� ���� ����

	private Connection conn = null;

	private PreparedStatement pstmt = null;

	private ResultSet rs = null;

	

	//��ü �Խñ� ��� ��ȸ �޼ҵ�

	public List<BoardDO> getBoardList(String searchField, String searchText){

		System.out.println("===> getBoardList() ��� ó����!");

		

		List<BoardDO> boardList = new ArrayList<BoardDO>();  //���� �迭 ��ü ����

		

		try {

			conn = JDBCUtil.getConnction();

			

			/*

			 * [�߿�] �Խù� �˻� �� => '����' or '�ۼ���'�� �˻� ���� �����ϴ� SQL ������ ��� �ۼ�?

			 *       �ϳ��� SQL������ �� ���� �뵵�� �����!!

			 *       

			 *       "select * from board " + where + " order by seq desc";			       

			 *       �˻� ������ ���� ���� ��� ���ڵ带 �˻��ϰ�,

			 *       �˻� ������ �Ű������� �Ѿ�� ��쿡��  ���ǿ� �����ϴ� ���ڵ常 �˻��ϰڴ�.

			 */

			String where = "";

 

			if(searchField != null &&  searchText != null) {

			     where = "where " + searchField + " like '%"+searchText+ "%'";

			}

			String Condition_SQL = "select * from board " + where + " order by seq desc";

			

			pstmt = conn.prepareStatement(Condition_SQL);

			rs = pstmt.executeQuery();

			

			while(rs.next()) {

				BoardDO board = new BoardDO();

				board.setSeq(rs.getInt("SEQ"));

				board.setTitle(rs.getString("TITLE"));

				board.setWriter(rs.getString("WRITER"));

				board.setContent(rs.getString("CONTENT"));

				board.setRegdate(rs.getDate("REGDATE"));

				board.setCnt(rs.getInt("CNT"));

				

				boardList.add(board);

			}			

		}catch(Exception e) {

			e.printStackTrace();

		}finally {

			JDBCUtil.close(rs, pstmt, conn);

		}

		return boardList;

	} //end getBoardList() ==================================================

	

	//�Խñ� ���� ó�� �޼ҵ�

	public void updateBoard(BoardDO boardDO) {

		System.out.println("===> updateBoard() ó����!");

		

		try {

			conn = JDBCUtil.getConnction();

			

			String BOARD_UPDATE = "update board set title=?, content=? where seq=?";

			

			pstmt = conn.prepareStatement(BOARD_UPDATE);

			pstmt.setString(1, boardDO.getTitle());

			pstmt.setString(2, boardDO.getContent());

			pstmt.setInt(3, boardDO.getSeq());

			

			pstmt.executeUpdate();

		}catch(Exception e) {

			e.printStackTrace();

		}finally {

			JDBCUtil.close(pstmt, conn);

		}

	} //end updateBoard() ==================================================

	

	//�Խñ� ���� ó�� �޼ҵ�

	public void deleteBoard(BoardDO boardDO) {

		System.out.println("===> deleteBoard() ó����!");

		

		try {

			conn = JDBCUtil.getConnction();

			

			String BOARD_DELETE = "delete from board where seq=?";

			

			pstmt = conn.prepareStatement(BOARD_DELETE);			

			pstmt.setInt(1, boardDO.getSeq());			

			pstmt.executeUpdate();

		}catch(Exception e) {

			e.printStackTrace();

		}finally {

			JDBCUtil.close(pstmt, conn);

		}

	}// end deleteBoard() ===============================================

	

	public void insertBoard(BoardDO boardDO) {

		System.out.println("===> insertBoard() ó����!");

		

		try {

			conn = JDBCUtil.getConnction();

			

			String BOARD_INSERT 

			    = "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board),?,?,?)";

			pstmt = conn.prepareStatement(BOARD_INSERT);

			pstmt.setString(1, boardDO.getTitle());

			pstmt.setString(2, boardDO.getWriter());

			pstmt.setString(3, boardDO.getContent());

			

			pstmt.executeUpdate();

		}catch(Exception e) {

			e.printStackTrace();

		}finally {

			JDBCUtil.close(pstmt, conn);

		}

	}

}