class MyMath {
	// 정수값을 제곱하는 메소드
	int square(int i) {
		return i * i;
	}
	// 실수값을 제곱하는 메소드
	double square(double i) {
		return i * i;
	}
}

public class Ex04_11 {
	public static void main(String args[]) {
		MyMath obj = new MyMath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	}
}