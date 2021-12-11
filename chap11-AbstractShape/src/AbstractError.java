
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
	public void draw() { //�߻� �޼ҵ� ����
		System.out.println("�� �׸��� �޼ҵ�");
	}
};

class Rectangle extends Shape{
	private int width, height;
	public void draw() { //�߻� �޼ҵ� ����
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
};

public class AbstractError{
	public static void main(String [] args) {
		Shape shape;
		shape = new Shape(); // ������ ����.�߻� Ŭ���� Shape �� ��ü�� ������ �� ����.
		shape.move(10, 20);
	}
}