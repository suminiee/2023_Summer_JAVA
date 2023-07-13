package day07.mega;

abstract class Abbss{ //추상method를 한개라도 가지면 추상 클래스가 된다
	int a;	 		  //일반 클래스 + 추상 메소드 -> 추상 클래스
	Abbss(){}		  //추상클래스는 객체를 생성할 수 없다.
	Abbss(int a){	  //다른 클래스를 돕기 위해서 만듦
		this.a = a;
	}
	abstract void method(); //함수의 본체(body)가 없는 메서드를 추상 메서드(abstract method) //abstract void method가 발생하면 abstract class 이름 {}이 되어야 한다.
	
	void dp() {
		System.out.println("Abbss");
	}
}

class AbsChild extends Abbss{ //상속할 때 - 생성자와 초기화블럭은 상속이 안된다.
//	AbsChild(){} //=>생략해도됨.
	AbsChild(int a){ //모든생성자는 다른 생성자를 처음에 반드시 호출한다.
		super(a);
	}
	void method() {
		System.out.println("추상메서드 구현");
	}
}

public class Abs_test {

	public static void main(String[] args) {
		AbsChild ob = new AbsChild(20);
//		AbsChild ob = new AbsChild(20); =>이런건 안됨.
		ob.method();
		System.out.println(ob.a);
		
		
	}
}
