//package day08;
//
//interface Sendable{ //인터페이스 접미부에 able, Impl붙음
//	void makingSend();//추상메소드 //public abstract 생략가능
//}
//
//class Call implements Sendable{//전화 거는 기능 설계
//	public void makingSend() {
//		System.out.println("전화가 걸립니다.");
//	}
//}
//
//class Text implements Sendable{//문자 보내는 기능 설계
//	public void makingSend() {
//		System.out.println("문자가 보내집니다.");
//	}
//}
//
//class Tel{//전화기
//	public void Send(Sendable c) {
//		c.makingSend();
//	}
//}
//
//public class Interface_2 {
//	
//	public static void main(String[] args) {
//		
//		Tel phone = new Tel();//전화기를 만들어서
////		Call c = new Call();  //음성통화
////		Text t = new Text();
////		phone.Send(t);
//		phone.Send(new Call());
//	} 
//}
