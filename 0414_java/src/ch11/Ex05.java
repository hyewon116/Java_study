package ch11;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("main 메소드");
		//해당 클래스 안에 존재하는 메소드를 사용하기 위해서 
		//해당 클래스를 객체로 만들었다. 
		Ex05 test = new Ex05();
		test.add(); //add()는 void 이므로 돌아올 값이 없음.
		System.out.println("add() 호출 후 ");
		int k = test.sub(); //sub()은 int이므로 데이터를 갖고 돌아옴.
		System.out.println("sub() 호출 후");
	}//main
	
	//void는 호출한 곳으로 되돌아가면서 값을 가지고 가지 않는다.
	public void add() { 
		System.out.println("합은 20입니다.");
	}//add
	
	//반환형은 호출한 곳으로 되돌아가면서 반환형에 맞는 데이터를 가지고 간다.
	public int sub() { //메소드에 반환형(ex.int)이 있으면 마지막 줄에 return + 데이터 or 변수 있어야함!(해당 자료형과 일치하는)
		int su = 20 ;
//		return 20;   // 1) return + 데이터 
		return su ;  // 2) return + 변수 
	} //sub
}//class
