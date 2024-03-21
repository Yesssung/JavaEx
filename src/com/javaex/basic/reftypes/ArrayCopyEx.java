package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// 배열은 크기 변경이 불가하기 때문에 공간을 늘리고 싶으면 새 배열 생성 후 복사해야함
		// for문을 이용한 배열 복사
//		arrayCopyByFor();
		// System을 이용한 배열 복사
		arrayCopyBySystem();
		// Enhanced For

	}
	
	// for문을 이용한 배열복사
//	public static void arrayCopyByFor() {
//		
//		int[] scores = {1,2,3}; // .length == 3
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + "\t");
//		}
//		System.out.println();
//		
//		// 공간을 늘리고 싶으니깐 새 공간을 만들어 복사
//		int target[] = new int[10];
//		
//		for(int i = 0; i < scores.length; i++) {
//			target[i] = scores[i];
//		}
//		
//		// 배열 유틸리티 클래스를 이용한 출력
//		System.out.println(Arrays.toString(target));
//	}

	// System을 이용한 배열복사
	public static void arrayCopyBySystem() {
		
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.out.println("source: " + Arrays.toString(source));
		
		System.arraycopy(source, 			// 원본
						 0, 				// 원본 시작위치
						 target,			// 복사 대상배열
						 2, 				// 복사 배열 시작위치
						 source.length); 	// 복사할 길이
						 
		System.out.println("target: " + Arrays.toString(target));
				
	 // Enhanced For
	 // for(추출된 데이터: 원본배열 혹은 컬렉션)	
	 // 파이썬에서는 밑에 친구가 for문!!!!!!!!!!!!!!!!!!!!!!
		for(int value : target) {
			System.out.print(value + "\t");
		}
		System.out.println();
		
	}
	
	
	
	
	

}
