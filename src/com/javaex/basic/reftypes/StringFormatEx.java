package com.javaex.basic.reftypes;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열), %d(10진수), %n(개행)
		
		// __개의__중에서__개를 먹었다.
		String fruit = "사과";
		int total = 10, eat = 3;
		
		System.out.printf("%d 개의 %s 중에서 %d 개를 먹었다.%n", total, fruit, eat); // 순서 중요
		
		
		// %d 의 천단위 구분 기호: %,d
		int amount = 1_234_567_890;
		System.out.printf("%,d%n", amount);
//		System.out.println(amount);
		
		
		// %f : 실수표시 / %2f: 소수점 몇번째 까지 표시하고 싶을때 2는 두번째, 3은 세번째
		double pi = Math.PI;
		System.out.printf("PI: %.2f%n", pi);
//		System.out.println(pi);

		
		
		// 포맷 형식은 String형의 .format 메서드에서 구현된다
		String fmt = "%d 개의 %s 중에서 %d 개를 먹었다.%n"; // 미리 틀을 만들어 놓고 값만 바꿔줄 수 있다.
		System.out.println(fmt.formatted(10, "바나나", 2)); // println, printf 둘다 값 출력 가능
		
		
		
		
	}

}
