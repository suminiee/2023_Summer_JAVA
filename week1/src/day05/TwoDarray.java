package day05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TwoDarray {
	
	public static void main(String[] args) {
		int score[][] = new int[3][6];//[3x6]
		String sname[] = {"국어", "영어", "수학"};
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3;i++) {//i는 사람
			for (int j = 0; j < 3; j++) {//j는 과목별 점수
				System.out.print(sname[j]+"점수 입력: ");
				score[i][j] = sc.nextInt();
				score[i][3]+=score[i][j];//점수의 총 합을 구할 수 있도록 함.
			} 
			score[i][4] = score[i][3]/3;//평균
		}
		//모든 점수를 입력한 뒤
		//rank 구하기
		
		Arrays.sort(score, Comparator.comparingInt((int o[])->o[3]).reversed());//내림차순 정렬
		
		int rank = 1;//등수 부여
		
		for (int i = 0; i < score.length;i++) {//i는 사람
			score[i][5] = rank;
			rank++;
			for (int j = 0; j < score[i].length; j++) {//j는 과목별 점수
				System.out.print(score[i][j]+" ");
			} 
			System.out.println();
		}
		
//		Arrays.sort(score, Comparator.comparingInt((int o[])->o[3]));
		
		
		
		
//		System.out.println(Arrays.deepToString(score));
	}
}
