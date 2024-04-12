package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "img.jpg";
	private static String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		
		System.out.println("rootPath : " + rootPath);
		System.out.println("원본파일 : " + source);
		System.out.println("타겟파일 : " + target);
		
		// Stream 열기
		try( 
			InputStream fis = new FileInputStream(source); 		// 입력
			OutputStream fos = new FileOutputStream(target); 	// 출력
				)
		{   // 입력데이터 변수
			int data = 0;
			// 데이터 읽기
			while((data = fis.read()) != -1) { // 더 읽을 데이터가 없으면 -1출력
			// FileOutputStream 으로 출력
				fos.write(data);
				System.out.println("data : " + data);
			}
			
			System.out.println("파일을 복사했어요!");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		


	}

}
