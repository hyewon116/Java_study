package ch051;

/*
 * Encapsulation : 은형성 : 개념
 *  - 데이터의 의도하지 않은 변경을 막으려는 개념
 *  - data hidden : data 은닉 
 *  - 보호하려는 data를 private으로 선언
 *  - private data에 접근하는 메소드(set/get 메소드)를 만들어주는 개념
 *  - set 메소드/get 메소드 : public 선언이 기본 
 *  - set 메소드 : data를 입력하는 개념 
 *  - get 메소드 : data를 출력하는 개념
 *   */

class RegistPRoduct {//상품 등록
	private String productName;
	private int price;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		if(productName.length() <= 0) return; //종료
		if(productName.trim().equals("")) return; //종료
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0) return;   // void + return은 메소드 종료.
		this.price = price;
	}
	
}//class

public class Ch051Ex14 {

	public static void main(String[] args) {
		
		

	}//main

}//class
