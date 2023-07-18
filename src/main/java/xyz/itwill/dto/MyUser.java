package xyz.itwill.dto;

/**
 * 
 * 
 * 이름        널?       유형           
--------- -------- ------------ 
USER_ID   NOT NULL VARCHAR2(50) 
USER_NAME          VARCHAR2(50) 
 * MyUser 테이블: 회원정보를 저장하기 위한 테이블
 * => SQL 명령은 대소문자를 구분하지 않기 때문에 식별자를 선언할때 스네이크 표기법 사용
 * 
 */


// Java 자료형(Class, Interface, Enum)을 선언할 경우에는 파스칼 표기법 사용
// => 파스칼 표기법(PascalCase) : 모든 단어의 첫 문자를 대문자로 표현하여 식별자를 선언하는 방법
public class MyUser {
	// Java 자료형을 제외한 식별자는 카멜 표기법 사용
	// => 카멜 표기법(CamelCase) : 첫 단어를 제외한 나머지 단어의 첫 문자를 대문자로 표현하여 식별
	
	private String userId;
	private String userName;
	
	public MyUser() {
		
	}
	
	

	public MyUser(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
