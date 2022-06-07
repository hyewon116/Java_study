package ch041;

public class Ch041Ex053 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		//for문을 통해 로또 번호 6개를 만드시오. (중복 제거)
		
		for (int i = 0; i < lotto.length; i++) {
			int tmp = (int) (Math.random() * 45 + 1); // 0을 안 나오게 하기 위해 46이 아닌 45+1
			if (i == 0) lotto[i] = tmp; //최초의 값 : 0번지의 값은 그냥 입력 why? 비교 대상 없음. 
			boolean flag = false;
			for (int k = 0; k < i; k++) { //k는 매번 0부터 검사 
				if(tmp == lotto[k]) {
					flag = true;
					break;
				}
			}//for 배열의 기준 값과 비교 = 중복 제거 하려고
			//중복 여부에 따라 값을 입력
			if(!flag) {//flag가 트루가 아니면 발생한 tmp 값을 배열에 집어넣기
				lotto[i] = tmp;
			} else { //중복
				i--; //중복이 발생한 번지에 값을 입력하지 않고 지나가지 않도록
			}
			
		}//for 입력
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}//for 출력

	}//main

}//class
