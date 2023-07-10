package day04;

//class는 초기화하지 않아도 default값이 출력됨(false, null, 0) 클래스가 아닌 경우에는 에러 발생
class Test{
	boolean bb; //인스턴스 변수(기본 default값 : false)
	String ss; //인스턴스 변수 (아무것도 설정 안했을 때 null이 출력됨)
	int iv = 100; //인스턴스 변수 (아무것도 설정 안했을 때 0이 출력됨)
	static int cv = 7; //class변수 -> 객체가 없어도 접근 가능.
	
	void lvmethod() { //인스턴스 멤버 메소드, { }안에서만 있음. 메모리 안에서 순간적으로 만들어졌다가 함수가 끝나면 사라지는걸 반복함., 0으로 초기화가 안됨
		int lcv; //localv, local변수
	}
	
	static void sMethod() { //클래스 메소드 (static이 붙으면 class를 따라감), class를 통해서만 접근. class method는 class변수를 쓰기 위해서 만들어짐, 객체가 만들어지기 전에도 사용 가능함.
		System.out.println("sMethod");
		System.out.println(cv);
//		System.out.println(iv);//error->new에 의해 생성된 객체.iv / 만들어 졌는지도 모르는데 접근하려고 한다? 당연히 안됨.
	}
}

//객체지향의 규칙을 자연스럽게 익히면 됨.
//error 발생 시 error message 확인하기! <- 습관화시키기
public class Variable {
	
	public static void main(String[] args) {
		
		Test tt = new Test();
		System.out.println(tt.bb);//인스턴스 변수는 반드시 "tt"와 같은 객체가 있어야지만 (접근)출력가능.
		System.out.println(tt.ss);
		System.out.println(tt.iv);
		System.out.println(tt.cv); //tt.cv의 출력값과 Test.cv의 출력값이 같음, 객체가 없어도 출력됨.[사용 안함]
		System.out.println(Test.cv); //이런 형식이 더 많이 쓰임. (바로 접근)
		
		
//		tt.sMethod();//사용하지 않는 방법
		Test.sMethod();//클래스로 접근하는 방법.
	}

}
