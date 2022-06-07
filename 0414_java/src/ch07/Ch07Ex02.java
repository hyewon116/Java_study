package ch07;

import java.util.ArrayList;

/*
 * List 
 * - interface : 객체 생성(new) 불가 : 자료 저장 구조에 대한 정의
 * - 자료 저장 구조에 대한 정의
 * - 순서 있음 : 순서에 따라 저장하고, 순서에 따라 출력.
 * - 저장 내용의 중복을 허용함.
 * - 길이 개념은 size()
 * - 주소 개념은 0부터 시작 size()-1 에서 종료
 * - sub class : ArrayList, LinkedList, Vector...
 * 
 * ArrayList
 * - 최근 추세는 Generic이 대세
 * - Generic의 탄생 배경을 알려면, Generic 없는 ArrayList를 알아야 함.
 */

public class Ch07Ex02 {

	public static void main(String[] args) {
		
		ArrayList<String> listGStr = new ArrayList<String>(); //Generic Type
//		listGStr.add(1); //error
//		listGStr.add(3.14); //error
//		listGStr.add('A'); //error
//		listGStr.add(true); //error
		listGStr.add("hi");
		
		/*
		 * ArrayList의 일반적인 사용법은 다양한 데이터를 담을 수 있지만,
		 * 원하지 않는 데이터가 섞일 수 있는 의도치 않은 상황이 발생할 수도 있다.
		 *  -> Generic Type의 탄생 배경
		 * Generic Type은 저장할 수 있는 형태를 제한한 용법.
		 */
		ArrayList list1 = new ArrayList();
		list1.add(1); //add : data 추가.
		list1.add(3.14);
		list1.add('A');
		list1.add(true);
		list1.add("hi"); // 노란 줄(이클립스의 경고) : "안전하지 않다"
		System.out.println("size : " + list1.size()); //size : ArrayList의 길이.
		System.out.println("get(0) : " + list1.get(0)); //get : data 추출 
		System.out.println("get(4) : " + list1.get(4)); //get(index number)
		//========================================================
		Object obj = list1.clone(); //clone : 복사. 결과물이 Object. 
		ArrayList list2 = (ArrayList) obj;
		//list1은 사실 Object [] 임. 그래서 type casting 필요
		//=> ArrayList list2 = (ArrayList) list1.clone();
		Object [] objArr = list2.toArray(); //toArray : 배열로 변환
		System.out.println("objArr[4] : " + objArr[4]);
		//** Object???
		//java.lang.object : 모든 class는 Object를 자동 상속
		//collection API : 자료 저장 창고 = 최상위 class Type 
		//                 = Heterogeneous Collection
		//Object [] -> ch06test[0] / String[1] / Integer[2] 
		//ArrayList : Object[0]
		//Object[0] = new String("hi")
		//String str = (String) object[0]
		
		//isEmpty : 비어 있는 ArrayList인가?
		System.out.println("list2.isEmpty() : " + list2.isEmpty());
		
		list2.clear(); // clear : 비워라. 
		System.out.println("clear after isEmpty() : " + list2.isEmpty());
		
		//indexOf : 특정 값의 index 위치. (앞에서 검색)
		System.out.println("indexOf : " + list1.indexOf('A')); //2
		
		//indexOf : 특정 값의 index 위치. (뒤에서 검색-가장 뒤에 있는 3.14값. index번호는 앞에서부터 셈)
		System.out.println("lastindexOf : " + list1.lastIndexOf(3.14)); //1
		
		System.out.println(list1);
		list1.remove(3); //remove:삭제 //3번지 삭제
		list1.remove(3.14); //3.14 삭제
		System.out.println(list1);

	}//main

}//class
