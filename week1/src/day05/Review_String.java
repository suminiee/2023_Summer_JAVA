package day05;

//import java.util.Iterator;
import java.util.Scanner;

public class Review_String {

	public static void main(String[] args) {
		
		String sarr[] = new String[3];
		
		sarr[0] = "abc";
		sarr[1] = "def";
		sarr[2] = "xyz";
		
		String s2arr[][] = new String[][] {{"sun", "태양"}, {"airplane", "비행기"}};
		System.out.println(s2arr[0][0]);
		System.out.println(s2arr[0][1]);
		System.out.println(s2arr[1][0]);
		System.out.println(s2arr[1][1]);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String instr = sc.nextLine();
			if (instr.equals("no"))
				break;
			for (int i = 0; i < s2arr.length; i++) { //행(row)의 길이가 2
				if (instr.equals(s2arr[i][0])) {
					System.out.println("입력한 사전의 뜻은 "+s2arr[i][1]+"입니다.");
					break;
				}
				else {
					System.out.println("그런 단어는 없어요.");
					break;
				}
			}
			System.out.println("더 검색이 필요한가요??");
			System.out.println("no를 입력하면 종료됩니다.");
		
		}
	}
}
