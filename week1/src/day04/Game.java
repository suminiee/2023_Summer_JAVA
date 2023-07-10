package day04;

import java.util.Scanner;

public class Game {
	//가위 바위 보 담겨있는 문자열 배열에서 랜덤으로 하나씩 10번 뽑아서 출력하기.
	public static void main(String[] args) {
		
		String[] sarr = {"가위", "바위", "보"};
		
		//기본형 (primitive) byte, char, short, int, long, float, double, boolean
		//참조형 (reference) 클래스, 인터페이스, 배열
		String a = "a";
		String b = "b";
		a = a + b; //=>참조, 변수 a가 가지고 있는 주소값이 "ab"의 주소값으로 바뀜
		System.out.println(a);
		
		
		Scanner sc = new Scanner(System.in);
		
		int rnum;
		for (int i = 0; i < 10; i++) {
			rnum = (int)(Math.random()*3);
			System.out.println(sarr[rnum]);
		}
		
	}

}
