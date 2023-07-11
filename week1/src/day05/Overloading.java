package day05;

class MyMath{
	
	int sum(int n1, int n2) {return n1 + n2;}
	long sum(int n1, long n2) {return n1 + n2;}
	long sum(long n1, int n2) {return n1 + n2;}
	float sum(float n1, float n2) {return n1 + n2;}
	int sum(int n1[]) {
		int hap = 0;
		for (int i = 0; i < n1.length; i++) {
			hap += n1[i];
		}
		return hap;
		
	}
}
//매소드 오버로딩?
public class Overloading {

	public static void main(String[] args) {
		MyMath op = new MyMath();
		System.out.println(op.sum(1,2));//=>어디로 갈지 너무 모호해짐
		System.out.println(op.sum(10,20L));
		System.out.println(op.sum(100L,200));
		System.out.println(op.sum(1.0f,6.0f));
		int arr[] = {1,2,3,4,5};
		System.out.println(op.sum(arr));
		
	}
}
