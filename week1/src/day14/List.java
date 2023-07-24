package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("aaa");
		myList.add("bbb");
		myList.add("ccc");
		myList.add("ddd");
		
		//Iterator는 아래 세줄만 알면 됨. 모든 collection의 interface를 상속받음.
		Iterator<String> imyList = myList.iterator();//반복자
		
		System.out.println(imyList.next());//보여줘라
		imyList.remove();//next다음에 remove를 쓰면 next데이터가 삭제됨.
		System.out.println(myList);
		
		System.out.println(imyList.next());//보여줘라
		imyList.remove();//next다음에 remove를 쓰면 next데이터가 삭제됨.
		System.out.println(myList);
		
		
//		while(imyList.hasNext()) { //객체가 있다면
//			System.out.println(imyList.next()); //보여줘 
//			imyList.remove();
//		}
		
//		System.out.println(myList);
//		myList.add(1,"fff"); //1번째 위치에다 fff를 넣겠다 //임의의 위치에 데이터 삽입을 하는 속도가 빠르다.
//		System.out.println(myList); 
//		myList.addFirst("zzz");//제일 앞에 "zzz"를 삽입.
//		System.out.println(myList); 
		
		
		
	}
}
