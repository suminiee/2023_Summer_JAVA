package day14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class List_8 {
	public static void main(String[] args) {
		HashMap map = new LinkedHashMap(); //순서가 없다.
		map.put("id1111", 1111);
		map.put("id2222", 2222);
		map.put("id3333", 3333);
//		System.out.println(map.get("id1111"));//1111이 출력됨.
//		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		Integer pwd = sc.nextInt();
		while(true) {
			
			if(!map.containsKey(id)) {
				System.out.println("없습니다.");
				System.out.print("아이디: ");
				id = sc.nextLine();
				continue;
			}
			else {
				if (map.get(id).equals(pwd)) {
					System.out.println("일치합니다.");
					break;
				}
				else {
					System.out.println("다시 비밀번호를 입력해주세요");
					System.out.print("비밀번호: ");
					pwd = sc.nextInt();
				}
			}
		}
	}
}
