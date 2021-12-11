import javax.swing.*;

public class MyFrame00 extends JFrame {
	public MyFrame00() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true);   // 프레임 출력
	}

	public static void main(String[] args) {
		MyFrame00 frame = new MyFrame00();
	}
}