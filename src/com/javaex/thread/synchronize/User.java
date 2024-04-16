package com.javaex.thread.synchronize;

// 객체를 공유하는 Thread
public class User extends Thread {
	
		private SharedMemory memory;	// 공유 메모리 SharedMemory를 공유하는 거에오
		private int data;
		
		public User(String name, SharedMemory memory, int data) {
			this.setName(name); 		// Thread 이름 정의
			this.memory = memory;
			this.data = data;
		}
		
		@Override
		public void run() {
			if(memory != null) {
				memory.setMemory(data);
			}
		}
		
	
	
}
