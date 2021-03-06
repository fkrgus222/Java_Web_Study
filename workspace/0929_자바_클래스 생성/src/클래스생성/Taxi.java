package 클래스생성;

/*
 * Taxi 클래스 => 자식(하위) 클래스
 */

public class Taxi extends Car {

	// 메소드 오버라이딩
	public void speedUp(int velocity) {
		speed = speed + velocity;
		
		if (speed > 100) {
			speed = 100;
		}
	}
	
	public static void main(String[] args) {
		Taxi myTaxi = new Taxi();
		myTaxi.speedUp(150);
		System.out.println("Taxi speed is " + myTaxi.speed);
	}
}
