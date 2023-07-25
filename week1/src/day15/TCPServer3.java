package day15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//1. 서버실행
//2. cmd창에 telnet ip 10001 (ip는 ipconfig치면 볼 수 있음)
//3. telnet이 없으면 window key + r누르고 뜬 창에 OptionalFeatures 치고
//4. 맨 아래로 내려서 텔넷 클라이언트 설치하기.


public class TCPServer3 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.10.94", 10001));
			System.out.println("[서버] 연결 기다림");
			Socket socket = serverSocket.accept();
			
			//데이터의 순수한 0,1에 대한 출력스트림
			out = new PrintWriter(socket.getOutputStream());
			String sendMessage = sc.nextLine();
			System.out.print("전송 문자열 : ");
			out.println(sendMessage);
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
