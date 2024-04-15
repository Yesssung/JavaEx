package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		// 입력 소스(파일 정보)
		File file = new File(filename);

		try{
			Scanner scanner = new Scanner(file);
			// 데이터 저장 변수
			String name;
			float height;
			float weight;
			
			
			while(scanner.hasNextLine()){ 		// 더 읽을 line이 있나?
				name = scanner.next();			// 문자열 Token 읽기
				height = scanner.nextFloat(); 	// 실수 Token 읽기
				weight = scanner.nextFloat();	// 실수 Token 읽기
				
				System.out.printf("%s, 키:%.1f, 체중:%.1f%n", name, height, weight);
				scanner.nextLine();
			}
			
			scanner.close();
			
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
