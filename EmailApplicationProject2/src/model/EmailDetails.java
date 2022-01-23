package model;


public class EmailDetails {
	String emailid;
	String to;
	String from;
	String subject ;
	String emailbody ;
	String compose;
	public EmailDetails() {
		super();
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmailbody() {
		return emailbody;
	}
	public void setEmailbody(String emailbody) {
		this.emailbody = emailbody;
	}
	public String getCompose() {
		return compose;
	}
	public void setCompose(String compose) {
		this.compose = compose;
	}
	


}
