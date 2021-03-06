package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	//H2 DB 연동에 관한 소스
	static final String driver = "org.h2.Driver";
	static final String url = "jdgc:h2:tcp://localhost/~/test";
	
	public static Connection getConnection() throws Exception{
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, "sa", "");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//DML(Insert, Update, Delete) 작업 종료 시 호출되는 메소드
	public static void close(PreparedStatement pstnt, Connection conn) {
		if(pstnt != null) {
			try {
				if(!pstnt.isClosed()) pstnt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstnt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	//Select 작업이 종료되었을때
	public static void clse(ResultSet rs, PreparedStatement pstnt, Connection conn) {
		if(rs != null) {
			try {
				if(!rs.isClosed()) pstnt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		
		if(pstnt != null) {
			try {
				if(!pstnt.isClosed()) pstnt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				pstnt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	
	
	
	
}
