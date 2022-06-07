package ch07;

import java.util.TreeMap;

public class Ch07Ex09 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(5, "no5"); map1.put(9, "999"); map1.put(1, "first"); map1.put(7, "seven");
		System.out.println(map1);
		//출력 : {1=first, 5=no5, 7=seven, 9=999} 
		//key 중심 정렬
		
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("nice", "no5"); map2.put("to", "999"); 
		map2.put("meet", "first"); map2.put("you", "seven");
		System.out.println(map2);
		//출력 : {meet=first, nice=no5, to=999, you=seven}
		//key의 알파벳 순으로 정렬됨
		
	}//main
}//class
