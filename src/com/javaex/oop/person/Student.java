package com.javaex.oop.person;

public class Student extends Person {
	
	private String schoolName;
	
//////////////////////////////////////////////////////////////////////	
	
	public Student(String schoolName) {
		super("", 0); // super로 부모 먼저 생성해주기
		this.schoolName = schoolName;
	}
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
	}

//////////////////////////////////////////////////////////////////////
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
//////////////////////////////////////////////////////////////////////
	
	public void showInfo() {
		System.out.printf("이름: %s%n나이: %d%n학교: %s%n", super.getName(), super.getAge(),schoolName);
	}

}
