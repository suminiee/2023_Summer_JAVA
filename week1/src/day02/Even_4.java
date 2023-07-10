package day02;

import java.util.Scanner;

public class Even_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요: ");
		int a = sc.nextInt();
//		
//		if((a&1) == 0)//비트연산자 1을 &해서 마지막 비트가 1이면 홀수이고 마지막 비트가 0이면 짝수 
//		//if (a%2 == 0)
//			System.out.println("짝수입니다.");
//		else
//			System.out.println("홀수입니다.");
		
		//입력된 정수가 음수인지 양수인지 판별하는 프로그램->과제
		if (a < 0)
			System.out.println("음수입니다.");
		else if (a == 0)
			System.out.println("0입니다.");
		else
			System.out.println("양수입니다.");
		
	}
}
