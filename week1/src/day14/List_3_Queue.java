package day14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class List_3_Queue {
	public static void main(String[] args) {
		Queue<String> myQueue = new LinkedList<>();
		myQueue.add("aaa");
		myQueue.add("bbb");
		myQueue.offer("ccc");
		myQueue.offer("ddd");
		
		//Iterator는 아래 세줄만 알면 됨. 모든 collection의 interface를 상속받음.
		Iterator<String> imyQueue = myQueue.iterator();//반복자
		
		while(imyQueue.hasNext()) {
			System.out.println(imyQueue.next());
//			imyStack.remove();
		}
		System.out.println(myQueue);
		System.out.println(myQueue.poll());//첫번째 값 반환, 비어있으면 null
		System.out.println(myQueue.remove());//보면서 빼기, 비어있으면 NoSuchElementException발생
		System.out.println(myQueue.remove());
		System.out.println(myQueue.poll()); //앞에 remove에 의해서 bbb ccc 가 지워졌어야되는데...?
//		System.out.println(myQueue.contains("bbb"));
		
//		tree의 level order(층별순회)
//		graph의 너비우선탐색 쓰인다
//		priority Queue (우선순위 큐) -> 우선순위 탐색(최소 비용 스패닝트리 - minimum cost spanning tree)
		
		
	}
}
