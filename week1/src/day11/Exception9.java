package day11;

//null입니다.
//숫자도 넣으세요
//패스워드가 5보다 작아요
//잘 만들었어요

class PwdException extends Exception{
	public PwdException(String message) {
		super(message);
	}
}

class PwdTest{
	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) throws PwdException { //이 setter메소드 안에서 //pwd의 상태에 따라 아래 메세지에 해당하는 exception 발생하기
		this.pwd = pwd;
		
		if (pwd == null)
			throw new PwdException("null입니다.");
		else if (pwd.length()<5)
			throw new PwdException("패스워드가 5글자보다 짧아요");
		else if (pwd.matches("[a_zA_Z]"))
			throw new PwdException("숫자도 넣으세요");
		else
			throw new PwdException("잘 만들었어요.");
		
		//null입니다.
		//숫자도 넣으세요
		//패스워드가 5보다 작아요
		//잘 만들었어요
	}
	
}

public class Exception9 {
	public static void main(String[] args) {
	      PwdTest test = new PwdTest();
	      String Pwd = null;
	      try {
	         test.setPwd(Pwd);
	         System.out.println("설정완료");
	      } catch (PwdException e) {
	         System.out.println(e.getMessage());
	      }
	      
	      Pwd = "abcdfff";
	      try {
	         test.setPwd(Pwd);
	         System.out.println("짧아요");
	      } catch (PwdException e) {
	         System.out.println(e.getMessage());
	      }
	      
	      Pwd = "abc";
	      try {
	         test.setPwd(Pwd);
	         System.out.println("숫자가 없어요");
	      } catch (PwdException e) {
	         System.out.println(e.getMessage());
	      }
	      
	      Pwd = "abcde1";
	      try {
	         test.setPwd(Pwd);
	         System.out.println("잘 만들었어요");
	       //잘 만든 패스워드 출력
		     System.out.println(test.getPwd());
	      } catch (PwdException e) {
	         System.out.println(e.getMessage());
	      }
	      
	   }

}
