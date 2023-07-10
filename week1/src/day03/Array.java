package day03;

public class Array {
	
	public static void main(String[] args) {
		
//		int[] iarr = new int [5]; 		   //[0][0][0][0][0]
//		int[] ibrr = {1,2,3,4,5}; 		   //[1][2][3][4][5]
//		int[] icrr = new int[] {1,2,3,4,5}; //[1][2][3][4][5]
//		
//		System.out.println(ibrr[0]);
//		System.out.println(ibrr[1]);
//		System.out.println(ibrr[2]);
//		System.out.println(ibrr[3]);
//		System.out.println(ibrr[4]);
//		
//		
//		for (int i = 0; i < ibrr.length; i++) {
//			System.out.println(ibrr[i]);
//		}
//		
		
		int [] imrr = {3,4,1,5,2};
		int max = imrr[0]; //가장 큰 수 출력할 수 있도록 함
		int min = imrr[0];
		for (int i = 1; i < 5; i++) {
			if (max < imrr[i])
				max = imrr[i];
			if (min > imrr[i])
				min = imrr[i];
			else
				continue;
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}

}
