package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		// Vector 선언 // 모든 객체(Object)를 담을 수 있는 컬렉션 객체 // .elementAt등 참조를 위해서는 실제 클래스로 캐스팅을 해줘야 한다.
		Vector v = new Vector(); // Vector의 기본Buffer 용량 10개
		System.out.println("Size : " + v.size() + ", Capacity: " + v.capacity());
		
		for(int i = 0; i < 10; i++) {
			// 요소 추가하기
			v.addElement(i); // auto boxing
		}
		
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// 허용량 추가
		v.addElement(10);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		System.out.println("");
		
		// 조회 : .elementAt
		Integer val = (Integer)v.elementAt(5); // elementAt -> object return하기 때문에 기본형 int아니고 객체형Integer사용해야 한다.
		System.out.println(".elementsAt(5): " + val);
		
		// 역참조(검색) : 객체의 Index 조회
		System.out.println(".indexOf(5): " + v.indexOf(5));
		System.out.println(".indexOf(20): " + v.indexOf(20)); // -> 없는 객체이기 때문에 -1출력된다.
		
		// 객체 포함 여부 : .Contains
		System.out.println(".contains(7): " + v.contains(7));
		System.out.println(".contains(20): " + v.contains(20));
		
		// 삭제 : .removeElment
		v.removeElement(7); // 7번 객체 삭제, but 그래도 이미 생성된 추가 Buffer(용량)들은 삭제되지 않고 남아있다.
		
		for(int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item + " ");
		}
		// 컬렉션 프레임워크에서는 루프의 개선이 필요하다. -> 루프 방식 개선
		System.out.println("");
		System.out.println("\n===============Enumeration");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			// 뒤쪽에 요소가 더 있는가?
			Integer item = (Integer)e.nextElement(); // Element 는 Object 를 자동 실행되기 때문에 Casting 해줘야 함!
			System.out.print(item + " ");
		}
		System.out.print("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		
		System.out.println();
		System.out.println("Size : " + v.size() + ", Capasity : " + v.capacity());
		
		// Buffer 속 비우기
		v.clear();
		System.out.println("v = " + v);
		System.out.println("Size : " + v.size() + ", Capasity : " + v.capacity());
		
		// Generic을 사용하여 코드개선 가능
		// ex) Nummber를 상속한 모든 객체를 담을 수 있는 Generic을 사용
//		Vector<Integer> v2 = new Vector<>(); // 이 Vector 안쪽에는 정수(int)만 가능 -> fix상태
		Vector<?super Number> v2 = new Vector<>(); // -> Number 상속받은 클래스만 저장 -> Number에 속해있는거 다 상속 가능 int, double, float 등등
		v2.addElement(Integer.valueOf(2024)); 
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement("Vector"); // String은 Number상속 받지 않으므로 적용 불가 -> 개선된 방식으로 루프 돌리기
		
		Enumeration<? super Number> e2 = v2.elements();
		while(e2.hasMoreElements()) { // 뒤에 요소 더 있음?
			System.out.println(e2.nextElement());
			
		}
		
		
	}

}
