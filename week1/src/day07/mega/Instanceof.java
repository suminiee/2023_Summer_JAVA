package day07.mega;
//instance of 연산자

abstract class Parent{ 
	abstract void fastrun(); //다형성을 위해서는 추상클래스로 한 방법
//	void fastrun() { 		 //오버라이딩 상속에 의한 메소드를 선택한 방법
//		void run() { 		 //부모의 참조변수를 자식으로 casting한 방법(자식의 새 기능은 부모가 접근 못한다.)
//			System.out.println("살살걷기");
//		} 
//	}
}

class Child extends Parent{
	void fastrun() {
		System.out.println("빨리걷기");
	}
}

class Child2 extends Parent{
	void fastrun() {
		System.out.println("어디서나당당하게걷기");
	}
}

class Body {
	void dp(Parent rev) { //Object(최상위조상)을 써도 되긴 함(근데 그 조상이 fastrun을 안가지고 있다면 에러가 발생함)
		rev.fastrun();
//		if (rev instanceof Child) { //rev라는 참조변수가 가리키는 객체가 Child인지 //true, false
//			Child c = (Child)rev; //down casting은 explict(명시적인)casting이 필요함. //부모를 자식으로 다운캐스팅(명시적으로 해야함)
//			c.fastrun();
//		}
//		else if (rev instanceof Child2) { //rev라는 참조변수가 가리키는 객체가 Child2인지 //true, false
//			Child2 c = (Child2)rev;
//			c.fastrun();
//		}
	}
	
}

//캐스팅 : 사용 멤버 개수 조절 
//부모가 기능이 더 많다? //자식을 부모로 캐스팅하는 것은 //부모가 자식을 다루는 동작
//자식이 기능이 더 많다? 부모가 자식을 다운캐스팅 하는 것은 //접근 능력이 많아지는 것 //사용멤버(멤버 필드, 멤버 메소드) 개수가 많아지는 것
public class Instanceof {
	
	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		Body bb = new Body();
		bb.dp(c); //upcasting => Child에 대한 객체를 부모에게 던져옴
		bb.dp(c2);
		
//		System.out.println(p instanceof Child); //(False) pp라는 객체가 Child에서 만들어졌는지 물어보는 것 //부모가 자식으로
//		System.out.println(c instanceof Child); //(True) cc라는 객체가 Child에서 만들어졌는지 물어보는 것  //자식이 자식으로
//		System.out.println(p instanceof Parent);//(True) pp라는 객체가 Parent에서 만들어졌는지 물어보는 것 //부모가 부모로
//		System.out.println(c instanceof Parent);//(True) cc라는 객체가 Parent에서 만들어졌는지 물어보는 것 //자식이 부모로
	}
}
