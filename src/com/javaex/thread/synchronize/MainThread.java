package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		
		// 공유 객체
		SharedMemory memory = new SharedMemory();
		
		User user1 = new User("호박", memory, 100);
		User user2 = new User("훠궈", memory, 50); // 둘이 같은 데이터를 Shared 하고 있기 때문에 먼저 들어간 데이터값으로 동시에 출력되게 된다.		
		// Thread 실행
		user1.start();
		user2.start();
	}

}
