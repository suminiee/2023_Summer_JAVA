package day05;

import java.util.Arrays;

public class ReviewArray {

	public static void main(String[] args) {
		
		int [][] i2arr = { {1,2,3}, {4,5,6,7,8,9}, {0,1}};
		
		System.out.println(i2arr); //String, char[]의 경우 사용
		System.out.println(Arrays.toString(i2arr)); //1차원 int형배열인 경우 사용
		System.out.println(Arrays.deepToString(i2arr)); // 2차원 배열인 경우 사용
		
		String a = "abc";
		String b = "abc";
		
		String c = new String("abc"); //->객체 참조형 (c, d)에는 "abc"가 담겨있는 주소값이 담겨있음.
		String d = new String("abc");
		
		System.out.println(a==b); //True
		System.out.println(c==d); //False 
		
		System.out.println(c.equals(d)); //String 객체는 equals를 사용하여 같음을 판단한다.
		
		int [][] i2brr = { {1,2,3}, {4,5,6,7,8,9}, {0,1}};
		System.out.println(i2arr == i2brr); //false
		System.out.println(i2arr.equals(i2brr)); //false
		System.out.println(Arrays.deepEquals(i2arr, i2brr));//true
		
		int arr[] = {1,2,3,4,5,6};
		int brr[] = {1,2,3,4,5,6};
		System.out.println(Arrays.equals(arr, brr)); //true, 1차원 배열의 경우 사용
		
		//System.out.println(Math.PI);
		double pi = 3.14159;//3.142로 만들어야 << 3142.5로 만들어서 반올림..?한후에 다시 원래대로....?
		System.out.println(pi);
		System.out.println(Math.round(pi));//오로지 첫째자리 반올림만 가능한 함수->int형인가
		System.out.println(Math.round(pi*1000));//3142
		System.out.println(Math.round(pi*1000)/1000.0);//3.142
		
		
	}
}
