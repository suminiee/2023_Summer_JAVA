package day09;

//interface의 조상은 object가 될 수 없다.
//interface의 조상은 오로지 interface
//interface -> implements 사용, 여러개 implements가능
//inheritance -> extends 사용, 하나만 extends가능
interface a{}
interface b{}
interface c extends a, b{} //interface는 extends로 다른 인터페이스를 상속가능하다. 다중으로 상속도 가능.
						   //만약 a,b에 있는 추상메소드가 이름이 같다면 ??? 문제없다. 메소드 정의가 없으니까(본체가 없으니까 충돌 날 게 없음) 
interface Sendable{
	void check();
}

class Text implements Sendable{
	public void check() {
		System.out.println("문자");
	}
	
//	public String toString() {
//		return "문자";
//	}
}
class Call implements Sendable{
	public void check() {
		System.out.println("전화");
	}
	
//	public String toString() {
//		return "전화";
//	}
}
class Tel{
	//send 메소드에 call 객체와 text객체를 매개변수로 던지면
	//call경우 전화
	//text의 경우 문자를 출력
	
	void Send(Sendable s) {
		s.check();
	}
//	void Send(Sendable s) {
//		System.out.println(s);
//	}
}




public class Test_3 {

	public static void main(String[] args) {
		Tel phone = new Tel();
//		Call c = new Call();
//		Text t = new Text();
		phone.Send(new Call());
		phone.Send(new Text());
		
	}
}
