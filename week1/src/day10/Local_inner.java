package day10;

//클래스의 멤버메소드 안에 존재하는 클래스 : local inner class

interface Pagerable{
	public void page();
}

class Internet{
	private String pageName;

	public Internet(String pageName) {
		super();
		this.pageName = pageName;
	}
	
	public Pagerable getPageObject() { //멤버메소드 안에
		int b = 30;
//		(final)b = 40; //에러발생 -> local variable은 값을 변경 할 수 없음(final이 생략되었다고 생각하면 됨) 
		//final의 의미 -> 한 번 정하면 바꿀 수 없다는 의미.
		final int a = 10; 
//		a = 20; //=>에러발생. //a 값을 변경시킬 수 없음.
		//바꾸는 순간 문제 발생 -> 로컬클래스가 가지는 메소드보다 로컬클래스를 감싸는 메소드가 빨리 끝나면 변수가 사라지기 때문.
		class Chrome implements Pagerable{//local inner class
			public void page() { 
				System.out.println(a);
				System.out.println(b);//감싸는 메소드의 로컬 변수를 사용할 수 없다. 오직 final변수만 가능.
				System.out.println("page name: " + pageName);
			}
		}//end class
		return new Chrome(); //매개변수 type을 맞춰줘야함 => public void getPageObject -> public Pagerable getPageObject
	}
}

public class Local_inner {

	public static void main(String[] args) {
		Internet edge1 = new Internet("naver");
		Pagerable currentPage1 = edge1.getPageObject();
		currentPage1.page();
		
		Internet edge2 = new Internet("google");
		Pagerable currentPage2 = edge2.getPageObject(); //interface를 이용해서 객체를 생성해서 넣어줌,
		currentPage2.page();
		
		
	}
}
