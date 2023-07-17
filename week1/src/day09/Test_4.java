package day09;

class Outer{
	int iv = 10;
	static int cv = 20;
	void method() {
		int lv = 30;
		System.out.println(lv);
	}
}



public class Test_4 {

	public static void main(String[] args) {
		System.out.println(Outer.cv);
//ot 생성 전에도 잘 작동함 (static 변수)
		
		Outer ot = new Outer();
		System.out.println(ot.iv);
		ot.method();
	}
}
