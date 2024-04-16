package com.javaex.thread.ex02;

// Thread 상속을 통한 Thread 생성
public class DigitThread extends Thread {

	// Thread의 로직을 구현한다.
	// 주의: 이 메서드는 절대 직접 실행하지 않는다. -> 메인에서 run을 호출하지 말라는거여 메인에서 호출하면 걍 일반메서드임
	@Override
	public void run() {
		// Working Logic : 0 ~ 30
		for(int i = 0; i  < 30; i++) {
			System.out.printf("%s: %d%n", getName(), // Thread 이름
					i);
			// Thread 지연시키기
			try{
				Thread.sleep(300); // -> 0.3초 대기
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "쓰레드 종료");
		
	}

	
	
}
