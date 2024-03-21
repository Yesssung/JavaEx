package com.javaex.basic.reftypes;

public class MainArgs {

	public static void main(String[] args) {
		// 배열 형태의 값 목록이 main 메서드로 전달
			for(int i=0; i < args.length; i++) {
				System.out.printf("args[%d] = %s%n", 
								i, args[i]);
			}

	}

}
