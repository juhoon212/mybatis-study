package xyz.itwill.dto;

/**
 * 이름               널?       유형            
---------------- -------- ------------- 
REPLY_NO         NOT NULL NUMBER        - 댓글 번호
REPLY_ID                  VARCHAR2(50)  - 댓글 작성자
REPLY_CONTENT             VARCHAR2(100) - 댓글 내용
REPLY_DATE                DATE          - 댓글 작성일
REPLY_COMMENT_NO          NUMBER   		- 게시글 번호
 * create sequence myreply_seq;
 * 
 *
 */

public class MyReply {
	
	private int replyNo;
	private String replyId;
	private String replyContent;
	private String replyDate;
	private int replyCommentNo;
	
	public MyReply() {
		
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public int getReplyCommentNo() {
		return replyCommentNo;
	}

	public void setReplyCommentNo(int replyCommentNo) {
		this.replyCommentNo = replyCommentNo;
	}
	
	
	
}
