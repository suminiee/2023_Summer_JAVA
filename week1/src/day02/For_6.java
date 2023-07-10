package day02;

public class For_6 {

	public static void main(String[] args) {
		
		int cnt;
		int sum=0;
		for(cnt = 1; cnt<=100; cnt++) {
			sum+=cnt;
		}
//			if((cnt&1)==0)
//				sum+=cnt;
//				System.out.print(cnt+" ");
//		}
		System.out.println("sum : "+sum);
		
	}
}

