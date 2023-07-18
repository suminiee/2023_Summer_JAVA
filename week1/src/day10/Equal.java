package day10;

import java.util.Objects;

class Stest{
	String s;
	int x;
	
	public Stest(String s, int x) {
		super();
		this.s = s;
		this.x = x;
	}

	@Override
	public String toString() {
		return "Stest [s=" + s + ", x=" + x + "]";
	}
	
	//(hash값이랑 equal까지 한번에 비교해줌)
	@Override
	public int hashCode() {//object's' 그냥 util class임. java util에 존재하는 class를 위한 거임..클래스 정보를 보여주는
		return Objects.hash(s, x); //instance 변수가 두 개, 가변적이라 10개를 넣으면 지가 알아서 10개 만들어서 비교
	}

	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stest other = (Stest) obj;
		return Objects.equals(s, other.s) && x == other.x;
	}
	
}

public class Equal {
	public static void main(String[] args) {
		Stest a = new Stest("Felix", 8);
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a.getClass().getName()+'@'+Integer.toHexString(a.hashCode())); //본래의 모양새
		System.out.println(Integer.toHexString(System.identityHashCode(a))); //본래의 hash값
	
		Stest b = new Stest("Felix", 8);
		System.out.println(a == b); //주소값 같냐 ? -> false //당연함, new로 새로 만들면 heap공간에 새로 만들어짐
		System.out.println(a.equals(b)); //근데 얘는 true가 나와야하는데 false가 나옴, 고쳐줘야함
		
		System.out.println(Objects.hash(10,20,"둘리"));
		System.out.println(Objects.hash(10,20,"둘리"));
	}
}
