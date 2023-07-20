package day12;


//과제
class Hyundai{
	Hyundai() {}
	private static Hyundai hd = new Hyundai();
	public static Hyundai getInstance() {
		if(hd==null)//한번도 만들어지지 않았다면
			hd = new Hyundai();
		
		return hd;
	}
}

class Car extends Hyundai{
	private Car() {
		super();
	}
	
}

public class NewTest {
	public static void main(String[] args) {
		Hyundai factory = Hyundai.getInstance();
		
		Car mySonata = factory.createCar(); //고유넘버가필요함.
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum()); //10001
		System.out.println(yourSonata.getCarNum());
	}
}
