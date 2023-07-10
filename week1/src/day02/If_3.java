package day02;
//ctrl + d => 한 줄 삭제 단축키
import java.util.Scanner;

public class If_3 {
	
	public static void main(String[] args) {
		
		//int a = 7;
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("숫자를 하나 입력하세요: ");
		int a = scanner.nextInt();
		
		if (1<=a && a<=10) {
			System.out.println("a는 1과 10 사이의 수 입니다.");
		}
		else
			System.out.println("a는 1과 10 사이의 수가 아닙니다.");
		
	}
}

