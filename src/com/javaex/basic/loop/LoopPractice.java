package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
//		forGugu();
//		whileGugu();
//		forStar();
		whileStar();
	}
		
		
//		public static void forGugu() {
//		// 구구단 for loop
//		for(int dan = 2; dan <= 9; dan++) {
//			for(int num = 1; num <= 9; num++) {
//				System.out.println(dan + "*" + num + "=" + (dan*num));
//					}
//			System.out.println(" ");
//			
//		} 
	
//		
//		public static void whileGugu(){
//		 //구구단 while loop
//		int dan = 2;
//		int num;
//		
//		while(dan <= 9) {
//			num = 1; // 단수가 시작될때마다 num값이 1로 초기화 되어야 함
//			while(num <= 9 ) {
//				System.out.println(dan + "*" + num + "=" + (dan*num));
//				num += 1;
//				}
//			System.out.println("");
//			dan +=1 ;
//				}
//			}
//		}
//		
//		
		
//	
//		public static void forStar() {
//			// * for loop
//			for(int i = 0; i < 6; i++) { // 열(row) *
//									//				*
//									//				*
//									//				*
//									//				*
//				for(int num = 0; num <= i; num++) {
//					System.out.print("*");
//				}
//					System.out.println();
//				}
//					}
//				}
//			
//			
		
		
		public static void whileStar(){
		// * while loop
//		int i = 0;
//		int a = 0;
//		
//		while(i < 6) {
//			while(a <= i) {
//				System.out.print("*");	
//				a+= 1;
//			} System.out.println("");
//				i++;
//				a=0; // a를 다시 0으로 초기화한것 
//				}
//		}
			
		// 다른 방법
		int row = 1;
		int col;
		
		while(row <= 6) {
			col = 1;
			while(col <= row) {
				System.out.print("*");
				col += 1;
				}
			System.out.println();
			row += 1;
			}
		}
}

		
				
	
		
		
		
	


