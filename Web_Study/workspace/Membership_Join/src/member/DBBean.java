package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBBean {
	//�������(������Ƽ, �߰� �����) ����
	private String mem_id;
	private String mem_passwd;
	private String mem_name;
	private String mem_nickname;
	private String mem_email_id;		//�̸��� ���̵�
	private String mem_email_domain;	//�̸��� ������
	private String mem_num1;			//�ֹι�ȣ ���ڸ�
	private String mem_num2;			//�ֹι�ȣ ���ڸ�
	private String mem_phone;
	private String mem_gender;
	private int mem_Birthday1;			//����⵵
	private int mem_Birthday2;			//�����
	private int mem_Birthday3;			//�����
	private String mem_job;
	private String ZipCode;			//�����ȣ
	private String mem_userAddr1;		//�ּ�
	private String mem_userAddr2;		//���ּ�
	private String mem_userAddr3;		//�ּ� �����׸�
	
	//����Ŭ DB ������ ���õ� ���� ����
	Connection			conn = null;
	PreparedStatement   pstnt = null;
	ResultSet			rs = null;
	
	//����Ŭ JDBC ������ ���� driver, url ����     --mysql, mariadb�� �����ҷ��� ���⸸ �ٲ��ָ��.
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//DB ���� �޼ҵ� ����
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url,"testdb1234","testdb1234");  //connection��ü ����
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//DB���� ���� �޼ҵ� ����
	public void disconnect() {
		try {
			pstnt.close();
			conn.close();
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//ID �ߺ� �޼ҵ� ����
	public int confirmId(String mem_id) {
		connect();
		int idDuplication = 0; //id �ߺ� ���� üũ ����
		
		try {
			String Confirmed_SELECT = "select mem_id from member where mem_id=?";
			
			pstnt = conn.prepareStatement(Confirmed_SELECT);
			pstnt.setString(1, mem_id);
			rs = pstnt.executeQuery();
			
			if(rs.next()) {
				idDuplication = 1;   //ID ���� �ߺ��� ���
			}else {
				idDuplication = -1;   //��� ������ ID �� ���
			}
			
		}catch(Exception e) {
			System.out.println("confirmId() : " + e);
		}finally {
			disconnect();  //�ڿ� ����
		}
		return idDuplication;
	}
	
	//ȸ������ ������ �Է��� �����͸� member ���̺� �����ϴ� �޼ҵ� ����
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
			
			pstnt.executeUpdate();  //DML �۾� �ÿ��� executeUpdate() ȣ�� => insert, update, delete
			
			
		}catch(Exception e) {
			System.out.println("confirmId() : " + e);
		}finally {
			disconnect();  //�ڿ� ����
		}
		return true;
	}
	
	
	//��Ӻ��� �ϳ��� setter,getter�޼ҵ�
	
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
