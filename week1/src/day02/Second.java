package day02;

public class Second {
	//주석은 매우 중요하다
	//복사 붙여넣기 매우 중요하다
	//main + ctrl + space => public static void main(Stirng[] args) {} 단축키
	// (조건문)
	// 5 > 10 ? 30 : 50 앞이 false면 50 실행, 앞이 true면 30실행=> 조건이 참이면 앞에거, 조건이 거짓이면 뒤에 거
	// a = (b<c) ? 20(true) : 10(false);, 
	
	public static void main(String[] args) {
		//int 값 swap, 메모리 (변수) 사용하였지만 속도는 빠름(계산x)
		int a = 5;
		int b = 10;
//		int t;
//		
//		t = a;
//		a = b;
//		b = t;
		
		//exclusive or (^)사용하여 새 변수 선언 없이 swap하기, 같으면 0 다르면 1, trade off
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//syso + ctrl + space => System.out.println(); 단축키
		//shift + enter => 줄바꿈
		
//		a = 10;
//		b = ++a; // a가 증가 후 b에 대입됨, 둘 다 11
//		a1 = 10;
//		b1 = a1++; // a1가 b1에 대입 후 a1 증가, b1만 11

	
	}
}
