package com.javaex.oop.goods.v2;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods camera = new Goods(); 
		camera.setName("nikon");
		camera.setPrice(400_000);

		Goods gram = new Goods();
		gram.setName("LG그램");
		gram.setPrice(900_000);
		
		Goods mug = new Goods();
		mug.setName("머그컵");
		mug.setPrice(2_000);
		
		// 상품 정보 출력(getter, setter 방식)
		System.out.printf("상품이름: %s, 가격:%,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("상품이름: %s, 가격:%,d원%n", gram.getName(), gram.getPrice());
		System.out.printf("상품이름: %s, 가격:%,d원%n", mug.getName(), mug.getPrice());
		
		// 상품 정보 출력(메소드 방식)
		camera.showInfo();
		gram.showInfo();
		mug.showInfo();
		
		
	}
	

	

}
