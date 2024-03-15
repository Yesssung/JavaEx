package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.println : 출력 후 개행
		// System.out.print   : 출력 후 개행x
		// System.out.printf  : 형식 지정 문자열 출력
		
		System.out.print("HELLO ");
		System.out.println("JAVA");
		
		String str1 = "HELLO";
		String str2 = "JAVA";

		System.out.println(str1 + " " + str2);
		
		// 이스케이프 문자
		// \n(개행), \t(탭), \"(쌍따움표), \\(역슬래시)
		
		System.out.println("HELLO\nJAVA");
		System.out.println("HELLO\tJAVA");
		System.out.println("HELLO\"JAVA");
		System.out.println("HELLO\\JAVA");
		
		System.out.println("HELLO,\"JAVA\"");


		String path = // "C:\Users\Hong\memo.txt";       -> 이경우 역슬래시 인식 못해서 에러남 
						 "C:\\Users\\Hong\\memo.txt"; // -> 이렇게 해야함
		System.out.println(path);
	}

}
