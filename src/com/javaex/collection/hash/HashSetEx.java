package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

class Student{
		int id;
		String name;
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		// 객체의 동등성을 비교하기 위한 두가지 -> 1. hashCode() 
		   							   // 2. equals()
		// 값의 동일성 판별을 위한 hashCode 메서드 오버라이드
		// 로직 :  학번 기준
		@Override
		public int hashCode() {
			return id;
		}
		// 값의 동일성 판별을 위한 equals 메서드 오버라이드
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student other = (Student)obj;
				return id == other.id && name.equals(other.name);
			}
			return super.equals(obj);
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

	
	
		
	
}

public class HashSetEx {

	public static void main(String[] args) {
		// 1. HashSet 사용법(기본타입형)
//		usingHashSet();
		
		// 2. 집합 연산
//		setOperation();
		
		// 3. HashSet 사용법(객체 자료형)
		usingHashSetWithCustom();
	}
	
	private static void usingHashSet() {
		// HashSet 선언
		HashSet<String> hs = new HashSet();
		
		// 요소(객체) 추가
		hs.add("JAVA");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("JAVA"); // 중복선언 불가
		
		System.out.println("HS: " + hs);
		System.out.println("size: " + hs.size());
		
		// 특정 객체 포함여부
		System.out.println();
		System.out.println("C++ 포함? " + hs.contains("C++"));
		System.out.println("Linux 포함? " + hs.contains("Linux"));
		System.out.println("HS: " + hs);

		// 순서 x : 객체로 삭제하는 방법만 제공
		hs.remove("C++");
		System.out.println("HS: " + hs);
	}
	
	private static void setOperation() {
		// 집합 연산
		HashSet<Integer> numbers = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체집합 : " + numbers);
		HashSet<Integer> odds = new HashSet(Arrays.asList(1, 3, 5, 7, 9));
		System.out.println("홀수집합 : " + odds);
		HashSet<Integer> evens = new HashSet(Arrays.asList(2, 4, 6, 8, 10));
		System.out.println("짝수집합 : " + evens);
		HashSet<Integer> mThree = new HashSet(Arrays.asList(3, 6, 9));
		System.out.println("3의 배수의 집합 : " + mThree);
		
		// 교집합 : retainAll -> ex) odds에서의 3의 배수 교집합을 구하면 3, 9가 출력 될텐데 이렇게 되면 odds 와 mThree등의 객체의 값 자체가 바뀐다.
		// 그렇기 때문에 원본 보호를 위해서 복제해서 사용
		System.out.println();
		System.out.println("===============retainAll(교집합)");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.retainAll(setB); // 집합A 교집합B = {3, 9}
		System.out.println("교집합 : " + setA);
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3,9))));
		
		// 합집합 : addAll
		System.out.println();
		System.out.println("===============addAll(합집합)");
		setA = (HashSet<Integer>)odds.clone();
		setB = (HashSet<Integer>)evens.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.addAll(setB); // 두 집합을 합칠꺼여
		System.out.println("합집합 : " + setA);
		System.out.println(setA.equals(numbers));
		
		
		// 차집합 : removeAll
		System.out.println();
		System.out.println("==================removeAll(차집합)");
		setA = (HashSet<Integer>)numbers.clone();
		setB = (HashSet<Integer>)odds.clone();
		System.out.println("집합A : " + setA);
		System.out.println("집합B : " + setB);
		
		setA.removeAll(setB); // A집합에서 B를 빼줄꺼여
		System.out.println("차집합 : " + setA);
		System.out.println(setA.equals(evens));
	}
	
	private static void usingHashSetWithCustom() {
		HashSet<Student> hs = new HashSet<>(); // 오직 student 만 관리할 수 있는 HashSet
		
		Student s1 = new Student(10, "최연준");
		Student s2 = new Student(20, "최연준"); // 둘은 이름은 같지만 id랑 해시코드가 다르기 때문에 다른인물이라고 볼 수 있다.
		Student s3 = new Student(30, "휴닝이");
		Student s4 = new Student(30, "휴닝이"); // 휴닝이는 이름도 같고 id도 같다. -> 동일인 
											  // 그렇지만 둘은 같은 객체가 아님. -> 어떻게 동일인으로 인식하게 할 수 있을까?
		// s3 와 s4 는 동일인임으로 두 객체를 동등 객체로 판정하는 로직을 만들어라
		// 위에 메소드 오버라이드 했기 때문에 s3와 s4를 동일인으로 보고 한번만 출력하도록 만들었다.
		
		hs.add(s1); hs.add(s2); hs.add(s3); hs.add(s4);
		System.out.println("학생부 : " + hs);
		
	}

}
