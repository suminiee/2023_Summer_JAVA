package day10;

public class Reference {
	public static void main(String[] args) {
		String a1 = "abc";
		String a2 = "abc";
		String a3 = new String("abc");//얘네는 heap 공간에 매번 새로 할당하니까 논리적으로 같은 데이터가 여러개 존재하게 됨. => 비효율적.
		String a4 = new String("abc");
		
		System.out.println(a1 == a2);//true //주소값
		System.out.println(a1.equals(a2));//true //물리적으로 같은 객체인지("abc")

		System.out.println(a3 == a4);//false => 논리적 주소는 다르지만 //주소값
		System.out.println(a3.equals(a4));//true => 논리적 값("abc")는 같음.
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		
		System.out.println(System.identityHashCode(a1));//925858445
		System.out.println(System.identityHashCode(a2));//925858445 //a1, a2는 같은 주소값을 가짐. (hash code값도 같아야 [equal, hashcode true] 같은 값이 나옴)
		System.out.println(System.identityHashCode(a3));//798154996
		System.out.println(System.identityHashCode(a4));//681842940
		System.out.println();
		
		
		//boxing int -> integer로 감싸는 것
		//unboxing Integer -> int로 빼내는 것
		Integer b1 = 10;
		Integer b2 = new Integer(10);//wrapper class:기본타입을 감싸주는 클래스
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(b2));
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//true
		//=>주소값은 다른데 논리적으로 같은 값(10)을 가지고 있다는 의미.
		
		/*
		 초기화시키고 싶은경우
		 String a1 = "";
		 String a2 = "";
		 String c3 = "";으로 해야함.
		 */

		
		
		
	}

}
