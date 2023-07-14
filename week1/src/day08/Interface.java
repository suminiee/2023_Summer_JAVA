package day08;

class Volume{//소리를 키우는 클래스
	public void up() { 
		System.out.println("볼륨 업");
	}
}

interface Noise{
	void cancelling();
}

class NoiseImp1{
	public void cancelliing() {
		System.out.println("소음을 제거합니다.");
	}
}


interface Audio{ //모든 메소드는 interface를 쓰는 순간 public abstract이기 때문
	void SoundOn();
//	public abstract void SoundOn();//추상 메소드 => public abstract 생략해도 가능.
}

class AudioImp1{
	public void SoundOn() {
		System.out.println("음악을 재생합니다");
	}
}

class Gom extends Volume implements Audio, Noise { //2개의 class를 한번에 상속받을 수 없음. => interface를 이용함.
	
	AudioImp1 boss = new AudioImp1();
	NoiseImp1 nocan = new NoiseImp1();
	
	public void SoundOn() {//부모의 메소드를 오버라이딩(상속) //선언부 똑같이 //접근제어자 작거나 같도록
		boss.SoundOn();
	}
	
	public void cancelling() {
		nocan.cancelliing();
	}
	
	public void start() {
		SoundOn(); 		//음악 재생
		up(); 	   		//볼륨 업
		cancelling();	//소음제거
	}
}

public class Interface {

	public static void main(String[] args) {
		Gom player = new Gom();
		player.start();
		
		System.out.println();
		Volume vo = player;
		Audio ad = player;
		Noise no = player;
		vo.up();
		ad.SoundOn();
		no.cancelling();
	}
}
