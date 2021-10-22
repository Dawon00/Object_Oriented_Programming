import java.util.*;

public class Ex05_08e {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����(0), ����(1), ��(2): ");
		int user = sc.nextInt();

		int computer = (int) (Math.random() * 3);            // random()�� 0.0 ~ 1.0 �̸��� double �� �� ��ȯ

		if( user == computer )
			System.out.println("�ΰ��� ��ǻ�Ͱ� �����");
		else if (user == (computer + 1) % 3)                  // 0�� 1���� ���� 1�� 2����, 2�� 0���� ����.
			System.out.println("�ΰ�: " + user + " ��ǻ��: " + computer + "   �ΰ� �¸�");
		else
			System.out.println("�ΰ�: " + user + " ��ǻ��: " + computer + "   ��ǻ�� �¸�");
	}
}