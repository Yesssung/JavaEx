package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; // -> SQL date 랑 헷갈리지 말자

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간, 데이터를 표현하는 객체
		// 날짜 관련 기능은 Calender 객체
		Date now = new Date(); // 현재 날짜와 시간 출력 가능
		System.out.println("현재시간 : " + now);
		
		// 기본 출력
		// DateFormat 클래스로 기본적인 출력 형식을 맞출 수 있다.
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL); // Full format -> 년, 월, 일, 요일 다 나옴
		System.out.println("FULL : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG); // Long format -> 년, 월, 일 까지만 나옴
		System.out.println("LONG : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM); // Medium -> 년, 월, 일 나오는데 간단하게 표시
		System.out.println("MEDIUM : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT); // Short -> 년, 월, 일 나오는데 더 간단하게 나옴ㅋㅋ
		System.out.println("SHORT : " + df.format(now));
	
		// Date Format과 Time Format을 이용 날짜와 시간 표기
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("날짜 포맷: " + sdf.format(now));
	
	
	}

}
