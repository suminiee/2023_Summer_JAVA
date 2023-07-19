package day10;
import java.util.Objects;
//Mydate로 만들어진 2개의 객체가 논리적으로 같은지 비교하는 equals를 오버라이딩하시오 

class MyDate{
	int year;
	int month;
	int day;
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
}



public class Home {
	public static void main(String[] args) {
		MyDate m1 = new MyDate(2002,1,14);
		MyDate m2 = new MyDate(2000,9,15);
		MyDate m3 = new MyDate(2002,1,14);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
	}
}
