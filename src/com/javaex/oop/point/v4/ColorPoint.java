package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point { // 오류나지 않게 상속받으려면 부모 클래스에 기본생성자 필요
										// 만약 부모 클래스에 기본생성자가 없으면 super로 호출
	
	// 필드
	private String color;
//	ColorPoint cp1 = new ColorPoint("red");
//	ColorPoint cp2 = new ColorPoint(10, 10, "blue");

	// 생성자
	public ColorPoint(String color) {
		super(0,0);
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	// getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 일반 메서드
	public void draw() {
		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다. %n",
							super.getX(), super.getY()/* private 이기 때문에 getter사용해서 우회접근 */, color);
//		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다. %n",
//							x, y,/*protected로 되어있다면 그냥 사용해서 접근 가능*/ color);
	}
	@Override
	public void draw(boolean bDraw) {
		String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ",
				super.getX(), super.getY(), color );
		message += bDraw ?"그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
	
}
