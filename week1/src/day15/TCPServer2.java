package day15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


//1. 서버실행
//2. cmd창에 telnet ip 10001 (ip는 ipconfig치면 볼 수 있음)
//3. telnet이 없으면 window key + r누르고 뜬 창에 OptionalFeatures 치고
//4. 맨 아래로 내려서 텔넷 클라이언트 설치하기.


public class TCPServer2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.10.94", 10001));
			System.out.println("[서버] 연결 기다림");
			Socket socket = serverSocket.accept();
			
			//데이터의 순수한 0,1에 대한 출력스트림
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//			byte[] data = new byte[] {'a', 'p', 'p', 'l', 'e', '!'};
			byte[] data = new byte[100];
			System.out.print("전송 문자 : ");
			System.in.read(data, 0, 100);//키보드 입력 데이터를 data배열에 넣어주는 것.
			
			out.write(data);
			out.flush();// 출력 버퍼의 내용을 확 밀어버림
			
			System.out.println("[서버] 연결됨");
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket != null && serverSocket.isClosed()==false) {
				try {
					serverSocket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
