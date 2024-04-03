package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper Class
		// 기본타입 -> 객체로 저장하는 포장클래스: 객체형태로 기본타입을 다루기 위한 방법
		
		// 생성
		Integer i = new Integer(10); // -> 실선표시 Deprecated: 빨리 형태 바꾸라는 일종의 경고 (경고도 에러의 일부로 본다), 사용금지
		Character c =  new Character('A');
		Float f = Float.valueOf(3.14159f); // .valueOf static메소드를 사용해서 Wrapper하자
		Boolean b = Boolean.valueOf(true); 
		
		// 문자열로 된 데이터를 기본타입으로 포장
		Integer i2 = Integer.valueOf("2024"); // 저 문자열을 기본형태로 바꿔주는 작업
		Double d2 = Double.valueOf("3.14159");
		Boolean b2 = Boolean.valueOf("false");
		
		// 주의:  전달되는 파라미터의 문자열의 형태가 해당하는 기본형의 형태와 동일해야한다.
		
		// auto boxing
		Integer i3 = 10; // Integer i3 = Integer.valueOf(10);
		// auto unboxing
		int result = i3 + 2; // int result = i3.intValue() + 2
		
		// parse계열 메소드 : 문자열 이용, 특정 타입으로 변환, 다른 형태로 출력
		System.out.println(Integer.parseInt("-123")); // 문자열 -> 정수
		System.out.println(Integer.parseInt("10", 16)); // 16진수 문자열 10을 -> 정수 로 변환
		System.out.println(Integer.toBinaryString(28)); // 10진수 28을 -> 2진수 문자열로
		
		// 형변환
		System.out.println(i2.doubleValue()); // i2는 정수데이터 2024 였는데 double로 바꿔서 2024.0으로 출력됨
		
		// 포장된 값의 비교
		Integer i4 = Integer.valueOf(2024);
		Integer i5 = Integer.valueOf(2024);
		System.out.println(i4 == i5); // 출력 결과: false -> == 각자다른 객체가 생성된 것으로 보고 참조주소는 다르다
		
		// 언박싱 비교(내부 데이터비교)
		System.out.println(i4.intValue() == i5.intValue()); // 기본 데이터로 언박싱 됐기 때문에 데이터 자료 같다고 나옴
		System.out.println(i4.equals(i5)); // 기본 데이터로 언박싱 되었기 때문에 참조자료주소도 같게되지용
		

	}

}
