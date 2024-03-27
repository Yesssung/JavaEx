package com.javaex.oop.staticmember;

public class StaticEx {
	
	public static int refCount; // 클래스 변수
	// -> 생성된 모든 인스턴스의 개수
	public static String classVar; // 클래스 변수
	
	public String instanceVar; // 인스턴스 변수
	
	// static 블록으로 class변수 초기화
	static {
		refCount = 0; // static변수 초기화
		classVar = "Static Member"; // class변수 초기화
		// instanceVar = "Instance Member"; // instance 변수 초기화, but static이 아니기 때문에 초기화 불가
		System.out.println("class영역 초기화");
	}
	
	// 생성자
	public StaticEx() {
		// 인스턴스가 생성될 때, 객체 가운트를 증가
		refCount ++;
		System.out.println("refCount: " + refCount);
		System.out.println("Instance 생성!");
		}
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable{
		refCount --;
		// 객체가 소멸될때 참조 카운트를 줄임
		super.finalize();
		System.out.println("소멸자 호출");
	}

}
