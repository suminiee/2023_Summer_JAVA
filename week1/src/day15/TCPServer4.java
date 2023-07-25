package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//1. 서버실행
//2. cmd창에 telnet ip 10001 (ip는 ipconfig치면 볼 수 있음)
//3. telnet이 없으면 window key + r누르고 뜬 창에 OptionalFeatures 치고
//4. 맨 아래로 내려서 텔넷 클라이언트 설치하기.


public class TCPServer4 {
	public static void main(String[] args){
		BufferedReader in = null;//new!
		ServerSocket serverSocket = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
	
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.10.94", 10001));
			System.out.println("[서버] 클라이언트 연결 대기중");
			socket = serverSocket.accept();//클라이언트와 연결되면 socket생성.
			System.out.println("연결성공");
			
			//클라이언트의 입력을 읽기 위한 in 스트림.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//InputStreamReader new!
			//데이터의 순수한 0,1에 대한 출력스트림
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {//new!
				String receiveMessage = in.readLine();//클라이언트의 buffered 데이터를 읽는다.
				if ("exit".equalsIgnoreCase(receiveMessage)) break; //대소문자상관없이 quit을 작성하면 break, 
				System.out.println("from client: "+ receiveMessage);
				
				System.out.print("전송 문자열 : ");
				String sendMessage = sc.nextLine();//서버쪽에서 입력한 문자열
				
				out.println(sendMessage);//클라이언트에 전송
				out.flush();//전송을 확신.
				if("exit".equalsIgnoreCase(sendMessage)) break;
			}
			
//			System.out.println("[서버] 연결됨");
//			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				socket.close();
				serverSocket.close();
				System.out.println("채팅 종료");
			} catch (IOException ex) {
				ex.printStackTrace();
				System.out.println("채팅 에러");

			}
		}
	}
}
