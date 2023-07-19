package day10;

import java.util.Arrays;
import java.util.Iterator;

public class Deep {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		int[] brr = arr; //copy (얕은 복사)
//		(brr이 가리키는게 arr이 가리키는 주소와 같은거임, 그래서 brr[0]을 222로 바꾸는 순간 arr도 쳐다보는 곳이 같으니 둘 다 222가 출력된다)
		brr[0] = 222;
		
//		System.out.println(Arrays.toString(arr)); //print array [arr]
//		System.out.println(Arrays.toString(brr)); //print array [brr]

		int[] crr = {1,2,3,4,5};
		int[] drr = crr.clone();//deep copy => 객체를 보호하려고 사용 //변경, 유지에 있어서 객체가 안보이는 경우도 있어야 함.
		
		drr[0]=333; //deep copy (drr[0]가 가리키는 값만 바뀌고 crr은 그대로)
//		System.out.println(Arrays.toString(crr));
//		System.out.println(Arrays.toString(drr));
		
		//2차원배열
		int[][] err = {{1,2,3,4,5},{6,7,8,9,10}};
		int[][] frr = err;
//		int[][] grr = err.clone(); //2차원배열에서는 먹히지않음. => for문으로 복사를해야함
		
//		frr[0][0] = 333;
//		for (int i = 0; i < err.length; i++) {
//			for (int j = 0; j < err[0].length; j++)
//				frr[i][j] = err[i][j];
//		}
		
		
		int [][] hrr = new int [err.length][err[0].length];
		for (int i = 0; i < err.length; i++) {
			for (int j = 0; j < err[0].length; j++)
				hrr[i][j] = err[i][j]; //2차원 배열은 객체 생성 후 직접 대입
		}
		hrr[0][0] = 333;
		
		System.out.println(Arrays.deepToString(err));
		System.out.println(Arrays.deepToString(frr));
	}
}
