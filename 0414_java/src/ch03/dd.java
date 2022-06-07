package ch03;

import java.util.Scanner;

public class dd {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int iVar1 = scan.nextInt();
			int iVar2 = scan.nextInt();
			int iVar3 = scan.nextInt();
			scan.close();
			int fNum = (iVar1 > iVar2 ? iVar2 : iVar1);
			
			System.out.println(fNum > iVar3 ? iVar3 : fNum);
			
	}

}
