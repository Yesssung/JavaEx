package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom{
	
		private String subject;
		private String roomName;
	
		public ClassRoom(String subject, String roomName) {
			super();
			this.subject = subject;
			this.roomName = roomName;
	}
		public ClassRoom(String subject) {
			// containsValue에서 사용하기 위한 생성자
			this.subject = subject;
		}

		@Override
		public String toString() {
			return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
}
		// 동등성 체크 로직
		// 1. subject의 HashCode를 전체 객체의 hashCode로 하자
		// 2. subject의 값이 동일하면 전체 객체의 값도 같다.
		// 이 두개의 관문을 모두 통과해야 동등성을 확인 할 수 있다.
		
		// 1번 과정
		@Override
		public int hashCode() {
			return subject.hashCode();
		}
		
		// 2번 과정
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof ClassRoom) {
				ClassRoom other = (ClassRoom) obj;
				return subject.equals(other.subject);
			}
			return super.equals(obj);
		}	
}


public class HashTableEx {

	public static void main(String[] args) {
		// Map형 자료형 // KeySet 과 List의 복합 자료형
		// Key(KeySet)은 순서가 없고, 중복 불가. // Value는 Key를 통한 접근만 가능, 중복 허용
		
		// HashTable 선언
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// Map 에 데이터 넣기 : put -> 밑에 101,202,등등이 Key값
		map.put("101", new ClassRoom("JAVA", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));
		
		// 출력 : 순서 없음
		System.out.println(map);
		
		// 데이터 참조 : get
		System.out.println(map.get("303")); // Key를 통한 접근 -> 303을 키로 가지고 있는 내부 데이터를 출력하기
		
		// 내부 데이터 변경 : put
		map.put("202", new ClassRoom("C#", "R202"));
		System.out.println(map.get("202"));
		
		// 특정 Key를 포함하고 있는지 확인
		System.out.println(map.containsKey("202"));
		System.out.println(map.containsKey("404"));
		System.out.println(map.containsKey("505"));
		
		// 특정 Value를 포함하고 있는지 확인
		System.out.println(map.containsValue("JAVA"));
		System.out.println(map.containsValue(new ClassRoom("JAVA")));
		
		// 순회 : Iterator -> List, HashMap, HashSet 등에서 사용가능
		System.out.println("===========Iterator");
		Iterator<String> it = map.keySet().iterator();
		
		// keySet으로부터 Iterator 추출
		while(it.hasNext()) { // 뒤에 요소가 더 있는지 확인
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		// map 비우기
		map.clear();
		System.out.println();
		System.out.println(map);
		

	}

}
