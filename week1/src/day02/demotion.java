package day02;

public class demotion {
	public static void main(String[] args) {
		double d = 97.000005;
		float c;
		int b;
		char a;
		
//		c=(float)d;
//		b=(int)c;
//		a=(char)b;
//		
//		System.out.println(a+" "+b+" "+c+" "+d);

		a=(char)(b=(int)(c=(float)d));
		System.out.println(a);
		
		
		
	}
}
