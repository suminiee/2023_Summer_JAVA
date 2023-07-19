package day11;

class AC implements AutoCloseable{ //자동으로 close 해주는
//	우클릭 -> source -> override/implement method 
	@Override
	public void close() throws Exception {
		System.out.println("정상 close()");		
	}
}


public class Exception7 {
	public static void main(String[] args) {
		AC obj = new AC();
		try (obj){
			System.out.println("I'm above the world so high");
			System.out.println("I'll there shining day and night");
			System.out.println("They wonder how my spotlight is so bright ");
			throw new Exception(); //exception을 발생시킴.
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
