package com.javaex.api.objectclass.ex1;

// 모든 객체의 최상위 객체 Object
// Object 클래스는 객체가 개체로서의 기능을 수행하기 위한 기본적인 기능들을 구현
public class Point { // extends java.lang.Object
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override
	public String toString() { // -> 문자열을 반환
		return "Point(" + x + "," + y + ")";
	}
}
