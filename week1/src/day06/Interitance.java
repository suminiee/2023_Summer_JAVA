package day06;

class Bonnet{
	int piston;
	int engine;
}

class Car2{
	int window;
	int wheel;
	Bonnet bn;
	//Bonnet bn = new Bonnet(); //포함의 관계 => 가지고 있다는 의미. 
	//Car2는 Bonnet을 가지고 있다. 
	//has - a	
	Car2(){
		window = 4;
		wheel = 30;
		bn = new Bonnet();
	}

}

class Car{ //class Car extends Object{} //부모가 없는 클래스는 모두 Object(최상위 class)를 상속받는다. 
	int window;
	int wheel;
	//Car도 default 생성자를 만들어줘야함.
	Car(){} //써야지 에러 안남.
	Car(int window, int wheel){
		this.window = window;
		this.wheel = wheel;
	}
	void dp() { //오버라이딩 overriding
		System.out.println(window + "  " + wheel); //부모 멤버 2개
	}
}

class sedan extends Car{ //Car의 engine, wheel을 상속받고도 dp()라는 함수를 추가함 (기능적 업그레이드) 
	//상속의 관계 => 가지고 있던 특성을 물려받음 
	//car를 상속받아 sedan이 되었다, sedan도 car이다.
	//is - a
	//car는 sedan이다.
	
	int power;
	
	sedan(){
		super(); //사실 이런 일을 하고 있었음(생략가능) -> 모든 생성자는 내부적으로 다른 생성자를 호출한다. (부모의 생성자를 호출한다)
	}//default생성자를 만들어주어야함.
	sedan(int window, int wheel, int power){
//		this.window = window;
//		this.wheel = wheel;
		super(window, wheel); //부모의 생성자 호출
		this.power = power;
	}
	
	void dp() {
		System.out.println(window + "  " + wheel + "  " + power); //부모 멤버 2개 + 자식 멤버 1개
	}
}


public class Interitance {

	public static void main(String[] args) {
		sedan mycar = new sedan();
		mycar.dp();
		
		//mycar2 window 4개, wheel 30, power 500
		sedan mycar2 = new sedan(4, 30, 500);
		mycar2.dp();
		
	}
	
}
