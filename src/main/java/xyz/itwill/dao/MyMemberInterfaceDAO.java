package xyz.itwill.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import xyz.itwill.dto.MyMember;
import xyz.itwill.mapper.MyMemberInterfaceMapper;

public class MyMemberInterfaceDAO{
	
	private static MyMemberInterfaceDAO member = new MyMemberInterfaceDAO();
	
	private MyMemberInterfaceDAO() {
		
	}
	
	public static MyMemberInterfaceDAO getMyMember() {
		return member;
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
		SqlSession sqlSession = getSqlSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyMemberInterfaceMapper.class).insertMember(member);
		} finally {
			sqlSession.close();
		}
	}
	
	

}
