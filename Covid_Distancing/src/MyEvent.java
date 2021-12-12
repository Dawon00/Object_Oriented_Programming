import javax.swing.*;
import java.awt.*;

public class MyEvent extends JFrame {
	public MyEvent() {
		setTitle("코로나19 사회적 거리두기 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(null);

		c.add(new JButton("1단계"));
		c.add(new JButton("2단계"));
		c.add(new JButton("3단계"));
		c.add(new JButton("4단계"));


		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyEvent();
	}
}