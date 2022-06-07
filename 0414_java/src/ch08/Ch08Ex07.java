package ch08;

/*
 * StringBuilder
 *  - StringBuffer와 마찬가지로 문자열을 동적 변경한다. 
 */
public class Ch08Ex07 {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("seoul");
		builder.append(" mapo");
		System.out.println(builder); //seoul mapo
		
		builder.insert(5, "<city>");
		System.out.println(builder); //seoul<city> mapo
		
		builder.setCharAt(5, ' '); //character라서 한 글자만!!
		System.out.println(builder); //seoul city> mapo
		
		builder.setLength(50); //길이 세팅 
		System.out.println("[" + builder + "]"); //[seoul city> mapo                         ]
		
		builder.subSequence(0, 7);
		System.out.println("[" + builder + "]"); //동적 변화 x 
		System.out.println(builder.subSequence(0, 7)); //seoul c
		
		
		
	}//main

}//class
