package ch08;

import java.util.Arrays;

//Arrays.sort(), Arrays.toString()
//Collections.sort(), Collection은 출력시 toString()은 자동
//Comparable의 메소드 compareTo : 자동 정렬 기준
// - 나만의 클래스에 나만의 정렬 기준을 만들려면 
//   -> implements Comparable 
//    -> CompareTo 오버라이드 해야 한다.
public class Ch08Ex03 {
		
	public static void main(String[] args) {
		
		int [] iArr = {11111,2222,3,4444,555};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr); //숫자 정렬 
		System.out.println(Arrays.toString(iArr));
		//=======================================
		String strArr[] = {"hi", "boy", "zombi", "airplane", "world"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr); //알파벳순 정렬
		System.out.println(Arrays.toString(strArr)); 
		//======================================
		Ch08MySortObj1[] sArr1 = {new Ch08MySortObj1("BBB"), new Ch08MySortObj1("AAA")};
		System.out.println(Arrays.toString(sArr1));
	//	Arrays.sort(sArr1); //error
		//======================================
		Ch08MySortObj2 [] sArr2 = {new Ch08MySortObj2(11111,"11111"), 
				new Ch08MySortObj2(2222,"2222"), new Ch08MySortObj2(3,"3"),
				new Ch08MySortObj2(4444,"4444"), new Ch08MySortObj2(555,"555")};
		System.out.println(Arrays.toString(sArr2));
		Arrays.sort(sArr2);
		System.out.println(Arrays.toString(sArr2));
		
	}//main
}//class

class Ch08MySortObj1 {
	String name; 
	Ch08MySortObj1(String str) {
		name = str; //이땐 this 안 붙여도 됨. why? 변수명이 달라서 굳이 구분 안해도 가능. 변수명 같으면 this 써줘야 함.
		//ex) String name; ch~~(String name) -> this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}//class

class Ch08MySortObj2 implements Comparable<Ch08MySortObj2> {//나와 나 자신을 비교. Comparable = interface
	int no; 
	String name; 
	Ch08MySortObj2(int num, String str) {
		no = num;
		name = str;
	}
	@Override
	public int compareTo(Ch08MySortObj2 o) {
		//return type : int : -1(앞으로 이동) 0(제자리) 1(뒤로 이동) 만을 리턴해야 함
		if(this.no > o.no) {
			return 1; //자리 바꿈 : 뒤로 이동
		} else if(this.no < o.no) {
			return -1; //자리 바꿈 : 앞으로 이동
		}
		return 0;
	}
	@Override
	public String toString() {
		return this.name;
	}
}//class






