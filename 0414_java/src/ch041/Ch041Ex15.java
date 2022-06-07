package ch041;

public class Ch041Ex15 {

	public static void main(String[] args) {
		
		String [][] strArr = new String[10][10];
				
		for (int i = 0; i < strArr.length; i++) {
			for (int k = 0; k < strArr.length; k++) {
				strArr[i][k] = i + "*" + k + "=" + i*k; //문자열과 합성하면 뒤에도 문자열이 됨.
				
				
			}//for
		}//for
			for (int i = 0; i < strArr.length; i++) {
				for (int k = 0; k < strArr.length; k++) {
					System.out.print(strArr[i][k] + "\t");
				}
				System.out.println();
			}
			
	}//main
}//class
