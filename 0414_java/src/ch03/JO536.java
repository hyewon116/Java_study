package ch03;
//1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.
//출력 예) 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
public class JO536 {

	public static void main(String[] args) {
			
		int iVar = 1; 
		while(iVar <= 15) {
			System.out.printf("%d\t", iVar);
			iVar++;
		}//while

	}

}
