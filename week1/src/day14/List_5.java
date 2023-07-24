package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class List_5 {
	public static void main(String[] args) {
		LinkedList<Integer> myLinked = new LinkedList<>();
		myLinked.add(111);
		myLinked.add(222);
		myLinked.add(333);
		myLinked.add(444);
		
		System.out.println(myLinked);
		myLinked.addFirst(777);
		myLinked.addLast(999);
		System.out.println(myLinked);
		//deque 양쪽으로 입출 가능하도록 하는.
	}
}
