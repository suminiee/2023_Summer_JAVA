package day10;

class Address implements Cloneable{
	String add;
	int zip;
	public Address(String add, int zip) {
		super();
		this.add = add;
		this.zip = zip;
	}
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}
	@Override
	public String toString() {
		return "Address [add=" + add + ", zip=" + zip + "]";
	}
	
	
}
class Person implements Cloneable{ //속이 빈 marker interface
	int age;
	String name;
	Address ad; // is-a notebook extends computer : 상속 -> 노트북은 컴퓨터이다 //상속일때는 생성자로
				// has - a police 권총을 iv로 갖는다 : 포함 //포함일때는 new
	
	public Person(int age, String name,String add, int zip) { //생성자 만들어주기
//		super(); => object를 상속받았기 때문에 생략해도 상관없음.
		this.age = age;
		this.name = name;
		ad = new Address(add, zip);
	}

	@Override //clone을 오버라이딩해서 써야함.
	protected Person clone() throws CloneNotSupportedException {
			Person p = (Person)super.clone();
			p.ad = ad.clone();//복사를 한게 같은 주소값을 한 add.ad를 가리키고 있는데 이 ad를 또 복사해서 클론으로 만든 후 그 새 복사본을 가리키게 한다는 의미
			return p; //이렇게 되면 ad.add가 분리됨. Person(add)가 가리키는 주소값을 다르게 했기 때문.
			
//		return (Person)super.clone();//무조건 이 방법으로 호출해야함 //얘를 고쳐야 add.ad를 고쳤을 때 둘 다 복사되는 것을 분리시킬 수 있음
		
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", ad=" + ad + "]";
	}

//	@Override
//	public String toString() {
//		return "Person [age=" + age + ", name=" + name + "]";
//	}


	
	
}
public class Deep_2 {

	public static void main(String[] args)throws CloneNotSupportedException {
		Person p1 = new Person(24, "Felix", "서울특별시 강남구", 11111);
//		Person p2 = p1;
//		Person p2 = new Person(11, "chan"); //이렇게ㅏ안함
//		p2.age = 26;
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
		
//		Person p2 = (Person)p1.clone();//반환값이 object
//		System.out.println(p2.toString());
		Person p2 = p1.clone(); //반환값이 Object //1차원 배열에 잘 되던 객체복사
		p2.age = 10;
		p2.name="hyunjin";
		p2.ad.add = "제주"; //p1, p2가 둘 다 제주로 바뀜
		p2.ad.zip = 123;
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
