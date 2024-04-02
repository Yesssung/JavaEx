package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		// String은 Immutable
		// StringBuffer은 mutable-> 내부에 버퍼 공간을 두고, 버퍼에서 작업후 최종 소비되는 시점에서 문자열로 반환
		// 메모리 관리 측면에서 String보다 유리
		
		// 버퍼 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); 					// -> 기본 Buffer공간 10개(아마도?)
		
		// 문자열 추가 : append
		sb.append(" is pencil");
		System.out.println(sb); 	
		
		// 문자열 삽입 : insert
		sb.insert(7, " my");
		System.out.println(sb);
		
		// 문자열 치완 : replace
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		// 메소드 체이닝 : 메소드를 연속적으로 호출하면서, 객체를 변화시키는 방법 ->  위에처럼 다 따로해서 출력안해도 한꺼번에 가능
		StringBuffer sb2 = new StringBuffer("this")
								.append(" is pencil")		// 추가
								.insert(7, " my")			// 삽입
								.replace(7, 10, " your");	// 대체
		System.out.println(sb2);
		
	}

}
