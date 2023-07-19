package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Exception6 {
	public static void main(String[] args) {
		FileInputStream fis = null;//초기화를 시켜줘야함
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일이 없어요.");
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				} //열었으니까 닫아야함.
			}
			System.out.println("무조건 실행되는 부분");
		}
	}

}
