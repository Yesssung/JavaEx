package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 선언 : Queue는 인터페이스에요 객체화 불가 대신 순서가 있고, 중복이 가능하기 때문에 LinkedList처럼 사용(차이점은 중간 삽입, 중간 삭제 랄까..)
		// 실제 저장은 LinkedList 활용하기!
		Queue<Integer>queue = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			queue.offer(i); 	// 입력(제공)
			System.out.println("QUEUE: " + queue);
		}
		
		System.out.println("PEEK: " + queue.peek());  // 출력 방향의 데이터 확인 -> 0부터 출력 될거라규
		System.out.println("POLL: " + queue.poll());  // 인출(출력) ->  맨 처음 입력된 데이터인 0이 출력될거라구
		System.out.println("QUEUE: " + queue);		  // 인출을 했으니 인출된 데이터는 삭제될거라구
		
		// poll 할때 비어있는지 체크 필요!(예외처리로도 가능 -> 방어강화)
		while(!queue.isEmpty()) { // queuq가 비어있지 않다면(않는동안)
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);	
			
		}
		


	}

}
