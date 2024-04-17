package com.javaex.network.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//v2. 클라이언트로부터 메세지 전달 받아서 -> Echo Back 
public class Client {

	public static void main(String[] args) {

		// 소켓 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			// 시작 메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
		
			// connect 시도(접속 요청) -> 서버 주소와 포트 확보
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote); // if 서버가 허용 해주면 밑에줄 실행
			System.out.println("[서버에 연결 되었습니다.]"); // 접속허가시 메세지 출력
			
			// 서버로 메세지 전송
			// 서버의 통신 소켓과 클라이언트 통신 소켓을 연결해야함
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			// Echo Back 메세지 수신을 위한 Stream
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// 스캐너 열기
			Scanner sc = new Scanner(System.in);
			while(true) { // Scanner로 많이 받고 싶으면 while(true)문 사용하기
				
				// 메세지 전송
//				String msg = "테스트 메시지"; 	// 서버로 전송할 메세지
				String msg = sc.nextLine();	// 서버로 전송할 메세지 입력 받기요
				
				if(msg.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				bw.write(msg);				// 서버로 전송
				bw.newLine();				// 개행의 뜻이 있지만 다 입력했다는 뜻도 있음
				bw.flush();
				
				System.out.println("전송 메세지: " + msg);
			
				// Echo Back 메세지 수신
				String rcvMsg = br.readLine();
				System.out.println("수신메세지: " + rcvMsg);
			}
			
			sc.close();
			br.close();
			bw.close();
			
			// 종료
			System.out.println("<클라이언트 종료>");	
		} catch (ConnectException e) {
			System.err.println("접속이 거부되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
