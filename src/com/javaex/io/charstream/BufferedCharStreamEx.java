package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	
	// last leaf .txt
	// 줄 단위로 읽어들이고, leaf, leaves단어가 들어간 문장만 뽑아서 따로 filtered.txt 에 저장
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";
	
	// source file에서 leaf or leaves가 포함된 문장만 필터링해서 -> target에 저장하기
	public static void main(String[] args) {
		System.out.println("원본 파일 : " + source);
		System.out.println("filter파일 : " + target);
		
		try( // 주스트림 연결
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			 // 보조 스트림 연결 -> Buffer 사용
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
		){  // 한줄 단위로 읽고 쓴는데 특화
			// 한줄 단위로 출력
			String line = "";
			while((line = br.readLine()) != null) { // 읽을 라인이 없으면 null
//				System.out.println(line);
				// leaf, leaves filter로 추출해보기
				if(line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
//					System.out.println(line);
					// 필터링 된 라인만 별도로 저장하기
					bw.write(line);
					bw.newLine(); // 개행이랑 비슷하게 사용
				}
			}
			System.out.println("필터링 완료");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
