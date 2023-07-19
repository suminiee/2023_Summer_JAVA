//package day11;
//
//public class Exception {
//
//	public static void main(String[] args) {
////		if (args[0] != null)
//		 
//		//try + ctrl space
//		try {
//			System.out.println(args[0]);//오류날것같은 문장 집어넣기
//			
//			//catch는 잡을게 많으면 여러개 쓰면 됨
//		}catch (ArrayIndexOutOfBoundsException e) {//e는 발생한 exception의 객체를 잡는 참조변수. 굳이 e아니어도 쓰고싶은거 써도 상관없을무
//			System.out.println("범위 문제 입니다.");
////			e.printStackTrace();//발생한 이유, exception에 해당하는 자세한 정보 로그(예시)
////			System.out.println(e.getMessage());// 좀 더 간략한 에러 발생 이유
//		
//		}catch(RuntimeException e) {//부모or 조상은 자식의 밑에 가야함. //조상이 catch블럭에 먼저 나오면 에러가 발생한다.//RuntimeException은 생략해도 상관은없음
//			System.out.println("용뽀기");
//		
//		}finally {
//			System.out.println("무조건 실행되는 부분.");
//		}//catch에 잡히는 여부랑 상관없이 무조건 실행됨.
//		
//		System.out.println("프로그램 계속 돌아가는중");
//		System.out.println("프로그램 계속 돌아가는중");
//	}
//}
