package day02;

import java.util.Scanner;

public class Switch_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
//		int a =10;
//		
//		switch(a) {
//		case 1:
//			System.out.println(1);
//			break;
//		case 2:
//			System.out.println(2);
//			break;
//		case 3:
//			System.out.println(3);
//			break;
//		case 10:
//			System.out.println(10);
//			break;
//		case 11:
//			System.out.println(11);
//			break;
//		}
		
		//switch case break문을 사용하여 입력 수에 따라 학점을 출력하는 프로그램(과제)
		//100~90 : A, 89~80 : B, 79~70 : C, 그 외 F
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F");
			break;
			
			
			
			
			
			
			
		}
		
	}
}
