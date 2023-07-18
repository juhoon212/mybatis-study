package xyz.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import xyz.itwill.dto.MyUser;
import xyz.itwill.mapper.MyUserMapper;

public class MyUserDAO extends AbstractSession{
	
	private static MyUserDAO _dao = new MyUserDAO();
	
	private MyUserDAO() {
		
	}
	
	public static MyUserDAO getDAO() {
		return _dao;
	}
	
	public int insertUser(MyUser user) {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyUserMapper.class).insertUser(user);
		}finally {
			sqlSession.close();
		}
		
	}
	
	public List<MyUser> selectUserList() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyUserMapper.class).selectUserList();
		} finally {
			sqlSession.close();
		}
	}
	
	
	
	
}
