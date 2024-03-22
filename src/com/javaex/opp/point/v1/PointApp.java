package com.javaex.opp.point.v1;

public class PointApp {

	public static void main(String[] args) {
		
		Point point = new Point();
		point.setStr1("x");
		point.setNum1(5);
		
		Point point2 = new Point();
		point2.setStr1("y");
		point2.setNum1(2);
		
		System.out.printf("점[%s = %d, %s = %d]을 그렸습니다.%n", point.getStr1(), point.getNum1(), point2.getStr1(), point2.getNum1());
		
	
		point.draw();
	
	
	}

}
