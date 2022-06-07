package ch07;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Set
 *  <iterator> 
 *  --> Set은 List(순서有)처럼 index로 get을 할 수도, 
 *             Map(key有)처럼 key값으로 get을 할 수도 없음. 
 *             --> 그래서 필요한 게 iterator
 *             
 *  - data 저장 객체(List,Set)에 결합하여, data를 검색하는 역할
 *  - 1. 데이터 간의 이동, 2. 데이터가 있는지 확인, 3. 데이터 꺼내기
 *  - hasNext : 다음 데이터가 있는지 확인.
 *  - next : 데이터 간의 이동 후, 데이터 꺼내기
 */

public class Ch07Ex05 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(1);
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add("hello");
		System.out.println("set: " + set);

		Iterator iter = set.iterator();
		while(iter.hasNext()) { //true
			System.out.println(iter.next()); //이동 후, 꺼내기
		}//while
	}//main
}//class
