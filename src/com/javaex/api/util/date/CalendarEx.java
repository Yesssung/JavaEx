package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 캘린더 불러오기 : .getInstance()를 통해 인스턴스 확보 가능
		Calendar now = Calendar.getInstance(); // 현재 날짜와 시간
		Calendar custom = Calendar.getInstance();
		
		// 시간 정보 설정
		custom.set(2012, 8 , 24); // 2012년 9월 24일 -> 월 정보는 0부터 시작하기 때문
		
		// 상수를 이용한 날짜 정보 얻어오기
		// 년, 월, 일 받아오기
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH)+1; // 이대로 출력하면 우리가 원하는 지금 월인 4월이 나오는게 아니라 3월이 출력되게 된다. MONTH는 0부터 세기 때문에 우리가 원하는 월을 출력하기 위해서는 반드시 +1을 해줘야 한다.
		int nowDate = now.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. %n", nowYear, nowMonth, nowDate);
		
		
		// 미래 시간 출력 HOW?
		Calendar future = Calendar.getInstance(); // 현재시간
		future.add(Calendar.YEAR, 10); // 현재 날짜 정보에 10년을 더함
		System.out.printf("10년 후 오늘은 %d년 %d월 %d일 입니다. %n", future.get(Calendar.YEAR), future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));
		
		
		// 요일정보 확인
		int dow = future.get(Calendar.DAY_OF_WEEK); // 요일정보 확인
		System.out.println(dow); // 10년후 4월3일이 무슨 요일인가 -> 출력 : 2 (2는 월요일)
	}

}
