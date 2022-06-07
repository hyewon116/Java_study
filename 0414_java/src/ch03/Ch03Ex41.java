package ch03;
/*
 * for : 반복문 : Loop Statement 
 * - 초기식, 조건식, 증감식을 한곳으로 모아 놓은 형태 
 * - for(초기식; 조건식; 증감식)
 */
public class Ch03Ex41 {

	public static void main(String[] args) {
		//for 문장의 중첩
		//1~3학년, 각 10반까지 출력
		for(int hak = 1; hak <= 3; hak++) {
			System.out.println("===== " + hak + " 학년 =====");
			for(int ban = 1; ban <= 10; ban++) {
				//System.out.println(hak + "학년 " + ban + "반");
				System.out.printf("%d학년 %d반\n", hak, ban);
			}
		}//for

	}//main

}//class
