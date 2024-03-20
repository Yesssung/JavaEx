package com.javaex.basic.loop;

public class BreakEx {

	public static void main(String[] args) {
		
		// 6의 배수이면서 14의 배수인 가장 작은 정수
		// 반복횟수를 정확하게 알기 힘든경우 -> while
		// while(true) -> 무한루프
		
		int num = 1; 
		
		while(true) {
			if(num % 6 == 0 && num % 14 ==0) {
				break; // while로 num 1씩 늘면서 무한으로 돌면서 최소공배수를 찾다가 찾으면 break걸려서 system.out으로 출력된다.
			}
			num += 1;
		}
		System.out.println(num);

	}

}
