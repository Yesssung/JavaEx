package com.javaex.basic.loop;

public class MathRandomEx {

	public static void main(String[] args) {
		// 1~45 까지의 숫자중 임의의 6개의 숫자를 출력(중복 상관x)
		// 중복 상관 x -> for문 , 중복 상관 o -> while문
		//(int)(Math.random()*45)+1 -> 출력 
		
		
		
		
		
		// for문
//		for(int i = 1; i <=6; i++ ) {
//			System.out.print((int)(Math.random()*45)+1 + " ");
//		}

		
		
		
		// while
		int i = 0;
		
		while( i < 6) {
			System.out.print((int)(Math.random()*45)+1 + " ");
			i +=1 ;
		}
		
		
		
		
		
		
		
		
		
		
		
	} 

}
