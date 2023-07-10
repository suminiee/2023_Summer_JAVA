package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
//		//int[] arr = {1,2,3,4,5}; 
//		
//		int[] arr; //이런경우에는 stack에 저장됨.
//		arr = {1,2,3,4,5} -> 이렇게 쓰는 것은 안됨.
//		arr = new int[] {1,2,3,4,5}; //이렇게 쓰는 것은 가능함. => heap에 만들어진 배열의 주소를 arr에 저장해줌.
//	
//		
//		int[] brr = {1,2,3,4,5};
//		brr[0] = 7;
//		System.out.println(brr[0]);
//		System.out.println(brr);//[ : array, I : integer, 뒤의 @와 숫자는 array의 (메모리 상)주소값.
//		System.out.println(arr);//[ : array, I : integer, 뒤의 @와 숫자는 array의 (메모리 상)주소값.
//		System.out.println(Arrays.toString(brr)); //배열의 전체를 보고싶은 경우 이렇게 출력함. for문 사용 안해도 상관없음

		int score[] = new int[5]; //[]가 뒤로 와도 상관은 없음
		int sum=0;
		int average;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length-2; i++) {
			score[i]=sc.nextInt();
//			sum+=score[i];
			score[3]+=score[i];
		}
		average = score[3]/(score.length-2);	
//		score[3]=sum;
		score[4]=average;
		
		System.out.println(Arrays.toString(score));
	}

}


