package day08;

//interface Flyable : fly추상메서드

interface Flyable{
	public void fly();
	public void move(int x, int y);
	default void nuclearBomb() {}
}

interface laserable{//다중상속흉내
	void launch();
}
class laser{//tank에게 laser를 쏘는 기능을 넣기 위해서 구현
	
}

//class WarInfo{
//	x,y 	//위치정보
//	hp		//체력
//	speed	//속도
//}

class WarInfo{
	WarInfo(){}
	int x, y;
	int hp;
	int speed;
	
	public WarInfo(int x, int y, int hp, int speed) {
		super();
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "WarInfo [x=" + x + ", y=" + y + ", hp=" + hp + ", speed=" + speed + "]";
	}
	
	
}

//fly를 사용하여 군인, 탱크, 수송선이 한꺼번에 임의의 위치로 move하는 동작을 만드시오 
//=> interface로 모든 자손객체를 한꺼번에 다루기

//군인
//Marine
//attack => 권총을 쏜다
//steam_pack => hp가 50% 올라간다
//move => 달려간다.
//fly => 잠시 날라요

class Marine extends WarInfo implements Flyable{
	Marine(int x, int y, int hp, int speed){
		super(x,y,hp,speed);
	}
	WarInfo w = new WarInfo(x, y, hp, speed);
	void attack() {
		System.out.println("권총을 쏜다.");
	}
	void steam_pack(){
		System.out.println("hp가 50% 올라갑니다.");
		w.hp = (int)1.5*w.hp;
	}
	public void move(int x, int y) {
		System.out.printf("좌표(%d, %d)으로 이동합니다.\n", w.x,w.y);
	}
	public void fly() {
		System.out.println("잠시 날라요");
	}
}


//탱크
//tank
//missile
//move
//fly

class Tank extends WarInfo implements Flyable{
	Tank(int x, int y, int hp, int speed){
		super(x,y,hp,speed);
	}
	WarInfo ww = new WarInfo(x, y, hp, speed);
	void missile() {
		System.out.println("마구마구 쏩니다.");
	}
	public void move(int x, int y) {
		System.out.printf("좌표(%d, %d)으로 이동합니다.\n", ww.x,ww.y);
	}
	public void fly() {
		System.out.println("무거워서 가장 느리게 날라가지요");
	}
}


//수송선
//transport
//move 
//fly
class Transport extends WarInfo implements Flyable{
	Transport(int x, int y, int hp, int speed){
		super(x,y,hp,speed);
	}
	WarInfo www = new WarInfo(x, y, hp, speed);
	public void move(int x, int y) {
		System.out.printf("좌표(%d, %d)으로 이동합니다.\n", www.x,www.y);
	}
	public void fly() {
		System.out.println("가장 빨리 움직여요.");
	}
}

class AllMove{//전화기
	void moving(Flyable ff, int x, int y) {
		ff.move(x, y);
	}
	

}


public class Interface_6 {

	public static void main(String[] args) {
		AllMove t = new AllMove();
		
		
	}
}
