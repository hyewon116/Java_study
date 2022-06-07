package ch051.access;

public class DefaultObject {
	
	String defaultStr = "string of default modifiers";
	
	public String defaultStr2 = "string of public modifiers";
	
	void defaultPrint() {
		System.out.println("defaultStr : " + defaultStr);
	}
	
	public void defaultPrint2() {
		System.out.println("defaultStr2 : " + defaultStr2);
	}
	
}//class
