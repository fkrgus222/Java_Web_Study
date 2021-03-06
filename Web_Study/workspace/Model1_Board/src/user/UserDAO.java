package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.JDBCUtil;


public class UserDAO {
	//DB 관련 변수 선언
	private Connection			conn = null;
	private PreparedStatement 	pstnt = null;
	private ResultSet 			rs = null;
	
	//SQL 명령어
	private final String USER_GET 
		= "select id, password from users where id = ? and password = ?";
	
	//로그인 user 조회(select) 메소드 구현 
	public UserDO getUser(UserDO userObj) {
		UserDO user = null;
		
		try {
			System.out.println("===> JDBC로 getUser() 기능 처리됨!");
			conn = JDBCUtil.getConnection();
			pstnt = conn.prepareStatement(USER_GET);
			pstnt.setString(1, userObj.getId());    //첫번재 ? 값
			pstnt.setString(2, userObj.getPassword());
			
			rs = pstnt.executeQuery();
			
			if(rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
				user.setPassword("PASSWORD");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.clse(rs, pstnt, conn);
		}
		
		return user;
	}
	
	
}
