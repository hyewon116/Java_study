package ch02;
/*
 * 
 * 길이값 : length : 1부터 시작
 * 위치값 : index : 0부터 시작
 * 예) hello - 길이는? 5
 * 예) hello - o의 위치값은? 4
 */
public class Ch02Ex16 {
	public static void main(String[] args) {
		
		String str = "nice to meet you, too.";
		System.out.println(str.length()); //22
		System.out.println(str.indexOf('.'));//21
		//작은 따옴표는 문자 하나(char data type)
		//큰 따옴표는 문자열(String type)
		//글자의 갯수와 상관 없이 쌍따옴표면 무조건 문자열 
		
		System.out.println(str.indexOf('e'));//3번지
		//e가 여러개인데 하나의 값만 추출. 
		//why? indexOf = 좌에서 우로 검색. 맨 앞 값만 검출
		System.out.println(str.lastIndexOf('e'));//10
		//lastIndexOf = 우에서 좌로 검색.(=뒤에서 앞으로)
		
		//charAt : 특정 위치값의 문자를 가져온다.
		System.out.println(str.charAt(1));//i
		System.out.println(str.indexOf("you"));//
		
	}//main
}//class

