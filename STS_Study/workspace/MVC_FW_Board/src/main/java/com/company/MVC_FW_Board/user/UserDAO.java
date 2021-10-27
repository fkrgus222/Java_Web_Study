package com.company.MVC_FW_Board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.MVC_FW_Board.common.JDBCUtil;


public class UserDAO {
	// DB ���� ���� ����
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// SQL ��ɾ�
	private final String USER_GET = "select id, password from users where id= ? and password = ?";
	
	// �α��� user ��ȸ(select) �޼ҵ� ����
	public UserDO getUser(UserDO userObj) {
		UserDO user = null;
		
		try {
			System.out.println("===> JDBC�� getUser() ��� ó��");
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, userObj.getId());
			pstmt.setString(2, userObj.getPassword());
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
	}
}