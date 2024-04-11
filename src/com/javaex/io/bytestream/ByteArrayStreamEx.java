package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력소스
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 출력타겟
		byte[] outSrc = null;
		
		System.out.println("입력소스 : " + Arrays.toString(inSrc));
		
		InputStream bis = null;
		OutputStream bos = null;
		
		// try - with - resource
		try {
			// 입력 스트림과 출력 스트림 열기(bis: ByteInputStream / bos: ByteOutputStream)
				bis = new ByteArrayInputStream(inSrc);
				bos = new ByteArrayOutputStream();
				
				// 입력 스트림으로부터 넘어올 데이터 저장 변수
				int data = 0; 
				
				while((data = bis.read()) != -1) { // -1이면 더이상 읽을 데이터가 없음 -> 읽을 데이터가 -1이 아닌동안
					System.out.println("Read data: " + data);
					bos.write(data); // io Exception 발생 가능성o -> try catch 사용
				}
				
				outSrc = ((ByteArrayOutputStream)bos).toByteArray();
				
				System.out.println("최종결과 : " + Arrays.toString(outSrc));
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();    // IOE로 먼저 예외처리 해주고 혹시 남아있을지도 모르는 예외를 Exception으로 한 번 더 처리해주기
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (Exception e) {
				
			}
		}

	}

}
