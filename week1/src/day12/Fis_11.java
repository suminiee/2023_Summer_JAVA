package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//FileOutputStream으로 문자열을 바이트화 시켜 출력(파일출력)
//FileInputStream으로 문자열을 읽으려고 했으나 깨짐(문자열을 바이트로 읽으니까)
//1. FileReader문자 전용 스트림으로 읽는다.abstract
//2. fis을 InputStreamReader에 생성자로 넣어서 문자로 읽는다.

public class Fis_11 {
	public static void main(String[] args) throws IOException,FileNotFoundException {
//		FileReader fr = new FileReader("a7.txt"); //FileInputStream -> FileReader로만 바꿔줬는데 문자가 깨지지 않고 출력됨. //기반 문자 입력
		
//		아래 두 줄(FileInputStream + InputStreamReader)은 FileReader한 줄과 같음
//		FileInputStream fis = new FileInputStream("a7.txt"); //기반 바이트 입력.
//		InputStreamReader isr = new InputStreamReader(fis); //*****
		
//		위에 두 줄을 한줄로 바꾸면 이렇게 됨.
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a7.txt"));
		
		try(isr/* fis;isr */) {//autocloserable을 increasement //','이 아니라 ';'을 적어야 제대로 돌아감
			int ch;
			while ((ch = isr.read()) != -1) {
				System.out.print((char)ch); 
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		isr.close();
	
//		System.out.println("종료");
	}
}
