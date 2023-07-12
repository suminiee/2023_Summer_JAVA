package day05;

class LineUp {
	String name;
	String position;
	int num;
	static int range = 3;
	
	void printLU() {
		System.out.println(name);
		System.out.println(position);
		System.out.println(num);
		System.out.println();
	}
	
}

public class review {
	
	public static void main(String[] args) {
		
		System.out.println("win or wow");
		sl();
		System.out.println();
		
		System.out.println(LineUp.range);//객체 없음에도 static int이기 때문에 클래스에 접근가능.
		//걍 구조체잖아
		LineUp s1 = new LineUp();
		s1.name = "이재현";
		s1.position = "유격수";
		s1.num = 7;
		s1.printLU();
		
		LineUp s2 = new LineUp();
		s2.name = "류지혁";
		s2.position = "1루수";
		s2.num = 42;
		s2.printLU();
		
		LineUp s3 = new LineUp();
		s3.name = "김현준";
		s3.position = "중견수";
		s3.num = 58;
		s3.printLU();
		
	}
	
	static void sl() {
		System.out.println("samsung lions");
	}
}
