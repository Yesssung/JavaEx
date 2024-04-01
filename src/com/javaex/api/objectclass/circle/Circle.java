package com.javaex.api.objectclass.circle;

public class Circle {
	int x;
	int y;
	int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// equals출력을 위한 동등성 조건 메소드
	// 조건 : 반지름이 같으면 같다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle other = (Circle)obj;
			
			return radius == other.radius;
		}
		return super.equals(obj);
	}
	// 문자열 출력 메소드
//	@Override
//	public String toString() {
//		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]"; 
//	}
	
	
}
