package com.javaex.thread.synchronize;

// 여러 클래스가 공유할 공유메모리(임계영역)
public class SharedMemory {
	
	// 필드
	private int memory;

	// getter, setter
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { 
		//  임계영역 : 멀티 쓰레드 프로그램에서 단 하나의 쓰레드만 실행할 수 있는 코드 영역
		// synchronized를 추가함으로써 한개씩 데이터 추가됨(동시 수행 x) -> 임계영역 선언
		this.memory = memory;
		
		try {
			Thread.sleep(1000); // 1초간 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	

	

	

}
