package day06;

public class AAA{
	private int a = 10; //클래스 (AAA라는 클래스 안에서만 쓸 수 있음)
	int b = 20; //default int b, 패키지(폴더)->"day06"이라는 package안에서는 다 쓸 수 있게 해준다
	protected int c = 30; // 패키지 + 상속
	public int d = 40; // 모두에게
	
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
	}
	
}



//class Access {
//	
//	public static void main(String[] args) {
//		AAA ob1 = new AAA();
//		ob1.print();
//		
//		//alt + shift + a // shift + up, down // edit 후// alt+shift+a 하면 한번에 수정 가능.
////		System.out.println(ob1.a); //에러발생 -> a는 AAA라는 클래스 내부에서만 사용가능.
//		System.out.println(ob1.b);
//		System.out.println(ob1.c);
//		System.out.println(ob1.d);
//	}
//}
