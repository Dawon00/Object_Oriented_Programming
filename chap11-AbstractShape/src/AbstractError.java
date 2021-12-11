
abstract class Shape {
	private int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();

};

class Circle extends Shape{
	private int radius;
	public void draw() { //추상 메소드 구현
		System.out.println("원 그리기 메소드");
	}
};

class Rectangle extends Shape{
	private int width, height;
	public void draw() { //추상 메소드 구현
		System.out.println("사각형 그리기 메소드");
	}
};

public class AbstractError{
	public static void main(String [] args) {
		Shape shape;
		shape = new Shape(); // 컴파일 오류.추상 클래스 Shape 의 객체를 생성할 수 없다.
		shape.move(10, 20);
	}
}