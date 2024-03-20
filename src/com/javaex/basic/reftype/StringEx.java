package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		// 선언 이후 할당
		// 선언과 동시에 할당
		// new를 이용한 객체 생성
		
		String str1; // 선언
		str1 = "JAVA"; // 할당
		
		String str2 = "JAVA"; // 선언과 동시에 할당
		
		String str3 = new String("JAVA"); // new를 이용한 객체생성

		
		// 세 참조변수는 같은 값을 가지고 있다 
		// 참조변수의 경우 ==은 메모리 주소의 비교
		System.out.println(str1 == str2); // 리터럴로 값을 고정했기 때문에 str1과 str2는 같다
		System.out.println(str2 == str3);
		
		// 값의 비교는 .equals 메서드 이용
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));

	}

}
