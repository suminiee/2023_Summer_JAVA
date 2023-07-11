package day05;

class Member{
	String name;
	int point;
	String id;
	//클래스 변수 만들기
	static int memberCount = 0;
	
	//생성자에 이름과, 포인트, 아이디를 매개변수로 하도록 -> 여기서 회원수 추가됨.
	Member(String name, int point, String id){
		this.name = name;
		this.point = point;
		this.id = id;
		memberCount++;
	}
	
	//객체가 생성될 때(회원이 1명씩 늘 때) -> 클래스 변수를 증가하여 전체 회원수를 출력하도록 method만들기 -> 
	//registerCount()
	static void registerCount() {
		System.out.println("전체 회원 수: "+ memberCount);
	}
	
	//포인트에 대한 getter, setter를 만들기
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//이름, 포인트, 아이디를 출력하는 메소드
	//displayMember()
	public String displayMember() {
		return "Member [name=" + name + ", point=" + point + ", id=" + id + "]";
	}
	
}


public class Register {

	public static void main(String[] args) {
		
		Member user1 = new Member("이재현", 7, "leejaehyun");
		Member user2 = new Member("류지혁", 42, "ryujihyuk");
		Member user3 = new Member("김현준", 58, "kimhyunjun"); //클래스에 입력
		
		Member.registerCount(); //멤버 수 출력
		
		System.out.println(user1.displayMember());
		System.out.println(user2.displayMember());
		System.out.println(user3.displayMember()); //이름, 포인트, 아이디 메소드 통해서 출력
		
	}
}
