package day11;

public class Exception8 {
	public static void main(String[] args) {
		String pwd = new String("abc");
		System.out.println(pwd.matches("[a-zA-Z]+"));//문자열이 알파벳이냐?
		
		String pwd2 = new String("abc1");//불순물 숫자가 들어감
		System.out.println(pwd2.matches("[a-zA-Z]+")); //문자열이 알파벳이냐?
		
		//자바특징 식별자를 숫자부터 쓸 수 없다 && _를 쓸 수 있다.
		String pwd3 = new String("abcd7");//불순물 숫자가 들어감
		System.out.println(pwd3.matches("[a-zA-Z0-9]{10,20}$"));//문자열이 알파벳이냐?, 10글자 이상 20글자 미만?
		
		String pwd4 = new String("abcaasdfd7");//불순물 숫자가 들어감
		System.out.println(pwd4.matches("[a-zA-Z0-9]{10,20}$"));//문자열이 알파벳이냐?
		
		String pwd5 = new String("abcaa!@#!@#!@#!@#!@#!@#!sd_fd7");//불순물 숫자가 들어감
		System.out.println(pwd5.matches("[a-zA-Z0-9!_$]{10,20}$"));//문자열이 알파벳이냐?
	}
}
