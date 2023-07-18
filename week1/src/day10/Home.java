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
	public boolean equals(Object obj) {
		
	}

	public int hashCode() {
		return Objects.hash(day, month, year);
	}
}



public class Home {
	public static void main(String[] args) {
		
	}
}
