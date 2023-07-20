package day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Fis_12 {
	public static void main(String[] args) throws FileNotFoundException {
		long timecheck = 0;
		FileInputStream fis = new FileInputStream("src.zip");//읽어서 복사한 후 
 		FileOutputStream fos = new FileOutputStream("backup.zip"); // 붙여넣기

 		
 		try(fis;fos) {
 			timecheck = System.currentTimeMillis();//복사하기 전의 시간 (1000ms = 1s)
 			int ch;
 			while((ch = fis.read()) != -1) {
 				fos.write(ch);
 			}
 			timecheck = System.currentTimeMillis() - timecheck; //복사 후의 시간
			System.out.println(timecheck);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
