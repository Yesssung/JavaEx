package com.javaex.opp.point.v1;

public class Point {

	private String str1;
	private int num1;
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
//	public String getStr2() {
//		return str2;
//	}
//	public void setStr2(String str2) {
//		this.str2 = str2;
//	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
//	public int getNum2() {
//		return num2;
//	}
//	public void setNum2(int num2) {
//		this.num2 = num2;
//	}
//	
	
	public void draw() {
		System.out.printf("점[%s = %d, %s = %d]을 그렸습니다.", str1, num1, str1, num1);
	}

}
