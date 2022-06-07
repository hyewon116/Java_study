package ch02;

/*
 * Math : 수학 관련 class  
 * - ceil : 올림(무조건)
 * - floor : 내림(무조건)
 */

public class Ch02Ex22 {

	public static void main(String[] args) {
		
		System.out.println("ceil(0.1) : " + Math.ceil(0.1));//무조건 올림
		System.out.println("floor(0.9) : " + Math.floor(0.9));//무조건 내림
		System.out.println("round(0.4) : " + Math.round(0.4));//반올림
		System.out.println("round(0.5) : " + Math.round(0.5));//반올림
		System.out.println("==============================");
		System.out.println("max(100, 200) : " + Math.max(100, 200));
		System.out.println("min(100, 200) : " + Math.min(100, 200));
		System.out.println("==============================");
		System.out.println("pow(2, 5) : " + Math.pow(2, 5)); //2*2*2*2*2
		System.out.println("sqrt(25) : " + Math.sqrt(25));//25의 제곱근
		System.out.println("==============================");
		System.out.println("random : " + Math.random());
		System.out.println("random : " + Math.random());
		//무작위 수 구하기 : 0.0 ~ 0.9999999999... 
		//random은 수행할 때마다 다른 값을 가져온다.
		System.out.println("random * 100 " + Math.random() * 100);
		//* 원하는 최대 숫자 ex) Math.random()*100 = 0~100사이의 수 구하기
		System.out.println("random * 45 + 1 : " + Math.random() * 45 + 1); // 그냥 45를 하면 44.99999까지만 나옴
		int jungsu = (int) (Math.random()*45+1);
		System.out.println(jungsu);
	}

}
