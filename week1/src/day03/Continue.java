package day03;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i%2!=0)
				continue; //홀수면 건너 뛰어라, 밑에 실행 안하고 for문 조건으로 돌아감
			System.out.println(i);
		}
	}
}
