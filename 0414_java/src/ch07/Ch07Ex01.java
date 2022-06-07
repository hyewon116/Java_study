package ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Overview
 */
/*
 * Collection API : 집합 : 자료 저장 구조
 * - Set, Map, List : 자료 저장 창고의 유형 
 * - 배열은 크기를 동적으로 확장 불가.
 * - Collection API는 크기를 동적으로 확장 가능.
 * 
 * Set
 * - (단건 데이터 저장)
 * - 중복 없음, 순서 없음.
 * - 중복된 데이터를 배제하고 싶을 때 사용
 * - 저장하고 꺼내는 기준 : 내용물
 * - HashSet을 많이 사용 : class HashSet implements Set
 * List
 * - (단건 데이터 저장)
 * - 중복 가능, 순서 있음.
 * - 데이터를 꺼낼 때, 순서 번호(Index)로 꺼낸다.
 * - ArrayList을 많이 사용 : class ArrayList implements List
 * Map 
 *  - (이름표(key)와 내용물(value)의 한 쌍으로 저장)
 *  - key 중복 없음, value는 중복 가능.
 *  - 순서 없음.
 *    -> why? 데이터를 꺼낼 때, 이름으로 꺼낸다.
 *  - HashMap을 많이 사용 : class HashMap implements Map
 */

public class Ch07Ex01 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet(); 
		set.add("data1");
		set.add("data1");
		set.add(1);
		set.add(1);
		Object [] obs = set.toArray();
		System.out.println(obs.length); //중복 저장 안됨
		
		HashMap map = new HashMap();
		map.put("kim", 777);
		map.put("kim", 888);
		System.out.println(map.get("kim")); //key 중복 없음. 두 번째 값만 남음.
		
		ArrayList list = new ArrayList(); //add-get (번지 개념으로 가져옴)
		list.add("data1");
		list.add("data1");
		list.add(777);
		list.add(777);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//for
	}//main
}//class
