package day04;

class NewCar{
	int power;//마력
	char color;//자동차 색
	String cName;//자동차 이름
	
	//생성자 오버로딩 (constructor overloading)
	public NewCar() { //명시적인 생성자가 없을 때 자동으로 만들어진 생성자
		
	};
	
	NewCar(int p, char c, String s)//생성자를 사용한 초기화 -> return값이 없음! 객체를 만들면 끝나기 때문에 return할 필요가 없음.
	{
		power = p;
		color = c;
		cName = s;
	}
	
	void initCar() { //속성 값을 초기화시켜주는 함수 -> 차 살때 옵션 //멤버 메소드를 사용한 초기화
		power = 200;
		color = 'B';
		cName = "sonata";
	}
	
	void printCar() {//속성 값을 print해주는 함수
		System.out.println(power);
		System.out.println(color);
		System.out.println(cName);
	}
}



public class Car_2 {

	public static void main(String[] args) {
		
		NewCar texi = new NewCar(400, 'R', "GENESIS"); //생성자//method호출
//		NewCar bus  = new NewCar(); //error발생 비어있는 생성자라도 만들라고 함. -> 자동으로 안만들어줌.
		
		
//		texi.power = 300;//이렇게도 초기화시킬 수 있음. => 차 사고 튜닝
//		texi.color = 'W';
//		texi.cName = "BMW";
		
	
		//texi.initCar();
		texi.printCar();
	}
}
