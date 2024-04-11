package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	// files의 경로 위치 -> 실제 위치 찾기
	private static String rootPath = System.getProperty("user.dir") + "\\files";
			
	public static void main(String[] args) {
		System.out.println("root경로: " + rootPath);
		
		File f = new File(rootPath); // 파일명으로 파일 정보 객체 생성
		System.out.println(rootPath + " : " + (f.exists()? "존재" : "없음"));
		
		// 정보출력
		printFileInfo(f);
		
		// 디렉토리 만들기
		// files디렉토리 안에 -> files\\subdir\\subdir2 ->만들기
		File newDir = new File(rootPath + "\\subdir\\subdir2"); // 파일(디렉토리) 정보
		if(!newDir.exists()) { // 존재여부 확인 -> newDir없나?
			if(newDir.mkdirs()) { // 실제로 생성
				System.out.println(newDir + "을 생성했습니다.");
			}
		}
		
//		printFileInfo(newDir);
		printFileInfo(f);
		
		// 새로 생성한 files\\subdir 디렉토리에 새파일 myfile.txt만들어 보기
		File newFile = new File(rootPath + "\\subdir\\myfile.txt");
		// 파일객체 생성 ->  정보객체 생성, 파일 자체를 만드는게 아님
		if(!newFile.exists()) { 			// 존재 여부 확인 후 없으면 생성하기
			try {
				newFile.createNewFile(); 		// 실제 파일생성은 이렇게
			} catch (IOException e){
				System.out.println("파일을 만들지 못했어요");
			}
		}
		// 목록 출력
		printFileInfo(f);
		
		// 파일 삭제
		newFile.delete();
	}
	
	private static void printFileInfo(File f) { // file f에 정보를 전달받아서 -> 디렉토리o -> 안쪽이 파일 경로
		System.out.println("---------------------");
		
		// 전달받은 파일 객체가 디렉토리인가?
		if(f.isDirectory()) { // 만약 해당 파일이 디렉토리이면 내부목록 출력
			System.out.println("Directory: " + f.getName());
			
			// file목록 가져오기
			File[] files = f.listFiles(); // file정보의 배열
			
			for(File file: files) {
				System.out.print(file.isDirectory() ? "d" : "f");
				System.out.print(file.canRead() ? "r" : ".");
				System.out.print(file.canWrite() ? "w" : ".");
				System.out.print(file.canExecute() ? "x" : ".");
				
				System.out.print(" " + file.getName()); 	// file명
				System.out.println("\t" + file.length()); 	// file size
			}
		} else { // 디렉토리가 아니면 간략 정보만 출력
			System.out.println("File: "); 
			System.out.print(f.getName() + "\t"); 			// 파일명 확인 가능
			System.out.print(f.canRead()? "r" : ".");  	 	// 읽을 수 있는 파일인지?
			System.out.print(f.canWrite()? "w" : "."); 	 	// 기록할 수 있는 파일인지?
			System.out.print(f.canExecute()? "x" : ".");	// 실행가능한 파일인지?
			System.out.println();
			
		}
	}

}
