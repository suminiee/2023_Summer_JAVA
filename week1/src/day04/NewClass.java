package day04;

//클래스 설계 
//Person({name, age, length} -> 속성 , {eat(), run(), sleep()} -> 동작)
class Car{
	//속성
	int power; //마력
	//동작
	void start() {
		System.out.println("시동이 걸립니다.");
	}
	
}




public class NewClass {

	public static void main(String[] args) {
		
		//1. 변수
		int a = 10;
		
		//2. 배열 -> 같은 타입을 여러개
		int arr[] = new int[100];
		
		//3. 구조체 -> 다른 타입을 같이 혹은 여러개
		
		//4. 클래스 -> 구조체 + method(기능(동작)을 추가함)
		Car bus = new Car(); //bus라는 새로운 구조체 추가
		bus.power=130;
		System.out.println(bus.power);
		bus.start();
		
	}
}
