package day05;

import java.util.Scanner;

//java.util.Scanner 클래스 사용입력된 수가 3의 배수인지 판별하는 프로그램을 작성하세요.

public class Assignment1 {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력: ");
		num = sc.nextInt();
		calculate(num);
		
	}
	
	static void calculate(int a) {
		if (a % 3 == 0)
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다.");
	}
}
