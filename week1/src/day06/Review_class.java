package day06;

//gun 권총 클래스
//총알 개수

class Gun{
	private int bullet_count;
	Gun(){}
	Gun(int bullet_count){
		this.bullet_count = bullet_count;
	}
	
	
	public int getBullet_count() {
		return bullet_count;
	}
	public void setBullet_count(int bullet_count) {
		this.bullet_count = bullet_count;
	}
	
}

//police 경찰 클래스
//이름, 소속, 권총

class Police{
	Police(){}
	String name;
	String group;
	Gun g;
	
	
	static int cnt = 0;
	
	Police(String name, String group, int bullet_count){
		this.name = name;
		this.group = group;
		
		g = new Gun();
		g.setBullet_count(bullet_count);
		
		cnt++;
	}
	static int getPerson_count() { return cnt; }
	
	@Override
	public String toString() {
		return "Police [name=" + name + ", group=" + group + ", 총알 개수=" + g.getBullet_count() + "]";
	};
	
}

//경찰 클래스는 권총 클래스를 가진다.
//홍길동, 특공대, 권총 총알 100개
//둘리, fbi, 권총 총알 2000개

//경찰의 총 인원수
//각 객체의 toString()
//각 클래스의 생성자

//권총 총알은 private를 선언하여 
//멤버 메소드(getter, setter)로 간접 접근하시오

public class Review_class {

	public static void main(String[] args) {
	
		Police p1 = new Police("홍길동", "특공대", 100);
		Police p2 = new Police("둘리", "fbi", 2000);
		
		System.out.printf("경찰 인원은: %d\n", Police.cnt);
		System.out.println(p1);
		System.out.println(p2);
		
	} 
}
