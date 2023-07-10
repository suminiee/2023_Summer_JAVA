package day04;

public class Method { //class의 시작부분
	
	//function == method(java)
	public static void main(String[] args) { //main method의 시작
		
		
		int x = 4, y = 10;
//		int min = comp_min(x, y);
//		System.out.println(min);
		
		System.out.println(comp_min(x,y));
		
		dressbox();//parameter 없고 return값도 없는 method
		int a = 10, b = 5;
		int result = add(a,b); //parameter int형, return 값 method
		System.out.println(result);
		System.out.println(appleTree());//parameter없고 return값도 없는 method
		speed(120); //parameter int형, return값 없는 method
		 
		
	}//main method의 종료
	
	//두수 중 작은 값을 리턴하는 method
	static int comp_min(int i, int j) {
		return i < j ? i : j;
	}
	
	static void dressbox() {
		System.out.println("socks");
	} //static "void"면 return값이 없다는 의미.
	
	static int appleTree() {
		return 100;
	}
	
	static void speed(int km) {
		System.out.printf("%d km로 달리고 있습니다. 속도를 줄이세요.", km);
	}
	static int add(int x, int y)//method 의 선언
	{ //method의 구현/정의
		int result = x + y;
		return result;
	}
	
} //class의 종료부분
