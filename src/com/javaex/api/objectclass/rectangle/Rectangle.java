package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 면적구하는 메소드
	public int area() {
		return width*height;
	}
	
	// 동등성 출력 로직
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle ) {
			Rectangle other = (Rectangle)obj;
			return area() == other.area();
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
