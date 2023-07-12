package day06;

class Point{
	int x = 10;
	int y = 20;
	
	public Point(){}
	public Point(int x, int y){
		super(); //없어도 상관없음(자동으로 해줌)
		this.x = x;
		this.y = y;
	}
}

//포함관계에서는 참조변수를 new로 반드시 생성 (대입 또는 생성자에
//상속관계에서는 인스턴스 변수가 그대로 상속된다.(super를 사용한 부모생성자 호출)
class Point3d extends Point{
//	Point pp = new Point();
	int z = 30;
	
	public Point3d(){}
	
	public Point3d(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3d [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}

class MyPoint3d{
	int x = 10;
	int y = 20;
	int z = 30;
}

public class Review_inheritance_class {

	public static void main(String[] args) {
		
		Point3d ob =  new Point3d();
		Point3d ob2 = new Point3d(4,5,6);
		Point3d ob3 = new Point3d(7,8,9);
		
//		System.out.println(ob.x);
//		System.out.println(ob.y);
//		System.out.println(ob.z);
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
