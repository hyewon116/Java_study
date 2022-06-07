package ch10.ch10test;

public class BoardObj {
	
	private String title; //여긴 왜 private???
	private String writer; 
	private String cnts;
	
	BoardObj() {}
	BoardObj(String s1, String s2, String s3) {
		this.title = s1;
		this.writer = s2;
		this.cnts = s3;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title 
				+ ", 작성자 : " + writer 
				+ ", 내용 : " + cnts;
	}
	
//	//generate getter and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCnts() {
		return cnts;
	}
	public void setCnts(String cnts) {
		this.cnts = cnts;
	}

	
	
}//class
