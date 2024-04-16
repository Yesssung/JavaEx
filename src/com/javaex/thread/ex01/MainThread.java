package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread 시작
		// -> run으로 불러오는것이 아닌 .start() 메서드를 호출
		thread.start();
				
		// Main Thread Logic
		// a~z까지 차례대로 출력
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			
			// 쓰레드 실행 대기
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인 쓰레드 종료");

	}

}
