package com.javaex.api.objectclass.ex4;

import java.util.Arrays;


// Clone 메서드 이용을 위해 Cloneable 인터페이스 구현하기
// 깊은 복제 : 참조 자료를 필드로 가지고 있는 클래스는 깊은 복제 필요 (주소만 복사되면 안되니깐) 
// 참조필드의 경우 새 객체를 만들어서 참조필드 값을 변경 -> Override가 해결방법
public class ScoreBoard implements Cloneable { // Cloneable 이라는 인터페이스를 implements 해야 Clone을 만들 수 있다.
	
	private int scores[];
	
	public ScoreBoard(int[] scores) {
		super(); // 부모클래스도 초기화 해주세요!
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int scores[]) {
		this.scores = scores;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 내부 참조 데이터를 복제하기(feat.Override) 
		
		// 깊은 복제 전에 먼저 얕은 복제 먼저
		ScoreBoard clone = (ScoreBoard)super.clone(); // -> 얕은 복제
		clone.scores = Arrays.copyOf(scores, scores.length); // -> 깊은 복제 배열 길이 만큼 복사해서 붙여넣기 해서 자신이 가지고 있는 참조주소에 할당하기
		return clone; // 만들어진 복제본을 반환
		
	}

	@Override
	public String toString() {
		return "ScoreBoard [scores=" + Arrays.toString(scores) + "]";
	}
	
	// 복제 생성 메소드
	public ScoreBoard getClone() {
		// 복제를 위한 새로운 인스턴스 저장할 변수 선언하기
		ScoreBoard clone = null;
		
		try {
			clone = (ScoreBoard)clone();
		}catch(CloneNotSupportedException e) {
			// 예외 로그 출력
			e.printStackTrace();
		} 
		return clone;
	}

	
}
