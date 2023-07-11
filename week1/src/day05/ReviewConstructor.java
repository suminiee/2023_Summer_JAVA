package day05;

class Person{
	int age = 9; //인스턴스 변수, '객채.변수명' 으로 접근 //인스턴스 변수는 자동초기화가 됨, (int : 0, boolean : false, String : null)
	
	//age에는 제일 먼저 0이 들어가있다가 9가 들어가고 그다음에 10이 들어감.11,12,13까지 차례대로 들어감
	
	static int countEye = 2; //클래스 변수, '클래스.변수명'으로 접근, 자동초기화 0
	static int siarr[] = new int[100]; //{1,2,3,4,5,6,7,8,9,10...}
	
	{//인스턴스 초기화 블럭
		age = 10;
	}
	
	static { //class변수 초기화 블럭
		countEye = 4;//신생아가 태어나며서 안경썼다. (0->2->4)
		for (int i = 0; i < siarr.length; i++)
			siarr[i]=i+1;
	}
	
	Person(){
		//a += 1; (X)
		this(1); //이때의 this는 생성자 호출을 의미한다. Person(1); 의미적으로 같다. this "생성자"
	}//default //생성자 호출 위에는 식이 있어서는 안된다. //반드시 첫줄이다.
	
	Person(int age){ //명시적 생성자 //default생성자가 사라진다.
		this.age = age; //this "객체"
	}
	
	void setAge(int age) {
		this.age = age;//age <- local 변수/ this.age <- 인스턴스 변수가 됨.
	}
}

public class ReviewConstructor {

	public static void main(String[] args) {
		
		Person man1 = new Person(11); //age == 11
		man1.age = 12;//age == 12
		man1.setAge(13);//age == 13 
		
		
	}
}
