package day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Fis_4 {
	public static void main(String[] args) throws IOException {
			//기본 입력 바이트
		FileOutputStream fos = new FileOutputStream("c5.txt",true); //해당 파일이 없으면 새로 만들어줌. 
//		기본적으로 false가 붙으면 : overwrite(기존파일 덮어씌우기), true : append
		try(fos) { //java 11 ok
			fos.write(97); //ASCII code : a
			fos.write(98); //ASCII code : b
			fos.write(99); //ASCII code : c
			
		} catch (FileNotFoundException e) {
			//fis.close
			e.printStackTrace();
		}
//		System.out.println("종료");
//		ctrl+shift+o -> 자동 import  
	}
}
