package day06;

class Mcar{
	int color = 10;
}

class SportsCar extends Mcar{
	int color = 20;
	
	void dp() {
		System.out.println(color);
		System.out.println(this.color);  //자식의 멤버
		System.out.println(super.color); //부모의 멤버
	}
}

//같은 클래스에서 다른 생성자 호출 this()
//상속 관계에서 부모 생성자 호출 super()
//인스턴스 변수와 로컬 변수의 구분을 위해 this.color
//상속 관계에서 부모의 멤버를 위해 super.color
public class Inheritance_2 {
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.dp();
	}
}
