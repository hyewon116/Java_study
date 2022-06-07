package ch08;

/*
 * StringBuffer : 동적 변경 가능
 * - String의 단점 보완
 * - String은 동적 변경 불가.
 * 
 */

public class Ch08Ex06 {
		
	public static void main(String[] args) {
		
		String str = new String("서울시");
		str.concat(" 마포구"); //일시적 적용 -> str은 변화가 없다. (잠시 붙였을 뿐 다시 돌아옴)
		System.out.println(str); //출력: 서울시
		
		StringBuffer buffer = new StringBuffer("seoul");
		buffer.append(" mapogu"); //문자열의 동적 변화가 일어난다.
		System.out.println(buffer); //출력: seoul mapogu
		
		buffer.reverse(); //글자 거꾸로 
		System.out.println(buffer); //ugopam luoes
		
		buffer.deleteCharAt(0); //특정 번지 글자 삭제
		System.out.println(buffer); //gopam luoes
		
		buffer.insert(5, " city"); //특정 번지에 글자 삽입
		System.out.println(buffer); // gopam city luoes
		
		buffer.substring(0, 5); //gopam city luoes
		System.out.println(buffer); //String의 substring과 같은 결과. (변화 없음)
		System.out.println(buffer.substring(0, 5)); //gopam
		
	}//main

}//class
