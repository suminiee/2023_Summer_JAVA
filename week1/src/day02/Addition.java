package day02;
import java.util.Scanner;


//ctrl + shift + O 누르면 자동으로 import java.util.Scanner; 해줌
//ctrl + i 누르면 자동 정렬됨.

public class Addition {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print("첫번째 수: ");
		int op1 = scanner.nextInt();
		System.out.print("두번째 수: ");
		int op2 = scanner.nextInt();
		
		System.out.println(op1 + op2);
	}

}
