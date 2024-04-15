package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		System.out.println("원본: " + filename);
		
		try ( // 주 스트림 열기
				Reader fr = new FileReader(filename);
			  // 보조 스트림
				BufferedReader br = new BufferedReader(fr);
		) {
			String line; // 한 줄을 읽기위한 변수
			
			while((line = br.readLine())!= null) { // BufferedReader로 부터 한줄 읽어오기 -> 해당줄이 null이 아니면(null이 아닐때까지 읽기)
				// 토크나이징
				StringTokenizer st = new StringTokenizer(line, " "); // 줄을 공백으로 구분해주기?
				while(st.hasMoreTokens()) { // 뒤에 토큰이 더 있나?
					String token = st.nextToken();
					System.out.println("Token: " + token);
				}
			}
			br.close(); // 보조 스트림 닫으면 주스트림도 닫힌다.
			
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch(IOException  e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
