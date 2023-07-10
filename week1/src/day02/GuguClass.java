package day02;

public class GuguClass {
	//과제 구구단을 보기좋게 출력하시오
	public static void main(String[] args) {
		System.out.print("구구단");
		
		System.out.println("\nouter사용안할시");
		//outer:
		for (int i=1; i<10; i++) {
			System.out.println();
			for (int j=2; j<10; j++) {
//				System.out.print(j+"X"+i+"="+i*j+"	");
				if (i > 3)
					break; //outer; //outer를 포함하는 전체를 나감
				System.out.printf("%2dX%d=%2d ",j, i, i*j);//c언어의 유산
			}
			System.out.print("★");
		}
		
		System.out.println("\nouter사용시");
		
		outer:
		for (int i=1; i<10; i++) {
			System.out.println();
			for (int j=2; j<10; j++) {
//				System.out.print(j+"X"+i+"="+i*j+"	");
				if (i > 3)
					break outer; //outer를 포함하는 전체를 나감
				System.out.printf("%2dX%d=%2d ",j, i, i*j);//c언어의 유산
			}
			System.out.print("★");
		}
		
		
	}
}
