package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class List_4_Queue_2 {
	public static void main(String[] args) {
		LinkedList<Integer> myQueue = new LinkedList<>();
		myQueue.add(111);
		myQueue.add(222);
		myQueue.add(333);
		myQueue.add(444);
		
		//iterator 객체를 만들어 출력하시오 hasNext, Next, remove
		
		Iterator<Integer> imyQueue = myQueue.iterator();	
		while(imyQueue.hasNext()) {
			System.out.println(imyQueue.next());
//			imyQueue.remove();
		}
		
	}
}
