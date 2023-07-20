package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fis_8 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a7.txt");
		int ch;
		while ((ch = fis.read()) != -1) {
			System.out.print((char)ch); //제대로 출력이 안됨.(깨져서 나옴) => 문제해결을 위해 문자를 읽어들이는 것을 사용해야함.
		}
		System.out.println();
		fis.close();
	
		System.out.println("종료");
	}
}
