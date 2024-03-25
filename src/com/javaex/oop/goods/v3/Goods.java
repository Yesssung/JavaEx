package com.javaex.oop.goods.v3;

// v3. 생성자
public class Goods {
	
	// 생성자를 하나도 선언하지 않을 경우
	// 자바 컴파일러가 기본 생성자를 자동으로 추가(없는게 아니라 안보이는것)
	// 반드시 한 개 이상의 생성자가 필요하기 때문
	// but 개발자가 생성자를 만들었을 경우 기본 생성자는 추가되지 않는다.
	
	// 생성자
	// 생성자는 객체 초기화 담당
	// 개발자 입력 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
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


