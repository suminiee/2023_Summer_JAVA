package day11;

public class Exception3 {
	public static void main(String[] args) {
		try {
//			int[] arr = new int[3];
//			arr[-1] = 20; //ArrayIndexOutOfBoundException
//			object obj = new int[10];
//			String str = (String)obj;//ClassCastException
//			int[] brr = new int[-30];
			String str2 = null;
			int len = str2.length();//NullPointerException
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("wow");
		}
	}
}
