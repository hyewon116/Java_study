package ch02;

/*
 * substring : 문자열 자르기 
 * - 본판 불변의 법칙 : 변환한 결과는 저장하지 않으면 사라진다.
 * split : 문자열 나누기 
 */
public class Ch02Ex19 {

	public static void main(String[] args) {
		
		String str = "nice to meet you, too.";
		System.out.println(str.substring(6)); //6번지에서 끝까지 자른 결과를 출력 = o meet you, too.
		System.out.println(str.substring(6,14)); //6번지에서 14번지 앞까지 잘라 출력 = o meet y
		//substring(6,14) : 6번지 포함, 14번지 풀포함 : 앞번지 포함. 뒷번지 불포함
		System.out.println("원본 : " + str);//본래 데이터는 변하지 않는다.
		
		String [] sArray = str.split("o"); // ()안의 값을 기준으로 나눔 
		//("") = 공백을 기준으로 나눔 //("o") = o를 기준으로 문장을 나눔
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		System.out.println(sArray[3]);
		System.out.println(sArray[4]);
		System.out.println("원본 : " + str);//본래 데이터는 안 변함

	}//main

}//class
