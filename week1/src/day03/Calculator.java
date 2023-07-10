package day03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		aaa:
		while(true) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
//			System.out.println("3. 종료");
			System.out.print("원하는 사칙연산을 입력하세요: ");
			int op = sc.nextInt();
//			if (op == 3) {
//				System.out.println("계산기 프로그램을 종료합니다.");
//				break;
//			}
	
			while(true) {
				System.out.print("숫자 두 개를 입력하세요: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if (num1 == 0 && num2 == 0)
					break;
				
				if (num1 == 9 && num2 == 9) {
					System.out.println("프로그램을 종료합니다.");
					break aaa;
				}
				switch(op) {
				
				case 1: 
					System.out.println(num1+"+"+num2+"="+(num1 + num2));
					//덧셈
					break;
					
				case 2:
					System.out.println(num1+"-"+num2+"="+(num1 - num2));
					//뺄셈
					break;
				default:
					System.out.println("그 외의 연산은 없습니다.");
				}
			}
		}
		
	}
}
