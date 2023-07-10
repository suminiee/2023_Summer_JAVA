package day03;

import java.util.Scanner;

public class SearchGame {
	
	public static void main(String[] args) {
	
		int cnt = 0;
		//랜덤한 임의 값 하나를 꺼냄
		int a = (int)(Math.random()*100+1);
		//int prenum = 0;
		//System.out.println(a); //랜덤한 숫자가 뭔지 찍어주는 코드
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("숫자를 입력하세요: ");
			int user_num =  sc.nextInt();
			//prenum = user_num;//이전에 입력됐던 숫자 기억

			if (user_num < a) { //user가 입력한 숫자가 더 작은 경우
//				if (prenum < user_num) { //임의 값이 처음 입력한 수 보다 더 크다그랬는데, 처음 입력한 수 보다 더 작은 수를 입력했을 때
//					System.out.println("왜 작은값을 넣었나요?");
//				}
				System.out.println("임의 값이 입력한 숫자보다 큽니다.");
				cnt++;
				//prenum = user_num;//이전에 입력됐던 숫자 기억
			}

			else if (user_num > a) {
//				if (prenum > user_num) {
//					System.out.println("왜 큰 값을 넣었나요?"); //임의 값이 처음 입력한 수 보다 더 작다그랬는데, 처음 입력한 수 보다 더 큰 수를 입력했을 때
//				}
				System.out.println("임의 값이 입력한 숫자보다 작습니다.");
				cnt++;
				//prenum = user_num;//이전에 입력됐던 숫자 기억

			}
			else {
				System.out.println("정답입니다.");
				cnt++;
				System.out.printf("%d번 만에 답을 맞췄습니다.", cnt);
				break;
			}

		}while (true);
	}
}
