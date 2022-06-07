package ch041;

public class Ch041Ex07 {

	public static void main(String[] args) {
		//반복문은 array의 친구.
		//배열은 index를 통한 순차(순서대로) 접근이 가능하다.
		//1차원 배열은 기본적으로 반복문이 1개.
		//2차원 배열은 기본적으로 반복문 2개. (2중 반복문)
		
		int [][] iMultiArr = new int [10][10]; //iMultiArr.length = 10 (앞 []의 값)
		for(int idx1 = 0; idx1 < iMultiArr.length; idx1++) {//각 동에 먼저 접근
			
			//iMultiArr[idx1].length = 10 (뒤 []의 값)
			for(int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {//각 동의 호수에 접근
				iMultiArr[idx1][idx2] = (idx1 + 1) * (idx2 + 1);
			}//for
		}//for
		
		for (int idx1 = 0; idx1 < iMultiArr.length; idx1++) {//동 검색
			for(int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {
				System.out.printf("%d\t", iMultiArr[idx1][idx2]);
			}
			System.out.println();
		}
		
	}

}
