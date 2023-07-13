package day07.mega;

abstract class Car{
	abstract void fly(); //추상메소드
//	abstract void water();
}

class FlyCar extends Car{
	void fly() {//추상메소드 구현
		System.out.println("날면서 물 삼키기");
	}
	//water()도 구현해야하는데 안함 -> 얘도 추상메소드가 됨
} //추상클래스 -> 객체생성이 불가능함

class SmartCar extends FlyCar{
	void fly() {
		System.out.println("강남의 물을 삼켜요");
	}
} //추상클래스가 아닌 SmartCar로 객체생성을 해야함.

class Display {
	//소스코드가 간단.
	void print(Car s) { //완전히 다른 함수 //비슷한 기능 // 함수 오버로딩(매개변수 타입, 갯수), 함수이름 같을 때
		s.fly();
	}
//	void print(FlyCar s) {
//		s.fly();
//	}
//	void print(SmartCar s) {
//		s.fly();
//	}
}


public class Abs_test_2 {
	
	public static void main(String[] args) {
		
		Display dd = new Display();
		FlyCar fc = new FlyCar();
		SmartCar sc = new SmartCar();
		dd.print(fc);
		dd.print(sc);
	}
}
