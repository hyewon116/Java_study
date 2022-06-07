package ch07;

import java.util.ArrayList;

class Ch07Test1 {}

public class Ch07Ex011 {//주제 : Object. 
	
	public static void main(String[] args) {
		
		Ch07Test1 test = new Ch07Test1();
		System.out.println(test.toString());
		//Ch07Test1에 아무것도 없는데 왜? -> object를 자동 상속.
		/*
		 * Object는 모든 class의 최상위 class가 된다.
		 *  -> Collection API의 정체 : Object의 Heterogeneous collection
		 *     -> ArrayList == Object[]
		 *        -> ArrayList.clone() ==> Object[]
		 *        -> ArrayList.toArray() ==> Object[]
		 */
		
		ArrayList list = new ArrayList();
		list.add("hi");
	//	String imsiStr = list.get(0); //error
		Object ob = list.get(0);
		String tmpStr = (String) ob;
		//==============================
		Ch07Parent1 [] pArr = new Ch07Parent1[2];
		pArr[0] = new Ch07Child1(); //부모 타입의 배열에 자식 객체를 연결 
	//	Ch07Child1 c1 = pArr[0];//error
		Ch07Child1 c2 = (Ch07Child1) pArr[0];
	}//main
}//class

class Ch07Parent1 {}

class Ch07Child1 extends Ch07Parent1 {}





