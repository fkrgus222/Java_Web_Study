package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBBean {
	//멤버변수(프로퍼티, 중간 저장소) 선언
	private String mem_id;
	private String mem_passwd;
	private String mem_name;
	private String mem_nickname;
	private String mem_email_id;		//이메일 아이디
	private String mem_email_domain;	//이메일 도메인
	private String mem_num1;			//주민번호 앞자리
	private String mem_num2;			//주민번호 뒷자리
	private String mem_phone;
	private String mem_gender;
	private int mem_Birthday1;			//출생년도
	private int mem_Birthday2;			//출생월
	private int mem_Birthday3;			//출생일
	private String mem_job;
	private String ZipCode;			//우편번호
	private String mem_userAddr1;		//주소
	private String mem_userAddr2;		//상세주소
	private String mem_userAddr3;		//주소 참고항목
	
	//오라클 DB 연동에 관련된 변수 선언
	Connection			conn = null;
	PreparedStatement   pstnt = null;
	ResultSet			rs = null;
	
	//오라클 JDBC 연동을 위한 driver, url 설정     --mysql, mariadb랑 연동할려면 여기만 바꿔주면됨.
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//DB 연동 메소드 구현
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url,"testdb1234","testdb1234");  //connection객체 만듬
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//DB연동 종료 메소드 구현
	public void disconnect() {
		try {
			pstnt.close();
			conn.close();
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//ID 중복 메소드 구현
	public int confirmId(String mem_id) {
		connect();
		int idDuplication = 0; //id 중복 여부 체크 변수
		
		try {
			String Confirmed_SELECT = "select mem_id from member where mem_id=?";
			
			pstnt = conn.prepareStatement(Confirmed_SELECT);
			pstnt.setString(1, mem_id);
			rs = pstnt.executeQuery();
			
			if(rs.next()) {
				idDuplication = 1;   //ID 값이 중복인 경우
			}else {
				idDuplication = -1;   //사용 가능한 ID 인 경우
			}
			
		}catch(Exception e) {
			System.out.println("confirmId() : " + e);
		}finally {
			disconnect();  //자원 해제
		}
		return idDuplication;
	}
	
	//회원가입 폼에서 입려한 데이터를 member 테이블에 저장하는 메소드 구현
	public boolean insertDB() {
		connect();
		
		try {
			String MEMBER_INSERT = "insert into member_values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstnt = conn.prepareStatement(MEMBER_INSERT);
			
			String mem_email = mem_email_id + "@" + mem_email_domain;
			
			pstnt.setString(1, mem_id);
			pstnt.setString(2, mem_passwd);
			pstnt.setString(3, mem_name);
			pstnt.setString(4, mem_nickname);
			pstnt.setString(5, mem_email);
			pstnt.setString(6, mem_num1);
			pstnt.setString(7, mem_num2);
			pstnt.setString(8, mem_phone);
			pstnt.setString(9, mem_gender);
			pstnt.setInt(10, mem_Birthday1);
			pstnt.setInt(11, mem_Birthday2);
			pstnt.setInt(12, mem_Birthday3);
			pstnt.setString(13, mem_job);
			pstnt.setString(14, ZipCode);
			pstnt.setString(15, mem_userAddr1);
			pstnt.setString(16, mem_userAddr2);
			pstnt.setString(17, mem_userAddr3);
			
			pstnt.executeUpdate();  //DML 작업 시에는 executeUpdate() 호출 => insert, update, delete
			
			
		}catch(Exception e) {
			System.out.println("confirmId() : " + e);
		}finally {
			disconnect();  //자원 해제
		}
		return true;
	}
	
	
	//멤머변수 하나당 setter,getter메소드
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_passwd() {
		return mem_passwd;
	}
	public void setMem_passwd(String mem_passwd) {
		this.mem_passwd = mem_passwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_email_id() {
		return mem_email_id;
	}
	public void setMem_email_id(String mem_email_id) {
		this.mem_email_id = mem_email_id;
	}
	public String getMem_email_domain() {
		return mem_email_domain;
	}
	public void setMem_email_domain(String mem_email_domain) {
		this.mem_email_domain = mem_email_domain;
	}
	public String getMem_num1() {
		return mem_num1;
	}
	public void setMem_num1(String mem_num1) {
		this.mem_num1 = mem_num1;
	}
	public String getMem_num2() {
		return mem_num2;
	}
	public void setMem_num2(String mem_num2) {
		this.mem_num2 = mem_num2;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}
	public int getMem_Birthday1() {
		return mem_Birthday1;
	}
	public void setMem_Birthday1(int mem_Birthday1) {
		this.mem_Birthday1 = mem_Birthday1;
	}
	public int getMem_Birthday2() {
		return mem_Birthday2;
	}
	public void setMem_Birthday2(int mem_Birthday2) {
		this.mem_Birthday2 = mem_Birthday2;
	}
	public int getMem_Birthday3() {
		return mem_Birthday3;
	}
	public void setMem_Birthday3(int mem_Birthday3) {
		this.mem_Birthday3 = mem_Birthday3;
	}
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String ZipCode) {
		this.ZipCode = ZipCode;
	}
	public String getMem_userAddr1() {
		return mem_userAddr1;
	}
	public void setMem_userAddr1(String mem_userAddr1) {
		this.mem_userAddr1 = mem_userAddr1;
	}
	public String getMem_userAddr2() {
		return mem_userAddr2;
	}
	public void setMem_userAddr2(String mem_userAddr2) {
		this.mem_userAddr2 = mem_userAddr2;
	}
	public String getMem_userAddr3() {
		return mem_userAddr3;
	}
	public void setMem_userAddr3(String mem_userAddr3) {
		this.mem_userAddr3 = mem_userAddr3;
	}
	
	
	
	
	
}
