package user;

public class UserDO {		//POJO 클래스
	//필드(프로퍼티, 중간저장소)
	//Users 컬럼의 갯수만큼 
	private String id;			//아이디
	private String password;	//비밀번호
	private String name;		//이름
	private String role;		//직무
	
	
	//멤버변수 하나당 getter, setter 메소드
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
