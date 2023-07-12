package day06_2;
import day06.AAA;

//class 자식 extends 부모 {}
//생성자와 초기화 블럭 제외.
class BBB extends AAA{ //day06.AAA라고 쓰면 import day06.AAA안써도 됨
	void print() {
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c); //protected int c = 30; // 패키지 + 상속(AAA, BBB에서만 쓸 수 있음)
		System.out.println(d); //public int d = 40; // 모두에게
		System.out.println();
	}
}



public class Access_2 {
	
	public static void main(String[] args) {
		BBB ob1 = new BBB();
		ob1.print();
		
		//alt + shift + a // shift + up, down // edit 후// alt+shift+a 하면 한번에 수정 가능.
//		System.out.println(ob1.a); //에러발생 -> a는 AAA라는 클래스 내부에서만 사용가능.
//		System.out.println(ob1.b);
//		System.out.println(ob1.c);
		System.out.println(ob1.d);
	}
}

//overloading(int+배열...모양이 다름)
//overriding (모양이 완전히 똑같은 함수, 똑같은 기능을 받되, 안의 내용을 다르게 함)