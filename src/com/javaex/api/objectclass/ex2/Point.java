package com.javaex.api.objectclass.ex2;

// 두 객체의 내부데이터의 같음을 확인하는 equals 메소드
public class Point { // extends java.lang.Object
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals : 두 객체의 내부 데이터가 같은지 확인하는 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			// 전달받은 파라미터 obj가 point 인지 확인
			// Obj -> Point로 캐스팅해주기
			Point other = (Point)obj;
			// 두 객체의 동등성 -> 두 객체의 x필드가 같고, y필드가 같아야 동등하게 될것
			return x == other.x && y == other.y;
		}
		// obj가 Point가 아님
		return super.equals(obj); // 부모 클래스에게 비교 방법을 위임
	}
	
	
	// toString : 객체 정보를 문자열로 출력할 때 호출되는 메소드
	@Override
	public String toString() { // -> 문자열을 반환
		return "Point(" + x + "," + y + ")";
	}


}
