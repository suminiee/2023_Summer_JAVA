package day05;

import java.util.Scanner;

//[과제 4]
//숫자를 입력 받아서 
//a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
//- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
//    - 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
//
//숫자를 입력하세요: 7
//결과 값 : 16
//
//숫자를 입력하세요: 10
//결과 값 : 30


public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNum;
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt();
		if (inputNum %2 == 0)
			evenNum(inputNum);
		else
			oddNum(inputNum);
	}
	
	static void evenNum(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.printf("결과 값: %d", sum);
		
		
	}
	
	static void oddNum(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.printf("결과 값: %d", sum);
		
	}
	
}
