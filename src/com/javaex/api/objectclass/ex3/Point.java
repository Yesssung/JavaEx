package com.javaex.api.objectclass.ex3;

// 객체의 복제
// 얕은 복제 : 필드의 값만 동일하게 복제하는 것(프리미티브 타입 일경우)
public class Point implements Cloneable { 
	// Object가 가진 clone()메서드를 사용하려면
	// Cloneable 인터페이스를 구현해야 한다.
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {

			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() { 
		return "Point(" + x + "," + y + ")";
	}
	
	// 객체를  복제해서 새로운 Point를 반환하는 메서드 만듬
	public Point getClone() {
		// 새로 생성될 Point 객체
		Point clone = null;
		
		// 복제시도
		// clone 메소드의 반환 차입은 Object
		try {
		clone = (Point)clone(); // clone할 수 없는 상황을 예외처리 해줘야 한다.
		} catch(CloneNotSupportedException e) {
			// clone이 불가능한 경우에 대한 예외처리
		}
		  return clone;
	}


}
