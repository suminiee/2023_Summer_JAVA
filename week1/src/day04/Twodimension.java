package day04;

import java.util.Arrays;
import java.util.Iterator;

public class Twodimension {

	public static void main(String[] args) {
		
		System.out.println("xyz".charAt(0)); //0일때 x, 1일때 y, 2일때 z
		
		//iarr[]안에 1~45를 차례대로 넣음.
		int iarr[] = new int [45];
		int cnt = 0;
		for (int i = 0; i < iarr.length; i++) {
			iarr[i]=++cnt;
		}
		
		int tmp;
		int rnum;
		//배열 1~45를 섞어서 다시 배열(suffle)
		for (int i = 0; i <20000; i++) { //swap을 20000번 함.
			rnum = (int)(Math.random()*45);
			tmp = iarr[0];
			iarr[0] = iarr[rnum];//iarr[0~44]
			iarr[rnum] = tmp;
		}
		System.out.println(Arrays.toString(iarr));
		
		//다시 오름차순으로 sort해줌.
		Arrays.sort(iarr);
		System.out.println(Arrays.toString(iarr));
		
		
		//int [][] i2arr = new int[3][6]; //[2x3] 배열 (2줄(row), 3칸씩(column)ㅁㅁㅁ
										//							        ㅁㅁㅁ
		
		//2차원배열에 숫자 집어넣는거 { { },{ }, { } } 요런느낌
//		int i3arr[][] = {
//				{1,2,3},
//				{4,5,6,7,8,9},
//				{10,11}
//				};
//		
//		//배열 출력할 때는 for문 사용
//		
//		for (int i = 0; i < i3arr.length /*얘가 가변적으로 실행할 수 있도록 해줌.*/; i++) {
//			for (int j = 0; j<i3arr[i].length; j++)
//				System.out.print(i3arr[i][j]+"	");;
//			System.out.println();
//		}
		

//		int num = 0;
//		for (int i = 0; i < i2arr.length; i++) {
//			for (int j = 0; j<i2arr[i].length; j++)
//				i2arr[i][j] = num++;
//		}
//		
//		for (int i = 0; i < i2arr.length; i++) {
//			for (int j = 0; j<i2arr[i].length; j++)
//				System.out.print(i2arr[i][j]+"	");;
//			System.out.println();
//		}
		
	}
}
