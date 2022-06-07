package ch02;
/*
 * concat : 문자열 이어 붙이기
 * . : ~의 내부에 있는 
 * str1.concat : String이 가지고 있는 기본 기능 
 */
public class Ch02Ex15 {
	public static void main(String[] args) {
		
		String str1 = "서울특별시";
		String str2 = "마포구";
		String str3 = "대흥동";
		System.out.println(str1.concat(str2).concat(str3));
		System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3));//concat은 실제로 잘 쓰지 않음
		System.out.println("거구장".concat(" ").concat("3층"));
		System.out.println("거구장" + " "+ "3층");
		System.out.println(str1+str2+str3);
		System.out.println(str1+" "+str2+" "+str3); // 문자는 - * / 는 불가
	}//main
}//class
