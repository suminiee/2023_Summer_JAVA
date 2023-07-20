package day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fis_7 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a7.txt");
		try(fos) {
			String s = "안녕하세요";//스트링을 만들고
			byte[] b3 = s.getBytes();//스트링메소드를 통해 byte 로 전환
			fos.write(b3);//string이 바로 안써져서
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
