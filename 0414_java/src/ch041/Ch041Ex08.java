package ch041;

public class Ch041Ex08 {

	public static void main(String[] args) {
		
		//2차원 배열의 길이(length) 개념.
		int [][] iMultiArr = {{1,2}, {3,4,5}, {6,7,8,9}};
		//0동은 2층, 1동은 3층, 2동은 4층
		
		System.out.println("동의 갯수" + iMultiArr.length);
		System.out.println("0동 호의 갯수" + iMultiArr[0].length);
		System.out.println("1동 호의 갯수" + iMultiArr[1].length);
		System.out.println("2동 호의 갯수" + iMultiArr[2].length);
		
	}//main

}//class
