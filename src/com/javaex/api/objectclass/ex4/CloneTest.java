package com.javaex.api.objectclass.ex4;

public class CloneTest {

	public static void main(String[] args) {
		
		ScoreBoard s1 = new ScoreBoard(new int[] {10, 20, 30, 40});
		System.out.println("s1=" + s1);
		
		// 복제본 생성
		ScoreBoard s2 = s1.getClone();
		System.out.println("s2=" + s2);
		
		System.out.println("s1 == s2? " + (s1 ==s2)); // false 출력 -> 두 객체는 다른 객체입니다 Heap메모리에 인스턴스까지 복사했기 때문
		
		s1.getScores()[0] = 50; // 내부 참조 필드의 값을 변경 
		System.out.println("s2=" + s2); // s1값을 변경했는데 s2가 바뀜 똑같은 값(데이터)을 참조하고 있기 때문
		System.out.println("s1.scores == s2.scores ?" + (s1.getScores() == s2.getScores())); // s1.scores, s2.scores는 같은 참조 주소인가? -> 같은 데이터값을 가르키고 있다.

	}

}
