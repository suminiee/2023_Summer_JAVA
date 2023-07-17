package day09;

//interface에는 추상메소드만 있는 것으로 시작
//default Method, static Method, final static field도 들어갈 수 있음

//primitive => byte, char, short, int, long, float, double, boolean
//나머지는 reference type
//int [] arr, int[] arr  = new int [5] 이런 것도 int뒤에 뭐가 붙었기 때문에 reference type
// new로 만들어야하는 class도 reference type, interface, abstract class는 method가 비어있지만 (new 안됨, 참조매개변수로는 쓸 수 있음) 
//class, interface, abstract class는 reference type   


interface Basket{
	public static final int a = 0;
	public static final int b = 0;
	public static final int c = 0;
	public static final int d = 0;
	//interface안에는 public static final 밖에 쓸 수 없다.
	
	void check(); //public abstract 추상메서드
}

class Baseball implements Basket{
	public void check() { //overriding(상속) 1. 반드시 똑같은 선언, 2. 접근제어자는 좁아질 수 없다, 3. 예외갯수는 일정해야함
		System.out.println("야구공");
	}
}

class Soccer implements Basket{
	public void check() {
		System.out.println("축구공");
	}
}

class Person3{
	void receive (Basket bk) {
		bk.check();
		System.out.println("뭐든 잘 받습니다.");
	}
}



public class test_1 {
	public static void main(String[] args) {
		Person3 felix = new Person3();
		Baseball bb = new Baseball();
		Soccer sc = new Soccer();
		
		felix.receive(sc);
		felix.receive(bb);
	}
}
