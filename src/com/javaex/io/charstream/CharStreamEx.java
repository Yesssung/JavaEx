package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "\\char.txt";
	
	public static void main(String[] args) {
		// FileWriter
//		writeFile();
		// FileReader
		readFile();

	}
	
	private static void writeFile() {
		// FileWriter를 이용해서 txt file 만들기
		System.out.println("파일명 : " + filename);
		
		// Stream 열고
		try(
		  Writer writer = new FileWriter(filename); 
		) {  // txt 기록
			writer.write("하이미디어 아카데미\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2024.04");
			writer.flush(); 	// 내부 버퍼 비우기
//			writer.close();		// AutoCloseable 이기 때문에 굳이 저거 써줄 필요 없음
	   	} catch (FileNotFoundException e) {
	   		System.err.println("파일을 찾을 수 없습니다.");
	   	} catch (IOException e) {
	   		e.printStackTrace();
	   	} catch (Exception e) {
	   		e.printStackTrace();
	   	}

	}

	private static void readFile() {
		System.out.println("파일명 : " + filename);
		
		try(Reader reader = new FileReader(filename);){
			// 읽어들일 데이터 저장 변수
			int data = 0;
			String message = "";
			// 2byte char 읽기 -> int 로 반환
			while((data = reader.read()) != -1) { // -1 이면 더 읽을 수 없다.
//				System.out.println("읽은 데이터 : " + (char)data);
				message += (char)data;
			}
			System.out.println(message);
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
