package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Fis_2 {
	public static void main(String[] args) throws IOException {
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			int ch;
			while((ch=fis.read())!= -1) {//연산자 우선순위가 =이 가장 낮다
				System.out.print((char)ch);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		System.out.println("종료");
	}
}
