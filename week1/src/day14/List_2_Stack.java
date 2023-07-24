package day14;

import java.util.Iterator;
import java.util.Stack;

public class List_2_Stack {
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		myStack.push("aaa");
		myStack.push("bbb");
		myStack.push("ccc");
		myStack.push("ddd");
		
		//Iterator는 아래 세줄만 알면 됨. 모든 collection의 interface를 상속받음.
		Iterator<String> imyStack = myStack.iterator();//반복자
		
		while(imyStack.hasNext()) {
			System.out.println(imyStack.next());
//			imyStack.remove();
		}
		System.out.println(myStack);
		System.out.println(myStack.peek());//엿보다 (안뺌)
		System.out.println(myStack.pop());//보면서 빼기
		System.out.println(myStack.size());//스택 크기
		System.out.println(myStack.empty());//비어있는지 확인
		System.out.println(myStack.contains("bbb"));//bbb랑 똑같은 애가 있나
		
		
	}
}
