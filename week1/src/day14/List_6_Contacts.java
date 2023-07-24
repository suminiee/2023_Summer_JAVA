package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

//내가 만들ㅇ러 낸 클래스 객체를 정렬하는 방법
//1. implements Comparable 구현
//2. CompareTo 오버라이드

//collection이해 후 내가 만든 클래스를 적용해봐야한다

//default비교기준 : 대부분의 클래스에서 구현하고 있음.
//전화번호, 이륾 Comparable 구현 (반드시 complareTo 구현 필요) => 객체 정렬을 위해서 (내맘대로)
//private -> getter, setter 필요
//생성자, toString, hashCode, equals
class Contacts implements Comparable<Contacts>{
	private int telNumber;
	private String name;
	
	public Contacts(int telNumber, String name) {
		super();
		this.telNumber = telNumber;
		this.name = name;
	}
	

	public int getTelNumber() {		return telNumber;	}
	public void setTelNumber(int telNumber) {		this.telNumber = telNumber;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}


	@Override
	public int hashCode() {
		return Objects.hash(name, telNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacts other = (Contacts) obj;
		return Objects.equals(name, other.name) && telNumber == other.telNumber;
	}


	@Override
	public String toString() {
		return "Contacts [telNumber=" + telNumber + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Contacts o) {//정렬기준 만들기
//		return name.compareTo(o.name);//abcd순으로 정렬됨(이름 기준)
//		return o.name.compareTo(this.name); //dcba가 됨.(내림차순)
//		return telNumber - o.telNumber; //1234 오름차순으로 정렬됨
		return o.telNumber - telNumber; //4321 내림차순으로 정렬됨 (decending)
	}
	
}

class ContactsArrayList{
	private ArrayList<Contacts> arrList;
	
	public ContactsArrayList() {arrList = new ArrayList<Contacts>();}
	public void addContacts(Contacts con) {		arrList.add(con);	}
	
	public boolean removeContacts(int telNumber) {
		for (int i = 0; i < arrList.size(); i++) {
			Contacts tmp = arrList.get(i);
			int tmpNum = tmp.getTelNumber();
			if (tmpNum == telNumber) {
				arrList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeContacts(String fname) {
		Iterator<Contacts> ia = arrList.iterator();//반복자
		while(ia.hasNext()) {
			Contacts cs = ia.next();
			if(cs.getName().equals(fname)) {
				arrList.remove(cs);
				System.out.println("삭제되었습니다.");
				return true;
			}
		}
		System.out.println("찾으시는 "+fname+"님은 없습니다.");
		return false;
	}
	
	
//	public boolean removeContacts(String fname) {
//		for (int i = 0; i < arrList.size(); i++) {
//			Contacts tmp = arrList.get(i);
//			String tmpNum = tmp.getName();
//			if (tmpNum.equals(fname)) {
//				arrList.remove(i);
//				System.out.println(fname+"님의 정보가 삭제되었습니다.");
//				return true;
//			}
//		}
//		System.out.println("찾으시는 "+fname+"님은 없습니다.");
//		return false;
//	}
	
	
	public void ShowContacts() {
		for (Contacts c : arrList) {
			System.out.println(c);
		}
		System.out.println();
	}
	public void sort() {//has-a 형태로 가져온 ArrayList의 정렬을 구현하려고.
//		Collections.sort(arrList);
		Collections.sort(arrList,Collections.reverseOrder());
	}
	
	
}
public class List_6_Contacts {
	public static void main(String[] args) {
		ContactsArrayList ConAL1 = new ContactsArrayList();//첫 번째 유심 연락처;
		Contacts p1 = new Contacts(111, "aaaa");
		Contacts p2 = new Contacts(222, "bbbb");
		Contacts p3 = new Contacts(333, "cccc");
		Contacts p4 = new Contacts(444, "dddd");
		
		ConAL1.addContacts(p1);//ConAL1안에는 순서가 있는 ArrayList
		ConAL1.addContacts(p3);
		ConAL1.addContacts(p4);
		ConAL1.addContacts(p2);
		
		ConAL1.ShowContacts();
		ConAL1.sort();//내부 arrList 객체가 private이기 때문에 아랫줄 사용불가 //
		ConAL1.ShowContacts();//정렬된것을 확인할 수 잇음.
		
		ConAL1.removeContacts("bbbb");
		ConAL1.removeContacts("felix");
		ConAL1.ShowContacts();
//		Collections.sort(ConAL1.arrList);//objects, collections
	}
}
