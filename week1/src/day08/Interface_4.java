package day08;

interface SpeedControl_1M{
	//비어있는 인터페이스
}

class SpeedDisplay{
	public static void dp(Object ob) {
		String ss = ob.toString();
		if (ob instanceof SpeedControl_1M) { //인터페이스를 구현 했느냐에(인터페이스를 상속했냐) 따라서 객체를 구현한다
			ss = ss +"1Mbps";
		}
		else 
			ss = ss +"10Mbps";
		System.out.println(ss);
	}
		
}

class Speed_1 implements SpeedControl_1M{
	public String toString() {
		return "데이터 속도: ";
	}
}

class Speed_2{
	public String toString() {
		return "데이터 속도: ";
	}
}

public class Interface_4 {

	public static void main(String[] args) {
		Speed_1 yo1 = new Speed_1();
		Speed_2 yo2 = new Speed_2();
		SpeedDisplay.dp(yo1);
		SpeedDisplay.dp(yo2);
		
	}
}
