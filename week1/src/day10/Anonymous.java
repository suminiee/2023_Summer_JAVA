package day10;
//익명 클래스 // 클래스 이름이 없다.
//final 변수 -> 단 한번만 초기화가 가능함, 그래서 내부 값 수정이 불가능함.
//final static int a; => 클래스 변수, 클래스변수명.a로 접근가능
//final int a; => iv, 초기화할때 최초로 들어간 값을 변경시킬 수 없음.
interface Broadcast{
	public void check();
}

class Bstation{
	private String bName;

	public Bstation(String bName) {
		super();
		this.bName = bName;
	}
	
	public Broadcast bsend(final int channel) {//void 자리에 A, Broadcast, Object가 올 수 있음.
		return new Broadcast() {//익명클래스
			public void check() {
				System.out.println("b-station name : "+ bName);
				System.out.println("channel  number : "+ channel);
			}
		};
	}
	
}


public class Anonymous {
	
	public static void main(String[] args) {
		Bstation bb = new Bstation("TVN");
		Broadcast b1 = bb.bsend(17);
		b1.check();
		
		Bstation bbb = new Bstation("MBC");
		Broadcast b2 = bbb.bsend(11);
		b2.check();
	}
}
