package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		
		Point point = new Point(5,2);
//		Point point = new Point();
//		point.setX(5);
//		point.setY(2);
		
		Point point2 = new Point(10,23);
//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);
		
//		System.out.printf("점[x = %d, y = %d]을 그렸습니다.%n", point.getX(), point.getY());
//		System.out.printf("점[x = %d, y = %d]을 그렸습니다.%n", point2.getX(), point2.getY());
		
		point.draw();
		point2.draw();
		
		// 오버로딩된 메서드 호출
		point.draw(true);
		point2.draw(false);
	
	
	}

}
