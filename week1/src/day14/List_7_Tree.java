package day14;

import java.util.Comparator;
import java.util.TreeSet;


//Comparable -> compareTo 오버라이딩 : 대부분의 collection 클래스가 구현(기존 정렬)
//Comparator -> compare : 사용자가 임의로 구현(기존 정렬기준을 바꿀 때), 객체 생성 생성자 매개변수
class CmpTest implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return (o1.compareTo(o2)) * -1;
	}
	
}





public class List_7_Tree {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<String>(new CmpTest());//중위순회가 되어서 c,b,a순으로 넣어도 a,b,c로 정렬되어 들어감. 오름차순이 디폴트. 그치만 CmpTest했으므로 cba순으로 출력됨.
//		set.add("CCC");
//		set.add("BBB");
//		set.add("AAA");
//		System.out.println(set);
		
		TreeSet set = new TreeSet();
		int[] arr = {7,8,9,5,3,4,2,1,10};
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);//자동으로 정렬돼서 나옴!(tree)
		System.out.println(set.headSet(5)); // < 5 (5보다 작은 것을 보여줌)
		System.out.println(set.tailSet(5)); // >= 5 (5보다 크거나 같은 것을 보여줌.)
	}
}
