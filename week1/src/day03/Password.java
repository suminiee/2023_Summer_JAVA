package day03;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		int pw = 1234;
		int pw2;
		int chance = 5;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("비밀번호를 입력하세요: ");
			pw2 = sc.nextInt();
			if (pw == pw2) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다.");
				chance--;
				if (chance == 0) {
					System.out.println("경찰서로 가세요.");
					break;
				}
				System.out.printf("기회가 %d번 남았습니다.", chance);
			}
				
				
		}while (chance > 0);
	}
}
