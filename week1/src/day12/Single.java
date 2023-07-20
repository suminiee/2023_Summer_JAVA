package day12;

class Company{
	private Company(){}//밖에서 못만들려면 생성자를 호출 못하게
	private static Company com = new Company();//클래스 안에서 객체를 하나 만들어야함 //호출은 가능하게 하려면 static******을 써줘야함.
	
	public static Company getInstance() { //static******
		if(com==null)//한번도 만들어지지 않았다면
			com = new Company();
		
		return com;
	}
}


public class Single {
	public static void main(String[] args) {
		Company mega1 = Company.getInstance();
		Company mega2 = Company.getInstance();
		System.out.println(System.identityHashCode(mega1));
		System.out.println(System.identityHashCode(mega2));
	}
}
