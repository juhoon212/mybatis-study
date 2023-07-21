package xyz.itwill.dto;

import java.io.Serializable;

/**
 * 
 * 이름              널?       유형            
--------------- -------- ------------- 
COMMENT_NO      NOT NULL NUMBER        - 게시글 번호
COMMENT_ID               VARCHAR2(20)  - 게시글 작성자
COMMENT_CONTENT          VARCHAR2(100) - 게시글 내용
COMMENT_DATE             DATE 			- 게시글 작성일
 *
 * create sequence mycomment_seq;
 * 
 * MYCOMMENT_SEQ : MYCOMMENT 테이블의 COMMENT_NO 컬럼값으로 저장될 자동 증가값을 제공하는 시퀀스
 */

// 클래스의 필드명을 테이블의 컬럼명과 같은 이름으로 작성한 클래스
public class MyComment1{

	private int commentNo;
	private String commentId;
	private String commentContent;
	private String commentDate;
	
	public MyComment1() {
		
	}
	
	

	public MyComment1(int commentNo, String commentId, String commentContent, String commentDate) {
		this.commentNo = commentNo;
		this.commentId = commentId;
		this.commentContent = commentContent;
		this.commentDate = commentDate;
	}



	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	
	
	

}
