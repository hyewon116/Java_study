package ch06;

import java.util.Scanner;

class Ch06Member {
	String ID;
	String PWD;
	Ch06Member (String s1, String s2) {
		this.ID = s1;
		this.PWD = s2;
	}
}//class Ch06Member

public class Ch06Ex08 {

	static Ch06Member [] members = {new Ch06Member("bada", "1111")
								, new Ch06Member("san", "2222")
								, new Ch06Member("ha", "3333")};
	
	public static void main(String[] args) {
		
		IDException ide = new IDException();
	 	Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
	 	String str1 = scan.next();
		System.out.print("비밀번호 입력 : ");
	 	String str2 = scan.next();
	 	
	 		try {
				checkLogin(str1, str2);
			} catch (IDException e) {
		//		System.out.println("ID를 확인하세요.");
				e.printStackTrace();
			} catch (PWDException e) {
		//		System.out.println("PWD를 확인하세요.");
				e.printStackTrace();
			} 	
	
	}//main
	
	public static void checkLogin(String s1, String s2) 
						throws IDException, PWDException{
		
		boolean isMember = false;
		int whereisMember = 0;
		
		for (int i = 0; i < members.length; i++) {
			if(s1.equals(members[i].ID)) {
				isMember = true; //같은 아이디가 있다고 표시한다
				whereisMember = i; //같은 아이디가 있는 번지를 기억한다
				break;
			}
		} //for
		if(isMember == false) {
			throw new IDException();
		}//if
		
		if(!members[whereisMember].PWD.equals(s2)) {
			throw new PWDException();
		}
		
		System.out.println(members[whereisMember].ID + "님 환영합니다.");
	}//checkLogin
	
}//Ch06Ex08









