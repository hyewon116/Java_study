package ch02;

/*
 * replace : 문자열 바꾸기
 *  - 본판 불변의 법칙 : replace로 변환한 결과는 저장하지 않으면 사라진다.
 */
public class Ch02Ex18 {

	public static void main(String[] args) {
		
		String str = "nice to meet you, too.";
		System.out.println(str.replace("you", "u~~")); //일회성 변화
		System.out.println(str); //본래 데이터는 변화하지 않는다.
		
		System.out.println(str.replace("o", "A")); //전부 바뀐다, 일회성 변화
		System.out.println(str.replaceAll("o", "E")); //전부 바뀐다, 일회성 변화
		System.out.println("원본 : " + str);//본래 데이터는 변하지 않는다.
		
		String str2 = str.replace("you","u~~");//변경 저장본. 
		System.out.println("변경 저장본 : " + str2);
			
	}//main

}//class
