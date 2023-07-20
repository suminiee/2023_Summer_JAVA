package day12;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Fis_9 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a7.txt"); //FileInputStream -> FileReader로만 바꿔줬는데 문자가 깨지지 않고 출력됨. //기반 문자 입력
//		FileInputStream fis = new FileInputStream("a7.txt"); //기반 바이트 입력.
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch); 
		}
		System.out.println();
		fr.close();
	
//		System.out.println("종료");
	}
}
