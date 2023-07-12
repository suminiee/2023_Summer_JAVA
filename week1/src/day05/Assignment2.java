package day05;

import java.util.Arrays;

//[과제3]
//출력 값이 다음과 같도록  클래스를 완성하세요
//[화면출력]
//1 2 3 4 5 6 7 8 9 10
//2 3 4 5 6 7 8 9 10 11
//3 4 5 6 7 8 9 10 11 12
//...
//8 9 10 11 12 13 14 15 16 17
//9 10 11 12 13 14 15 16 17 18

public class Assignment2 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < 9; i++) {
			System.out.println(Arrays.toString(arr));
			for (int j = 0; j < 10; j++) {
				arr[j] = arr[j]+1;
			}
		}
		
	}
}
