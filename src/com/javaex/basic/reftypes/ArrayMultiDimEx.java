package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] twoDimen = new int[5][10]; // 5 * 10
		
		int[][] table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2},
				{4,5,6,7,8,9,10,1,2,3},
				{5,6,7,8,9,10,1,2,3,4}
		};  // 5행 10열 배열
		
		System.out.println(table); // 이거 출력하면 [[I@279f2327 나오는데 이게 객체 출력 기본값
		
		System.out.println("table.length: " + table.length);
		System.out.println("table[0].length: " + table[0].length);
		
		
		// 행루프 
		int sum = 0; // 내부 데이터 합산
		for(int row = 0; row < table.length; row++) {
			// 열루프
			for(int col = 0; col < table[row].length; col++ ) {
				System.out.print(table[row][col] + "\t");
				sum += table[row][col];
			}
			System.out.println();
		}
		System.out.println("총합: " + sum);
	}

}
