package com.javaex.basic.types;

public class VarEx {
	
	public static void main(String[] args) {
		
		int myAge; // 선언 (myAge를 만들건데 int 타입으로 할끄야)
		myAge = 25;
		
		System.out.println(myAge);
		
		int v1 = 10, v2 = 20, v3 = 30;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1 = v2 = v3 = 40; // 전부 같다라는게 아니라 40을 v3넣고 v3를 v2에 넣고 이런식
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
