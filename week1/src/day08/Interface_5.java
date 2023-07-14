package day08;

interface Sendable{ //인터페이스 접미부에 able, Impl붙음
	void makingSend();//추상메소드 //public abstract 생략가능
	
//	void theEnd();//인터페이스에 추상 메소드를 추가한 순간 //모든 구현 클래스에서는 메소드를 구현해야한다.
//	이를해결하기 위하여
	default void theEnd() {} //default를 추가한다. body부분이 있다. 기능을 추가해도 되고 안해도 된다.
}

class SuperCall {//일반클래스
	public void theEnd() { //인스턴스 메소드
		System.out.println("기본적으로 종료에 쓰이는 디폴트메서드 입니다");
	}
}

class Call extends SuperCall implements Sendable{//전화 거는 기능 설계
	public void makingSend() {
		System.out.println("전화가 걸립니다.");
	}
	public void theEnd() {
		System.out.println("전화를 종료합니다");
		super.theEnd(); 
	}

	
}

class Text implements Sendable{//문자 보내는 기능 설계
	public void makingSend() {
		System.out.println("문자가 보내집니다.");
	}
//	public void theEnd() {
//		System.out.println("문자를 종료합니다");
//	}


}

class Tel{//전화기
	public void Send(Sendable c) {
		c.makingSend();
	}
	
	public void End(Sendable c) {
		c.theEnd();
	}
}

public class Interface_5 {
	
	public static void main(String[] args) {
		
		Tel phone = new Tel();//전화기를 만들어서
//		Call c = new Call();  //음성통화
//		Text t = new Text();
//		phone.Send(t);
		phone.Send(new Call());
		phone.Send(new Text());
		phone.End(new Call());
	} 
}
