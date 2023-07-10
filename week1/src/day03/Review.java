package day03;

public class Review {
	
	public static void main(String[] args) {
	
		int a = 267; // 1 0000 1011
		byte b = (byte)a; //에러발생
		System.out.println(b);
	
		a++;//268
		System.out.println(a);
		++a;//269
		System.out.println(a);
		//for문 사용시에 ++i, i++ 반목문 실행에는 전혀 상관 없음.
		
		int c = 1000000; //32bit == 4byte 
		int d = 3000000; //
		
		System.out.println((long)c*d);//overflow발생->long으로 캐스팅을 해줘야함->제대로 출력됨
		
//		int x = 11;
//		if (x > 0 && x <10)//1~9
//		if (0 < x && x <10)//0<x<10

		System.out.println((int)'0');
		System.out.println((int)'A');
		System.out.println((int)'a');
		
		char ch = 'D';
		if ('A'<=ch && ch<='Z')
		{	
			System.out.println((char)ch+"는 대문자입니다.");
			System.out.println("해당문자를 소문자로 표현하면 "+(char)(ch+32)+"입니다.");
		}
		else {
			System.out.println((char)ch+"는 소문자입니다.");
			System.out.println("해당문자를 대문자로 표현하면 "+(char)(ch-32)+"입니다.");
		}
		
		ch = 'b';
		if ((ch&32)==0){// --1- ---- -> 소문자, --0- ---- ->대문자 , 32비트자리수에 해당하는 것만 확인하면 됨
			System.out.println((char)ch+"는 대문자입니다.");
			System.out.println("해당문자를 소문자로 표현하면 "+(char)(ch^32)+"입니다.");
		}
		else {
			System.out.println((char)ch+"는 소문자입니다.");
			System.out.println("해당문자를 대문자로 표현하면 "+(char)(ch^32)+"입니다.");
			
		}
		//이렇게 코딩하면 ABcde -> abCDE로 바꿀 수 있음. (비트연산자 사용하여)
		
		//문자-->숫자 의 경우 : 문자-'0'을 해주면 된다.
		ch = '1';
		System.out.println(ch-'0');//char - char 형태의 경우 int 형태로 결과가 나옴. : byte short int long 정수형의 4가지 타입.
		System.out.println(ch-'0'+2);
		
		//숫자-->문자열의 경우 : 2 + ""(빈 문자열, 자바에서는 빈 문자열을 허용함.) 	--> "2"
		//문자-->문자열의 경우 : '2' + "" 									--> "2"
		
		//문자열 --> 숫자
		int num = Integer.parseInt("2"); //상당히 자주 쓰임. "2"라는 문자열을 숫자 2로 바꾸어 줌
		System.out.println(num + 10);
		
		double bnum = Double.parseDouble("3.14"); //"3.14"라는 문자열을 숫자 3.14로 바꾸어  줌.
		System.out.println(bnum+1);
		
		//문자열 --> 문자
		System.out.println("7".charAt(0)/*(여기까진 char)*/-'0' /*여기까지 int*/ +3 /*int값에 3을 더한 것과 같음*/);
		System.out.println("756".charAt(1));
		
	}
}
