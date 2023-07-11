package day05;

//자동차를 보고 자동차를 설계
//자동차를 분석 자동차를 class로 정의

class Car2{
	int engine;

	public int getEngine() {//getter
		return engine;
	}

	public void setEngine(int engine) {//setter
		this.engine = engine;
	}
}


//method == function : 완전히 같다
//변수가 자동초기화 된다면 왜 여러개를 만드는가? //여러개만들고싶으면 배여링용


public class Question2 {

	public static void main(String[] args) {
		
		Car2 myCar1 = new Car2();//myCar1 -> window, run() //창문 2개짜리 객체(자동차) 이름은 myCar1
//		myCar1.engine = 400;//위험한겁니다. (우클릭 ->source ->getter and setter누르면 자동으로 클래스에 만들어줌)
		myCar1.setEngine(400);
		System.out.println(myCar1.getEngine());

	}
}
