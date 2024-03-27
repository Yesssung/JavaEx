package com.javaex.oop.casting;

public class Animal {
	// 필드
	protected String name;
	// 생성자
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	// 매소드
	public void eat() {
		System.out.println(name + "이(가) 먹고있다.");
	}
	public void walk() {
		System.out.println(name + "이(가) 산책하고 있다.");
	}
}
