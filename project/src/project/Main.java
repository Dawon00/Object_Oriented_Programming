/*
[�ּ� 1: ���� ����]
��ü�������α׷��� �򰡰���
�а� : ��ǻ�����ڽý��۰��к�
�й� : 202001707
�̸� : ���ٿ�

���� ���� : �ڷγ�19 ���� ��Ȳ�� �Ÿ��α� ������ ���� ��ü�����̷��� ����Ͽ� �ܼ�â�� ��Ÿ�� �� �ֵ��� �߽��ϴ�.
*/

package project;

import java.util.ArrayList;

interface Color{ // �������̽�
	void danger_color(); // �߻� �޼ҵ�
}

interface English{
	void english();
}

abstract class Step implements Color, English{ // [�ּ� 7 : �߻� Ŭ����]
												//	[�ּ�	 11 : ���� �������̽�]	
	public abstract void mean();
	public abstract void gather();
	public abstract void work();

}


class Step1 extends Step{ // �������̵�
	public void mean() { //�߻� �޼ҵ� ����
		System.out.println("������ �������� ����");
	}
	public void gather() {
		System.out.println("�濪��Ģ�� �ؼ��ϸ鼭 �������� ����");
	}
	public void work() {
		System.out.println("���� �������, ���ɽð� ������, ���ñٹ� ���� ����");
	}
	
	
	@Override
	public void danger_color() {
		System.out.println("�ʷϻ�");
		
	}
	@Override
	public void english() {
		System.out.println("one");				
	}
}

class Step2 extends Step{ // [�ּ� 2: Ŭ���� ���]
	public void mean() {
		System.out.println("�������� / �ο� ����");
	}
	public void gather() {
		System.out.println("8����� �������� ���� (9�� �̻� �������� ����)");
	}
	public void work() {
		System.out.println("300�� �̻� �����(������ ����) ���� �������, ���ɽð� ������, ���ñٹ� 10% �ǰ�");
	}

	
	@Override
	public void danger_color() {
		System.out.println("�����");
		
	}
	@Override
	public void english() {
		System.out.println("two");				
	}
}

class Step3 extends Step{ // [�ּ� 6 : �������̵�]
	public void mean() { // [�ּ� 5 : �����ε�]
		System.out.println("�ǿ� ���� / ���� ����");
	}
	public void gather() {
		System.out.println("4����� �������� ���� (5�� �̻� �������� ����)");
	}
	public void work() {
		System.out.println("50�� �̻� �����(������ ����) ���� �������, ���ɽð� ������, ���ñٹ� 20% �ǰ�");
	}

	
	@Override
	public void danger_color() {
		System.out.println("��Ȳ��");
		
	}
	@Override
	public void english() {
		System.out.println("three");				
	}
}

class Step4 extends Step{ // �������̵�
	public void mean() {
		System.out.println("������ / ���� ����");
	}
	public void gather() {
		System.out.println("18�� ���� 2����� �������� ���� (3�� �̻� �������� ����)");
	}
	public void work() {
		System.out.println("������ ������ ����忡 ���� �������, ���ɽð� ������, ���ñٹ� 30% �ǰ�");
	}

	
	@Override
	public void danger_color() {
		System.out.println("������");
		
	}
	@Override
	public void english() {
		System.out.println("four");				
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̱� / ����Ȯ���� : 49,615,534 / �ű�Ȯ���� : 172,119 / ����� : 1.6% ");
		list.add("�ε� / ����Ȯ���� : 34,674,643 / �ű�Ȯ���� : 8,402 / ����� : 1.4% ");
		list.add("���� / ����Ȯ���� : 10,739,496 / �ű�Ȯ���� : 58,352 / ����� : 1.4% ");
		int cnt = 0;
		while(true) {
			try { // [�ּ� 10 : ���� ó��]
				System.out.println("(Thread Ŭ����) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("��Ż���� / ����Ȯ���� : 5,185,270 / �ű�Ȯ���� : 20,490 / ����� : 2.6% ");
		list.add("�ݷҺ�� / ����Ȯ���� : 5,089,695 / �ű�Ȯ���� : 1,687 / ����� : 2.5% ");
		list.add("�ε��׽þ� / ����Ȯ���� : 4,258,752 / �ű�Ȯ���� : 192 / ����� : 3.4% ");
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Runnable �������̽�) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
	}
}

public class Main {
	static void show(Step s) {
		s.mean();
		s.gather();
		s.work();
		s.danger_color();
		s.english();
	}
	static int yesterday_death = 1500;
	static int today_death = 5;

			
	static int deathSum() { // [�ּ� 4 : static �޼ҵ�]
		int sum = yesterday_death + today_death;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("------1�ܰ� �Ÿ��α� ����-------");
		Step1 step1 = new Step1(); // [�ּ� 3 : ������]
		show(step1); // [�ּ� 8 : ������]
		System.out.println();
		System.out.println("------2�ܰ� �Ÿ��α� ����-------");
		Step2 step2 = new Step2(); //������
		show(step2);
		System.out.println();
		System.out.println("------3�ܰ� �Ÿ��α� ����-------");
		Step3 step3 = new Step3(); //������
		show(step3);
		System.out.println();
		System.out.println("------4�ܰ� �Ÿ��α� ����-------");
		Step4 step4= new Step4(); //������
		show(step4);
		System.out.println();
		System.out.println("------���ñ����� ���� ����ڼ�-------");
		int result = deathSum();
		System.out.println(result + "��");
		System.out.println();
		System.out.println("------������ Ȯ���ڼ�-------");
		Integer yesterday_confirm = new Integer(600); // [�ּ� 9 : Wrapper ��ü�� �ڽ�]
		Integer today_confirm = new Integer(650);
		System.out.println(today_confirm - yesterday_confirm);
		System.out.println();
		System.out.println("------������ ��Ȳ-------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("���þ� / ����Ȯ���� : 9,782,723 / �ű�Ȯ���� : 30,383 / ����� : 2.9% ");
		list.add("������ / ����Ȯ���� : 7,912,944 / �ű�Ȯ���� : - / ����� : 1.5% ");
		list.add("���� / ����Ȯ���� : 6,496,142 / �ű�Ȯ���� : 53,296 / ����� : 1.6% ");
		Thread t = new MyThread(); // [�ּ� 12 : ���߽�����(Thread Ŭ����)]
		t.start();
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Thread Ŭ����) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
		list.add("�̶� / ����Ȯ���� : 6,150,843 / �ű�Ȯ���� : 2,971 / ����� : 2.1% ");
		list.add("�Ƹ���Ƽ�� / ����Ȯ���� : 5,354,440 / �ű�Ȯ���� : 3,573 / ����� : 2.2% ");
		list.add("������ / ����Ȯ���� : 5,290,273 / �ű�Ȯ���� : 17,095 / ����� : 1.7% ");
		Runnable r = new MyRunnable(); // [�ּ� 13 : ���߽�����(Runnable �������̽�)]
		Thread t_1 = new Thread(r);
		t_1.start();
	
		int cnt_1 = 3;
		while(true) {
			try {
				System.out.println("(Runnable �������̽�) " + list.get(cnt_1));
				cnt_1++;
			}
			catch(Exception e) {
				break;
			}
		}	

	}
}
