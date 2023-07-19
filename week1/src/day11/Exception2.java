package day11;

public class Exception2 {
	
	static void aircon() throws ArithmeticException{//이러한 에러가 발생할 수 있다. //해당 메소드에서 발생할 것 같은 exception 나열(, 찍고 다른 exception을 더 쓰면 됨)java virtual machine JVM
		System.out.println(10/0);
	}
	static void remocon() throws ArithmeticException{//에러 발생이 얘한테 던짐
		aircon();
	}
	public static void main(String[] args) /*throws ArithmeticException*/{//안고쳣음? 또 얘한테 던짐. main에서 잡았으면 throws exception안적어도 됨. 
	try {
		remocon();
	} catch (ArithmeticException e) {
		System.out.println("main에서 잡았다.");
	}
	}
}
