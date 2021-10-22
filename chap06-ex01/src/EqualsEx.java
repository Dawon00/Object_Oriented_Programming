//int 타입의 너비와 높이 필드를 가지는 Rect 클래스
//면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()
class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if (width*height == p.width*p.height) 
			return true;
		else 
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b)) 	
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
		 	System.out.println("b is equal to c");
	}
}