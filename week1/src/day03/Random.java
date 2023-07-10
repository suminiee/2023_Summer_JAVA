package day03;

public class Random {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			//System.out.println(Math.random());
			//System.out.println(Math.random()*10);
			//System.out.println((int)(Math.random()*10));
			System.out.println((int)(Math.random()*8/*내가 만들려고 하는 범위의 개수가 * 뒤에 들어감*/-4));
		}
	}
}
