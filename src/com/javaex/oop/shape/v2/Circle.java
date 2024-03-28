package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{

	private double radius;
	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	// 부모가 선언한 추상메서드는 반드시 구현해줘야 한다.
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, area=%f]을 그렸습니다.%n", x, y,  area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2); // 제곱메서드. 아니면 두번 곱해줘도 됌
		return area;
	}

}
