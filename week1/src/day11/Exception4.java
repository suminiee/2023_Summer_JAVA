package day11;
//try ~ catch : 잡기
//throws 으로 떠 넘기기 (호출한 쪽으로

public class Exception4 {
	public static void main(String[] args) {
		throw new RuntimeException("unchecked exception");
	}//사용자 임의로 exception을 발생시키는 throw 
}
