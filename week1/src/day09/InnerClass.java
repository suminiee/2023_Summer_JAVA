package day09;

//클래스 안의 클래스
//outer가 먼저 만들어지고 난 다음 만든다.

class Cup{
	String company = "GER";

	public Cup(String company) { //outer의 생성자
		super();
		this.company = company;
	}
	class Coffee{//inner class //Cup이 만들어지고 나서 coffee를 만들 수 있음.
		String company = "USA"; //inner class안의 인스턴스변수
		Coffee(){ //inner의 생성자
			String company = "KOR"; //생성자 안의 local 변수
			coffeeMenu("Ice Americano"); //inner 클래스는 외부 클래스 멤버 접근 가능 : 메소드
										 //외부 객체가 먼저 생성되었기 때문에
			
			System.out.println(company);//KOR
			System.out.println(this.company);//USA
			System.out.println(Cup.this.company);//GER -> starbucks로 바뀜. //inner 클래스는 외부클래스 멤버 접근 가능 : 멤버 필드
			
			
		}
	}
	private void coffeeMenu(String made) {
		System.out.println(company + " Cup : " + made);
	}
	
}




public class InnerClass {
	
	public static void main(String[] args) {
		Cup cup1 = new Cup("starbucks"); //outer객체 생성
		Cup.Coffee coffee1 = cup1.new Coffee();//Cup.coffee a = new Cup.Coffee(); //outer객체.new로 만드는 것이 문법적으로 맞음.
//		Coffee c1 = new Coffee();
	}
}
