package day05;

//자동차를 보고 자동차를 설계
//자동차를 분석 자동차를 class로 정의

class Car{
	int window = 2; //만들어지는 자동차 창문은 2개 //멤버변수(인스턴스변수), 앞에 static이 붙으면 클래스변수
	Car(){}
	Car(int window){						//생성자
		this.window = window;
	}
	void run() {							//멤버메소드 //method 안에 있으면 지역변수(local)
		System.out.println("난 멈추지 않는다.");
	}
}


//method == function : 완전히 같다
//변수가 자동초기화 된다면 왜 여러개를 만드는가? //여러개만들고싶으면 배여링용


public class Question {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();//myCar1 -> window, run() //창문 2개짜리 객체(자동차) 이름은 myCar1
		Car myCar2 = new Car(4);//myCar1 -> window, run() // 창문 4개짜리 ''  			 myCar2
		

	}
}
