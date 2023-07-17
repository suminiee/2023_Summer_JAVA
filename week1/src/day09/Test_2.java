package day09;

class Robot{
	private String name ; //멤버필드 //private이면 선언된 그 클래스 안에서만 접근가능.

	public Robot(String name) { //생성자
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {//패키지.클래스@헥사해시코드
		return "Robot [name=" + name + "]"; //return name;만 하면 이름만 출력됨. //객체(instance 변수의 묶음)를 대표하는 이름을 명시하고싶다는 의미
	}
	
}



public class Test_2 {

	public static void main(String[] args) {
		Robot felix = new Robot("용복이");
		System.out.println(felix.getName());
		felix.setName("이용복");
		System.out.println(felix.getName());
		
		System.out.println(felix);
		
		System.out.println(felix.getClass().getName()+'@'+Integer.toHexString(felix.hashCode()));// == toString 없을 때의 System.out.println(felix);와 같음.
	}
}
