package ch07;

import java.util.HashMap;

/* Map 
*  - interface : 객체 생성(new) 불가.
*  - 자료 저장 구조에 대한 정의.
*  - key-value(이름-내용물) 한 쌍으로 저장.
*  - 순서 필요 없음 : key에 따라 저장하고, key에 따라 출력.
*  - 저장 key의 중복은 안됨!! 내용 중복 허용.
*    -> why? 데이터를 꺼낼 때, key로 꺼낸다.
*  - sub class : HashMap...
*  
*  HashMap
*  - 최근 추세는 Generic이 대세.
*/

public class Ch07Ex03 {

	public static void main(String[] args) {

		HashMap map1 = new HashMap(); //Map을 상속받은 HashMap은 new 사용 가능
		map1.put("first", 1); //put: data 저장 //(key,value)// key: 숫자, 문자 가능 
		map1.put("second", 3.14);
		map1.put("third", 'A');
		map1.put(4, false); //아래와 동일 key, 중복 제거
		map1.put(4, true); //위와 동일 key, 뒤의 값이 남음.
		map1.put(5, "hello");
		map1.put(6, 3.14);
		System.out.println(map1.size()); //size: 저장된 객체 갯수 = 6 //중복은 제거됨.
		//==========================================================
		System.out.println(map1); //순서 없이 저장, key 중복 허용 안함.
		System.out.println(map1.keySet()); //★keySet : 이름만 가져온다.
		System.out.println(map1.values()); //values : 내용만 가져온다.
		//==========================================================
		System.out.println("get(\"third\") : " + map1.get("third")); 
		System.out.println("get(5) : " + map1.get(5)); //get : 이름을 통해 내용을 가져온다.
		//==========================================================
		Object obj = map1.clone();
		HashMap map2 = (HashMap) obj;
		System.out.println("map2 : " + map2);
		//==========================================================
		System.out.println("isEmpty : " + map2.isEmpty()); //isEmpty : 비어 있는가?
		map2.remove("third"); //remove : 이름(key)으로 내용 지울 수 있음
		map2.remove(5); 
		System.out.println("map2 : " + map2);
		map2.clear(); //clear : 모두 삭제
		System.out.println("clear after isEmpty : " + map2.isEmpty());
			
	}//main
}//class
