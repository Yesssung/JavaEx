package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		// only String만 저장 가능
		StringBox strBox = new StringBox();
		strBox.setContents("Generic");

		
		String retStr = strBox.getContents();
		System.out.println(retStr);
		
		// only Integer만 저장 가능
		IntBox intBox = new IntBox();
		intBox.setContents(2024);
		
		Integer retInt = intBox.getContents();
		
		// 타입별로 처리할 수 있는 모든 객체를 만들어야 한다면
		// if Object 를 처리할 수 있는 객체를 만들면 모든 객체를 처리할 수 있는 만능 클래스가 된다. ->  통제하기 어려울 수 있음
		
		// ObjBox
		ObjectBox objBox = new ObjectBox();
		objBox.setContent("objBox");
		
		String obj = (String)objBox.getContent(); // 내부데이터 확인이 어렵기 때문에 casting필요
		System.out.println(obj);
		
		objBox.setContent(2024);
		Integer objInt = (Integer)objBox.getContent();
		
		System.out.println(objInt);
		
		// Object 단점
		// 1. setter에서 전달되는 매개변수의 타입을 제한 할 수 없다.
		// 2. 데이터를 받아 올때 casting이 필요하다. 귀찮음 휴 그리고 casting 잘못하면 오류나유

		String obj2 = (String)objBox.getContent();
		
		// GenericBox
		GenericBox<String> genericStrBox = new GenericBox</*String이 부분 String은 생략 가능*/>();
		genericStrBox.setContent("GenericBox"); // -> 내부데이터를 String 으로 결정
//		genericStrBox.setContent(2024); // String 타입으로 결정했기 때문에 int는 넣으면 에러발생(컴파일 시점에 체크)		
		
		String objStr = genericStrBox.getContent();
		// 내부 저장 데이커가 지정 되어 있기 때문에 캐스팅 필요 없음니다.
		System.out.println(objStr);
		}

}
