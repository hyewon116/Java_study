package ch02;

/*
 * equals : 문자열을 비교하는 메소드  
 */
public class Ch02Ex17 {

	public static void main(String[] args) {
		
		int iVar1 = 777;
		int iVar2 = 777;
		System.out.println("primitive : " + (iVar1 == iVar2));
				
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("String : " + (str1 == str2));
		// 둘은 좌표값(위치값)이 다름. 둘은 같지 않음.
		
		String str3 = "hello";
		String str4 = "hello";
		System.out.println("Another String : " + (str3 == str4));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		String str5= "Hello"; 
		System.out.println("str1.equals(str5) : " + str1.equals(str5));
		System.out.println("str1.equalsIgnoreCase(str5) : " + str1.equalsIgnoreCase(str5)); 

	}//main

}//class
