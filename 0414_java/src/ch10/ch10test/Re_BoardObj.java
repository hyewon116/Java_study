package ch10.ch10test;

public class Re_BoardObj {

	String title;
	String writer;
	String cnt;
	
	Re_BoardObj() {}
	Re_BoardObj(String s1, String s2, String s3) {
		this.title = s1;
		this.writer = s2;
		this.cnt = s3;
	}
	@Override
	public String toString() {
		return "제목 : " + title 
				+ ", 작성자 : " + writer 
				+ ", 내용 : " + cnt;
	}
	
}
