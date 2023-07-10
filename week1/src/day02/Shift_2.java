package day02;

public class Shift_2 {
	//ctrl + alt +밑 화살표 => 복사 단축키
	
	public static void main(String[] args) {
		//int a = 10; //0000 1010
		              //0000 0101 10/2
				      //0001 0100 10*2
		
		int a = -10; //1111 0110
					 //"1"111 1011 -10/2 음수 부호 유지 위해서 왼쪽 앞 비트를 1로 채움
					 //"0"111 1011 앞 비트를 0으로 채우고 싶을 때 >>>를 사용함 , 부호 상관 없이
		
		
		System.out.println(a>>1); //5
		System.out.println(a<<1); //20
		System.out.println(a>>>1); //5 값은 같음

	}

}
