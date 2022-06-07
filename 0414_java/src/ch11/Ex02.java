package ch11;

public class Ex02 {
	public static void main(String[] args) {
		String year = "1994";
		int age = 2022 - Integer.parseInt(year); //숫자와 문자는 연산 불가. 형변환 필요. //자바는 무조건 왼쪽 기준임.
		System.out.println("나이 : " + age);
		System.out.println("==================");
		
		try {
			String year2 = "1994년";
			int age2 = 2022 - Integer.parseInt(year2); //"년"은 숫자 변환 불가능. 오류.
			System.out.println("나이 : " + age2);
		} catch (NumberFormatException e) { //오류에서 나온 이름 사용
			System.out.println("숫자만 넣어주세요.");
		}//catch
		
		System.out.println("수고하셨습니다."); //위에서 오류나면 이것도 출력 x. try catch 후엔 출력. 
		
	}//main
}//class
