package xyz.itwill.dto;

/**
이름      널?       유형            
------- -------- ------------- 
ID      NOT NULL VARCHAR2(50)  
NAME             VARCHAR2(50)  
PHONE            VARCHAR2(20)  
EMAIL            VARCHAR2(100) 
 */


public class MyMember {
	private String id;
	private String name;
	private String phone;
	private String email;

	
	public MyMember() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	
}
