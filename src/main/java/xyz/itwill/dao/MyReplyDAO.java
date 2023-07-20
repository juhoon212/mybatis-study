package xyz.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xyz.itwill.dto.MyReply;
import xyz.itwill.dto.MyReplyUser;
import xyz.itwill.mapper.MyReplyMapper;

public class MyReplyDAO extends AbstractSession{
	
	private static MyReplyDAO myreply = new MyReplyDAO();
	
	private MyReplyDAO() {
		
	}
	
	public static MyReplyDAO getDAO() {
		return myreply;
	}
	
	public int insertReply(MyReply reply) {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyReplyMapper.class).insertReply(reply);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyReply> selectReplyList() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyReplyMapper.class).selectReplyList();
		} finally {
			sqlSession.close();
		}
		
	}
	
	public List<MyReplyUser> selectReplyList1() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyReplyMapper.class).selectReplyUserList1();
		} finally {
			sqlSession.close();
		}
		
	}
	
	public List<MyReplyUser> selectReplyList2() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyReplyMapper.class).selectReplyUserList2();
		} finally {
			sqlSession.close();
		}
		
	}
}
