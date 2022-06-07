package ch07;

import java.util.ArrayList;

/*
 * JDK는 Oracle에서 만들고 유지&보수한다.
 *  -> 우리 눈에 보이지 않는 숨겨진 로직들이 존재한다.
 *  	-> 우리가 원리를 파고 들어도 알 수 없다.
 */

class Ch07Ex071Test {
	@Override
	public String toString() {
		return "내가 만든 toString";
	}
}//class

public class Ch07Ex071 {

	public static void main(String[] args) {
		
		String str = new String("hello");
		System.out.println("str : " + str); //숨겨진 로직.
		System.out.println("str.toString() : " + str.toString()); //실제 동작. 
		ArrayList<Ch07Ex071Test> list = new ArrayList<Ch07Ex071Test>();
		Ch07Ex071Test test1 = new Ch07Ex071Test();
		Ch07Ex071Test test2 = new Ch07Ex071Test(); 
		list.add(test1);
		list.add(test2);
		System.out.println(list);
		/*
		 * System.out.println(list)
		 *  - ArrayList의 size만큼 for문을 돌면서 
		 *    -> ArrayList 내부 객체의 toString()을 출력한다.
		 */
		
	}//main
}//class

