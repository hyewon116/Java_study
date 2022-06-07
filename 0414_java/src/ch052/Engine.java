package ch052;

/*
 * 상속 구조 ===> Ch052Ex14 참고 !!!!
 * - 이미 extends를 통해 상위 클래스를 상속받는 class들에게 
 *   -> implements를 통해 interface를 상속 가능
 */

public interface Engine {
	
	public void startEngine();
	
	public void stopEngine();
	
}//interface

class Wheel {}
class Wing {}
class FloatWater {}

//이미 
class Car extends Wheel implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Car - startEngine");
	}
	@Override
	public void stopEngine() {
	}
}//class

class Airplane extends Wing implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Airplane - startEngine");
	}
	@Override
	public void stopEngine() {
	}
}//class

class Ship extends FloatWater implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Ship - startEngine");
	}
	@Override
	public void stopEngine() {
	}
}//class