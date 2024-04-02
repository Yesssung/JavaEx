package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
//		stringBasic();
		// 문자열 다양한 메소드
		usefulMethods();
	}
	
	private static void stringBasic() {
		String s1 = "JAVA";				// 리터럴(직접 값 입력),  Stack메모리 상에 s1그 자체를 가르킨다.
		String s2 = new String("JAVA");	// Heap에 직접 객체생성
		String s3 = "JAVA"; 			// 리터럴
		
		// 리터럴과 new 객체 생성이 다르게 작용
		System.out.println(s1 == s2); // 주소비교 : Literal vs new
		System.out.println(s1 == s3); //	    : Literal vs Literal -> Literal의 경우, 데이터가 같으면 같은 객체로 취급
		
		// 배열을 이용한 String 생성자
		char[] letters = {'J', 'A', 'V', 'A'};
		String s4 = new String(letters);
		System.out.println(s4);
		
		// .valueOf메소드 -> 기본 타입을 문자열로 반환
		String s5 = String.valueOf(2024); // int 를 문자열로 반환한것
		System.out.println(s5);
	}
	
	private static void usefulMethods() {
		String str = "JAVA Programming, OOP Programming";
		System.out.println("str: " + str);
		System.out.println("\n--------------------------------------------------------");
		
		// 문자열 길이 확인 : .length(); 				-> 33
		System.out.println(".length(): " + str.length());
		System.out.println("\n--------------------------------------------------------");
		
		// 인덱스 범위 확인 : 0 ~ .length-1 			-> 32
		
		// 변환 메소드
		System.out.println("toUpperCase: " + str.toUpperCase());
		System.out.println("toLowerCase: " + str.toLowerCase());
		System.out.println("\n--------------------------------------------------------");
		
		// 검색 : .indexOf
		System.out.println("charAt: " + str.charAt(5));	 // -> 5번 Index의 글자 출력
		int index = 0; // Index 저장변수
		index = str.indexOf("Programming");			 	 // str내에 "Programming"의 위치 인덱스
		System.out.println("1st search: " + index);
		
		index += "Programming".length();			 	 // 검색 시작 위치를 Programming 뒤뢰 이동
		index = str.indexOf("Programming", index);		 // 새로 뒤로 미뤄진 위치부터 검색 시작
		System.out.println("2nd search: " + index);
		
		index += "Programming".length();
		index = str.indexOf("Programming", index);
		System.out.println("3rd search: " + index);		 // 더이상 검색할 것이 없으면 -1
		// indexOf로 검색시 찾는 것이 없으면 -1로 출력되게 된다.
		
		// 검색2 : .lastIndexOf
		index = str.lastIndexOf("Programming");			 // 검색을 뒤에서부터 찾기
		System.out.println("lastIndexOf: " + index);
		System.out.println("\n--------------------------------------------------------");
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("str: " + str);
		// 부분 문자열 추출 : substring
		System.out.println("substring: " + str.substring(5)); // 5번 Index부터 끝까지
		System.out.println("substring: " + str.substring(5, 22)); // 5번 Index부터 22-1까지 -> 22를 제외한 그니깐 21까지만 출력되는것
		
		// 치환 : Replace
		System.out.println("Replace: " + str.replace("Programming", "Coding"));
		
		String str2 = "                Hello   ";
		String str3 = " , JAVA";
		// Whitespace(공백, 개행, 탭문자) 지우기 : trim();
		String str4 = str2.trim(); // str2의 공백 지우기
		System.out.println(str4 + str3);
		System.out.println(str2);
		
		// 원고출력
		System.out.println(str);
		// -> 문자열 데이터는 불변(Immutable)이다. 여러가지 메서드를 통해 변화가 발생 했더라고 원본은 유지된다.
		System.out.println("\n--------------------------------------------------------");
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 구분자로 분리 : split();
		String[] split = str.split(" "); // 공백 문자를 기준으로 문자열을 분리함 -> 문자열 배열로 변환
		System.out.println(Arrays.toString(split));
		
		for(String data: split) {
			System.out.println("조각: " + data);
		}
		System.out.println("\n--------------------------------------------------------");
		
		// 문자열 비교 메소드 : compareTo
		// 문자열 Unicode 비교 -> 같으면0, 작으면 음수(-1), 크면 양수(1)
		System.out.println("ABC".compareTo("ABD")); // -> ABC가 ABD보다 작다 그래서 음수 출력
		System.out.println("ABD".compareTo("ABC")); // -> 얘는 자리를 바꿨으니깐 반대값이 출력 되겠쯍
		
		
	}

}
