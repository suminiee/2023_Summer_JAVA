package day07.mega;

class Cpu{
	int core; //개수
	Cpu(int core){
		super();
		this.core = core;
	}
	
}

abstract class Computer{ //추상클래스는 일반클래스 + 추상메소드
	Cpu cpu;
	int ramSize;
	int price;
	int b_point;
	public Computer(int cpu, int ramSize, int price, int b_point) {
		this.cpu = new Cpu(cpu);
		this.ramSize = ramSize;
		this.price = price;
		this.b_point = (int)(price * (b_point / 100));
	}
	//능력치로 생성자 만들어보기.
	abstract void powerOn();
	abstract void powerOff();
}

class Notebook extends Computer{
	//추상매서드 구현, 멋지게 켭니다, 업그레이드하면서 끕니다.
	//상속받은 Cpu, ramSize, price, b_point 10%
	Notebook(int core, int gb){
		super(core, gb, 140, 10);
	}
	void powerOn() {
		System.out.println("멋지게 켭니다");
	}
	void powerOff() {
		System.out.println("업그레이드하면서 끕니다.");
	}
}

class Pad extends Computer{
	//추상메서드 구현하기 //총알같이 켭니다 //눈깜작할새 끕니다.
	//상속받은 cpu, ramSize, price, b_point 5%
	Pad(int core, int gb){
		super(core, gb, 160, 5);
	}
	void powerOn() {
		System.out.println("멋지게 켭니다");
	}
	void powerOff() {
		System.out.println("업그레이드하면서 끕니다.");
	}
}

class Consumer{
	int point; //b_point랑 연결
	int money; //구매금액만큼 줄어든다.
	Consumer(){}
	Consumer(int point, int money){
		this.point = point;
		this.money = money;
	}
	void purchase(Computer prd) {//구매
		//point는 증가
		this.point += prd.b_point; //포인트(적립금)
		//money는 price만큼 감소
		this.money -= prd.price; //금액만큼 돈 차감.
	}
	@Override
	public String toString() {
		return "Consumer [point=" + point + ", money=" + money + "]";
	}
	
}

public class Review_total {

	public static void main(String[] args) {
		//어떤 제품을 구매하시겠습니까
		//1. notebook - 140
		//2. pad - 160
		//==================
		//1
		//notebook을 선택하셨습니다
		//cpu core 개수와 ram size를 입력하세요
		//8 16
		//notebook 8코어 16GB를 구매하셨습니다.
		
		//업그레이드를 하면
		//사용자 정보(구매내역, 총 금액, 잔액)
		//Computer[] basket -> notebook, pad => notebook과 pad의 조상인 Computer가 될것임.
		
		Consumer man1 = new Consumer(0, 10000);
		Notebook nb = new Notebook(8,16);
		System.out.println(man1);
		
	}
}
