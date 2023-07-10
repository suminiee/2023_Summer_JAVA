package day04;

class MyInt{
	int num = 10;
}


public class ArgumentReturn {
	
	public static void main(String[] args) {
		int a = 10;
		change(a);
		System.out.println(a);
		
		/* 클래스형(레퍼런스타입) 변수명(레퍼런스변수) = new(인스턴스 생성 키워드) 생성자 */
		MyInt x = new MyInt(); //x가 객체가 됨.(reference)
		change2(x);
		System.out.println(x.num);
	}
	
	static void change(int a) {
		a = 200;
	}//a값 200이 여기서 사라짐. (위에서 a값을 찍었을 때 그대로 10이 나옴)
	
	static void change2(MyInt xx) {
		xx.num = 4000;
	}//xx.num값에 20이 저장됨, 참조형 변수는 주소값을 복사하기 때문에 값이 바뀜.
	
	static void change3(MyInt xx) {
		if (true)
			return; //method의 중간종료
		return;//리턴이 void일 경우 return 단독문 생략 가능.
	}
	
	static int change4(MyInt xx) {
		if (true)
			return 10;
		else
			return 20;
	}
	

}
