package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fis_3 {
	public static void main(String[] args) throws IOException {
			//기본 입력 바이트
		try(FileInputStream fis = new FileInputStream("b.txt")) {
			byte[] b1 = new byte[10];
			
			int ch;
			while( (ch=fis.read(b1)) != -1) {//연산자 우선순위가 =이 가장 낮다.
//				for(byte b :b1){
//					//향상된 for문
//					System.out.print((char)b);
//				} //얘랑
				for (int i = 0; i < ch; i++) {
					System.out.print((char)b1[i]);
				}//얘랑 같은느낌
				System.out.println(" : "+ch+"byte");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
