package day05;

import java.util.Scanner;

//[과제 5]
//입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램
//
//문자열을 입력하세요. : apple
//a
//ap
//app
//appl
//apple

public class Assignment4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String word = sc.next();
//		System.out.println(word);
//		System.out.println(word.charAt(0)); //0일때 x, 1일때 y, 2일때 z
		
		for (int i = 0; i <word.length(); i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}
}
