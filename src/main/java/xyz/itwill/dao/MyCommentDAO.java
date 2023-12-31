package xyz.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import xyz.itwill.dto.MyComment1;
import xyz.itwill.dto.MyComment2;
import xyz.itwill.dto.MyComment3;
import xyz.itwill.dto.MyCommentReply;
import xyz.itwill.dto.MyReply;
import xyz.itwill.mapper.MyCommentMapper;

public class MyCommentDAO extends AbstractSession{
	
	private static MyCommentDAO _comment = new MyCommentDAO();
	
	private MyCommentDAO() {
		
	}
	
	public static MyCommentDAO getComment() {
		return _comment;
	}
	
	public int insertComment(MyComment1 comment) {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).insertComment1(comment);
		} finally {
			sqlSession.close();
		}
	}
	
	public int insertComment2(MyComment1 comment) {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyCommentMapper.class).insertComment2(comment);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment1> selectCommentList() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList1();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment2> selectCommentList2() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList2();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyComment3> selectCommentList3() {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentList3();
		} finally {
			sqlSession.close();
		}
	}
	
	public MyComment1 selectComment(int commentNo) {
		SqlSession sqlSession=getSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectComment(commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<MyReply> selectCommentNoReplyList(int commentNo) {
		SqlSession sqlSession=getSessionFactory().openSession(true);
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentNoReplyList(commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public MyCommentReply selectCommentReply(int commentNo) {
		SqlSession sqlSession = getSessionFactory().openSession(true);
		
		try {
			return sqlSession.getMapper(MyCommentMapper.class).selectCommentReply(commentNo);
		}finally {
			sqlSession.close();
		}
	}
	
	
	
	
}
