package day12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Fis_10 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("a10.txt");
		
		try(fw) {
			fw.write("abc\n");
			char buff[] = {'f','e','l','i','x'};
			fw.write(buff);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
//		System.out.println("종료");
	}
}
