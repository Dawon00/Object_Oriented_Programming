import javax.swing.*;
import java.awt.*;

public class MyEvent extends JFrame {
	public MyEvent() {
		setTitle("�ڷγ�19 ��ȸ�� �Ÿ��α� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(null);

		c.add(new JButton("1�ܰ�"));
		c.add(new JButton("2�ܰ�"));
		c.add(new JButton("3�ܰ�"));
		c.add(new JButton("4�ܰ�"));


		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyEvent();
	}
}