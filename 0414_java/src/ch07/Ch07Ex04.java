package ch07;

import java.util.HashSet;

/*
 * Set
 * - interface : 객체 생성(new) 불가.
 *  - 자료 저장 구조에 대한 정의.
 *  - 순서 없음
 *  - 중복 없음
 *  - sub class : HashSet...
 * 
 *  HashSet
 *  - 최근 추세는 Generic이 대세.
 */

public class Ch07Ex04 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(1); //add : data 추가
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add(true); //중복 허용 안함
		set.add("hello");
		System.out.println("set: " + set);
		System.out.println("size: " + set.size());
		//size : 저장된 데이터의 개수 = set의 크기 = 길이.
		System.out.println("contains(3.14) : " + set.contains(3.14));
		//contains : 특정 값이 들어 있는지 확인 (true/false)
		
		Object obj = set.clone(); //clone : 복제
		HashSet set2 = (HashSet) obj;
		
		System.out.println("isEmpty : " + set.isEmpty()); //false
		System.out.println("set2: " + set2);
		
		set2.remove(3.14); //remove : 삭제
		System.out.println("set2: " + set2);
		
		set2.clear();//clear : 모두 삭제
		System.out.println("set2: " + set2);
		
	}//main
}//class
