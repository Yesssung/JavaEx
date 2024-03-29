package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스의 직접 객체화 불가
		
		// 추상 클래스를 상속 받은 클래스는 직접 객체화 가능
		Circle c = new Circle(10, 20, 30);
		c.draw();
		
		Ractangle r = new Ractangle(10, 20, 100, 500);
		r.draw();
		
		Point p = new Point(100, 200);
		p.draw();

		// Circle,  Rectangle -> Shape의 서브 클래스
		// Point -> Shape의 서브(자식)클래스가 아님(관계가 없다.)
		// Circle, Rectangle, Point -> Drawable 공통된 인터페이스를 가지고 있다.
		
		Drawable objs[] = new Drawable[] {
				r, c, p
		};
		
		for(Drawable obj: objs) {
			if(obj instanceof Drawable) {
				// 특정 인스턴스가 Drawable 인터페이스의 구현인가 확인하고 싶을 때 instanceof사용
				obj.draw();
			}
		}
	}

}
