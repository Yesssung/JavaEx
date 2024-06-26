package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
//		List l = new List(); // 이건 안돼용 왜냐면 List는 클래스가 아니기 때문에 객체를 새로 만들 수 없어용
		
		
		// List는 객체가 아니라 인터페이스에요
		// 특징 : 순서 o, 중복 o
		List<String> lst = new LinkedList<>();
//		List<String> lst = new ArrayList<>(); // ArrayList가 필요하면 그냥 이렇게 추가하면 끗(import는 해주세오)
		
		// 객체 추가 : .add -> 맨 마지막에 노드 추가됨요
		lst.add("JAVA");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		
		
		System.out.println("lst = " + lst);
		
		// 객체 삽입 -> 새 노드 삽입
		lst.add(2, "C#"); // 두번째에 C# 추가 -> 이친구의 번호가 2번이 되는겨
		System.out.println("lst = " + lst);
		
		// 중복 삽입 허용
		lst.add("JAVA");
		System.out.println("lst = " + lst); // 순서를 정하지 않았으니 맨 뒤에 중복된 자바가 추가된다.
		
		System.out.println("Size : " + lst.size());
//		System.out.println("Capacity : " + lst.capacity()); // -> 야는 확인 안되유
		
		// 삭제 : 인덱스 삭제
		lst.remove(2); // 2번 인덱스 삭제
		
		// 삭제 : 객체 삭제
		lst.remove("Python");
		System.out.println("lst = " + lst);
		
		// Set자료형 List순회시(반복시) Iterator 객체 사용한다
		System.out.println("======================Iterator");
		Iterator<String> it = lst.iterator();	// 반복자 추출
		while(it.hasNext()) {	// 뒤에 요소가 더 있나효?
			String item = it.next();	// 요소 추출 후 다음으로 이동
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		// 비우기
		lst.clear();
		System.out.println("lst = " + lst);
	}

}
