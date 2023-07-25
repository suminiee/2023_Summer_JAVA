package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hash_map_review {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		
		String name;
		Integer age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("please enter the name: ");
		name = sc.nextLine();
		System.out.print("please enter the age: ");
		age = sc.nextInt();
		
		map.put(name, age);
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey() +", 나이 : "+e.getValue());
		}
		
	}
}
