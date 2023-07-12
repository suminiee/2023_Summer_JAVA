package day06;

class Mcar2{ //extends Object //Object 클래스가 가진 11개의 메소드를 Mcar2가 가진다.
	int color = 10;

	String dp() {
		return "color " + color;
	}

	@Override
	public String toString() {
		return "Mcar2 [color=" + color + "]";
	}
	
}

class SportsCar2 extends Mcar{
	
	int button = 30;
	
	String dp() {
		return "color " + color + " button " + button;
	}

	@Override
	public String toString() {
		return "SportsCar2 [button=" + button + ", color=" + color + "]";
	}
	
	
}




public class Overriding {

	public static void main(String[] args) {
		
		SportsCar2 sc2 = new SportsCar2();
		System.out.println(sc2.toString());
		System.out.println(sc2);//지가 알아서 내부적으로 toString한 값이 나온다.
	}
}
