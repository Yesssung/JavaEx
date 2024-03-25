package com.javaex.oop.goods.v4;

	// v4. this생성자: 현재 자기자신의 객체를 의미
	// this(): 현재 클래스 내부에 다른 생성자를 호출할때 사용

public class Goods {
	
	// name필드 생성자(name만 먼저 생성)
	public Goods(String name) {
		this.name = name; // 밑에 전체 필드 생성자도 이미 있기 때문에 중복할 필요 없음
		System.out.println("name 필드 초기화 생성자");
	}
	
	// 생성자
	// 생성자는 객체 초기화 담당
	// 개발자 입력 전체 필드 생성자
	public Goods(String name, int price) {
		this(name);
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
	}
	
	// 필드 선언, instance 영역
	private String name;
	private int price;
	
	
	// Getter & Setter method 영역
	// Setter 가 없으면 Read Only 필드 만들 수 있고, Getter/Setter 모두 없으면 프라이빗 필드가 된다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// getter, setter 사용하면 무결성 체크, 인증체크등을 할 수 있다.
		if(price < 0) {
			this.price = 0;
		}else {
			this.price=price;
		}
		this.price = price;
	}
	
	// 일반 method 영역
	public void showInfo() {
		System.out.printf("상품이름: %s, 가격:%,d원%n", name, price);
	}

}


