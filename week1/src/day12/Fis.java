package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fis {
	public static void main(String[] args) throws IOException {
			//기본 입력 바이트
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
//		ctrl+shift+o -> 자동 import
	}
}
