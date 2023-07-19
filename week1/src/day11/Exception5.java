package day11;

import java.util.Scanner;

//try ~ catch : 잡기
//throws 으로 떠 넘기기 (호출한 쪽으로

class AgeInputException extends Exception{
	public AgeInputException() {
		super("음수를 적으셨네용^^..");
	}
}

class Register{
	//main에 있는 readAge() 메서드를 이쪽으로 옮기기
	public static int readAge() throws AgeInputException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0) {
			AgeInputException myE = new AgeInputException();
			throw myE;
		}
		return age;
	}
}

public class Exception5 {
	public static void main(String[] args) {
//		Register rg = new Register();//static method이기 때문에 객체 생성 할 필요도 없음. //static은 객체의 유무에 상관 없이 호출이 가능.
		System.out.print("나이 입력: ");
		try {
			int age = Register.readAge(); 
			System.out.println("나이는: "+ age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
