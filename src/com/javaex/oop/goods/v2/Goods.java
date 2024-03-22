package com.javaex.oop.goods.v2;

// v2. Private
public class Goods {
	// 필드 선언
	// instance 영역
	private String name;
	private int price;
	
	
	// Getter & Setter
	// method 영역
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
	
	public void showInfo() {
		System.out.printf("상품이름: %s, 가격:%,d원%n", name, price);
	}

}


