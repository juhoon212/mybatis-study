package xyz.itwill.dto;

public class MyReplyUser {
	
	private MyUser user;
	private MyReply reply;
	
	public MyReplyUser() {
		
	}

	public MyUser getUser() {
		return user;
	}

	public void setUser(MyUser user) {
		this.user = user;
	}

	public MyReply getReply() {
		return reply;
	}

	public void setReply(MyReply reply) {
		this.reply = reply;
	}
	
	
}
