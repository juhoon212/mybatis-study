package xyz.itwill.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import xyz.itwill.dto.MyMember;

public class MyMemberDAO {
	
	private static MyMemberDAO myMember = new MyMemberDAO();
	
	private MyMemberDAO() {
		
	}
	
	public static MyMemberDAO getMember() {
		return myMember;
	}
	
	private SqlSessionFactory getSqlSessionFactory() {
		//mybatis 환경설정파일을 패키지에 작성한 경우 파일 시스템 경로로 표현
		//String resource="xyz/itwill/config/mybatis-config.xml";
		String resource="mybatis-config.xml";
		
		InputStream inputStream=null;
		try {
			//mybatis 환경설정파일을 읽기 위한 입력스트림을 반환받아 저장
			//Resources.getResourceAsStream(String resource) : 매개변수에 mybatis 환경설정파일
			//경로를 전달받아 파일 입력스트림을 생성하여 반환하는 메소드
			inputStream=Resources.getResourceAsStream(resource);
		} catch (IOException e) {//mybatis 환경설정파일이 없는 경우 예외 발생
			throw new IllegalArgumentException(e);
		}
		
		//SqlSessionFactoryBuilder.build(InputStream inputStream) : 매개변수로 mybatis 환경
		//설정파일의 입력스트림을 전달받아 SqlSessionFactory 객체를 생성하여 반환하는 메소드
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public int insertMember(MyMember member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			//SqlSession.insert(String elementId, Object parameterValue) : 매퍼에 등록된 
			// insert 엘리먼트의 SQL 명령(insert)을 제공받아 DBMS 서버에 전달하여 실행하고
			// 삽입행의 갯수를 제공받아 반환하는 메소드
			// => elementId: SQL 명령이 등록된 매퍼와 엘리먼트의 식별자를 문자열로 표현하여
			// => parameterValue : SQL 명령 작성에 필요한 값(객체)를 전달 - paramaterType 속성
			int rows = sqlSession.insert("MyMemberXMLMapper.insertMember", member);
			
			//mybatis 프레임워크는 기본적으로 AutoCommit기능을 비활성화 처리하고 SQL 명령을
			//DBMS 서버에 전달하여 실행
			// => DML 명령을 DBMS 서버에 전달하여 실행한 경우 반드시 커밋 또는 롤백 처리
			if(rows > 0) {
				// SqlSession.commit() : 트랜잭션 적용 명령(commit)을 DBMS 서버에 전달하여 실행
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
			
			return rows;
		} finally {
			sqlSession.close();
		}
	}
	
	// 회원정보를 전달받아 MYMEMBER 테이블에 저장된 회원정보를 변경하고 변경행의 갯수를 반환
	public int updateMember(MyMember member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(true); // false면 AutoCommit 비활성화(default값)
		
		try {
			
			return sqlSession.update("MyMemberXMLMapper.updateMember", member);
		} finally {
			sqlSession.close();
		}
		
		
	}
	
	public int deleteMember(MyMember member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(true); // false면 AutoCommit 비활성화(default값)
		
		try {
			
			return sqlSession.update("MyMemberXMLMapper.deleteMember", member);
		} finally {
			sqlSession.close();
		}
		
		
	}
	
	public MyMember selectMember(String id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			return sqlSession.selectOne("MyMemberXMLMapper.selectMember", id);
			
		}finally {
			sqlSession.close();
		}
		
	}
	
	public List<MyMember> selectMemberList() {
		SqlSession sqlSession = getSqlSessionFactory().openSession(true);
		
		 try {
			 return sqlSession.selectList("MyMemberXMLMapper.selectMemberList");
		 } finally {
			 sqlSession.close();
		 }
	}
}
