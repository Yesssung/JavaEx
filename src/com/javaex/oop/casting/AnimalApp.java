package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("Snoopy"); // 원래는 Animal이면 new Animal이어야 하는데 부모 클래스를 Dog가 참조한것 그래서 new Dog도 가능 -> 이게 " UpCasting"
		Animal cat1 = new Cat("Kitty");
		
		
		
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 설계도class(Animal)에 없기 때문에 사용 안됌 위에 Dog는 부모클래스를 참조했기 때문
					 // 그래서 자식 클래스에만 있는 bark를 사용하고 싶으면 DownCasting이 필요
		((Dog)(dog1)).bark(); // -> 강제변환
		{
			 Dog pet = new Dog("Azi");
			 pet.eat();
			 pet.walk();
//			 pet.bark();

			 pet = null;
//			 pet = new Cat("아즈라엘"); // 형제간 참조는 불가하다 부모클래스만 참조 가능
		}
		{
			Animal pet = new Dog("Azi");
			 pet.eat();
			 pet.walk();
//			 pet.bark();
			 
			 pet = null;
			 
			 pet = new Cat("아즈라엘"); // 이 경우는 부모클래스를 참조한게 되기 때문에 참조 가능 but 자식 클래스에만 있던 bark 메소드는 불가
			 pet.eat();
			 pet.walk();
//			 pet.meow();
			 
			 // 현재 pet이 어떤 클래스의 객체(인스턴스)인지 확인 -> DownCasting
			 if(pet instanceof Dog) { // Dog의 인스턴스면
				 ((Dog)pet).bark();
			 } else if(pet instanceof Cat) { // Cat의 인스턴스면
				 ((Cat)pet).meow();
			 }
	 
		}
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		
		cat1.eat();
		cat1.walk();
//		cat1.meow(); // 얘도 마찬가지로 부모클래스 참조했기 때문에 자기 설계도에만 있는것은 적용 안됨
		((Cat)(cat1)).meow(); // -> 강제변환
		
		Cat cat2 = new Cat("Mango");
		cat2.eat();
		cat2.walk();
		cat2.meow();
		
			
	}

}
