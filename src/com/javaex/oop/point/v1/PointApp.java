package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		
		Point point = new Point();
		point.setX(5);
		point.setY(2);
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		
		System.out.printf("점[x = %d, y = %d]을 그렸습니다.%n", point.getX(), point.getY());
		System.out.printf("점[x = %d, y = %d]을 그렸습니다.%n", point2.getX(), point2.getY());
		
		point.draw();
		point2.draw();
	
	
	}

}
