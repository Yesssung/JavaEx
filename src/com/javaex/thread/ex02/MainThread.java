package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread 시작
		// -> run으로 불러오는것이 아닌 .start() 메서드를 호출
		// Thread 우선순위 -> 1(MIN) ~5(NORMAL) ~10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
//		thread.start();
				
		// Runnable 활용한 쓰레드 인터페이스이기 때문에 구현해줘야한다.
		Thread runnableThread = new Thread(new AlphabetRunnable());
		runnableThread.setName("AlphabetRunnable");
		runnableThread.setPriority(Thread.MIN_PRIORITY);
		
		thread.start();
		runnableThread.start();
		
		// Thread와 RunnableThread의 흐름을 main Thread의 흐름에 합류시키기
		try {
			thread.join();
			runnableThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드 종료");

	}

}
