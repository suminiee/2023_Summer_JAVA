package day09;

//class 안에 static이 붙은 클래스가 있을 때
//nested class라고도 불린다.
//private 변수는 getter setter만 접근 가능
//private한 nested class는 그 내부에서만 접근가능.


class Tesla{
	Battery b1;
	PrivateBattery p1;
	Tesla(){
		b1 = new Battery();
		p1 = new PrivateBattery(); //outer(Tesla)클래스 내부에서 접근 가능
	}
	
	void access() { //인스턴스 메소드 // 객체.access() //객체? Tesla 객체여야한다
		p1.PrivateBattery1();//private static class의 객체에 접근하는 getter마냥 사용됨
	}
	
	static class Battery{ //nested class //외부 클래스(tesla)없이도 생성가능
		int a = 10;
		static int voltage = 12;
		public void BatteryMethod() {
			System.out.println("BatteryMethod");
		}
	}
	private static class PrivateBattery{
		public void PrivateBattery1() {
			System.out.println("PrivateBattery");
		}
	}
}



public class Test_5 {
	
	public static void main(String[] args) {
		Tesla.Battery bat2 = new Tesla.Battery();//outer없어도 생성가능
		bat2.a = 200;
		bat2.BatteryMethod();
		
		Tesla tt1 = new Tesla();
		tt1.access(); 
	}
}
