package xyz.itwill.dto;

import java.util.List;

public class MyCommentReply {
	
	private int commentNo;
	
	private MyComment1 comment;
	
	private List<MyReply> replyList;
	
	public int getCommentNo() {
		return this.commentNo;
	}
	
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	
	public MyCommentReply() {
		
	}

	public MyComment1 getComment() {
		return comment;
	}

	public void setComment(MyComment1 comment) {
		this.comment = comment;
	}

	public List<MyReply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<MyReply> replyList) {
		this.replyList = replyList;
	}
	
	
}
