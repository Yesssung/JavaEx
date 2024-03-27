package com.javaex.oop.staticmember;
	// static영역을 활용하는 방법
	// 단 하나의 인스턴스만 유지하는게 목적!
	// new Singleton() -> 생성자가 생기면 안됌
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		// 위 처럼 했을 때 new를 이용한 생성 불가
	}
	
	public static Singleton getInstance() {
		// 유일한 인스턴스 반환
		return instance;
	}

}
