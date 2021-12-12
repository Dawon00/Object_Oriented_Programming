/*
[주석 1: 과제 설명]
객체지향프로그래밍 평가과제
학과 : 컴퓨터전자시스템공학부
학번 : 202001707
이름 : 서다원

과제 주제 : 코로나19 관련 현황과 거리두기 정보를 여러 객체지향이론을 사용하여 콘솔창에 나타낼 수 있도록 했습니다.
*/

package project;

import java.util.ArrayList;

interface Color{ // 인터페이스
	void danger_color(); // 추상 메소드
}

interface English{
	void english();
}

abstract class Step implements Color, English{ // [주석 7 : 추상 클래스]
												//	[주석	 11 : 다중 인터페이스]	
	public abstract void mean();
	public abstract void gather();
	public abstract void work();

}


class Step1 extends Step{ // 오버라이딩
	public void mean() { //추상 메소드 구현
		System.out.println("지속적 억제상태 유지");
	}
	public void gather() {
		System.out.println("방역수칙을 준수하면서 사적모임 가능");
	}
	public void work() {
		System.out.println("시차 출퇴근제, 점심시간 시차제, 재택근무 자율 시행");
	}
	
	
	@Override
	public void danger_color() {
		System.out.println("초록색");
		
	}
	@Override
	public void english() {
		System.out.println("one");				
	}
}

class Step2 extends Step{ // [주석 2: 클래스 상속]
	public void mean() {
		System.out.println("지역유행 / 인원 제한");
	}
	public void gather() {
		System.out.println("8명까지 사적모임 가능 (9인 이상 사적모임 금지)");
	}
	public void work() {
		System.out.println("300인 이상 사업장(제조업 제외) 시차 출퇴근제, 점심시간 시차제, 재택근무 10% 권고");
	}

	
	@Override
	public void danger_color() {
		System.out.println("노랑색");
		
	}
	@Override
	public void english() {
		System.out.println("two");				
	}
}

class Step3 extends Step{ // [주석 6 : 오버라이딩]
	public void mean() { // [주석 5 : 오버로딩]
		System.out.println("권역 유행 / 모임 금지");
	}
	public void gather() {
		System.out.println("4명까지 사적모임 가능 (5인 이상 사적모임 금지)");
	}
	public void work() {
		System.out.println("50인 이상 사업장(제조업 제외) 시차 출퇴근제, 점심시간 시차제, 재택근무 20% 권고");
	}

	
	@Override
	public void danger_color() {
		System.out.println("주황색");
		
	}
	@Override
	public void english() {
		System.out.println("three");				
	}
}

class Step4 extends Step{ // 오버라이딩
	public void mean() {
		System.out.println("대유행 / 외출 금지");
	}
	public void gather() {
		System.out.println("18시 이후 2명까지 사적모임 가능 (3인 이상 사적모임 금지)");
	}
	public void work() {
		System.out.println("제조업 제외한 사업장에 시차 출퇴근제, 점심시간 시차제, 재택근무 30% 권고");
	}

	
	@Override
	public void danger_color() {
		System.out.println("빨간색");
		
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
		list.add("미국 / 누적확진자 : 49,615,534 / 신규확진자 : 172,119 / 사망률 : 1.6% ");
		list.add("인도 / 누적확진자 : 34,674,643 / 신규확진자 : 8,402 / 사망률 : 1.4% ");
		list.add("영국 / 누적확진자 : 10,739,496 / 신규확진자 : 58,352 / 사망률 : 1.4% ");
		int cnt = 0;
		while(true) {
			try { // [주석 10 : 예외 처리]
				System.out.println("(Thread 클래스) " + list.get(cnt));
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
		list.add("이탈리아 / 누적확진자 : 5,185,270 / 신규확진자 : 20,490 / 사망률 : 2.6% ");
		list.add("콜롬비아 / 누적확진자 : 5,089,695 / 신규확진자 : 1,687 / 사망률 : 2.5% ");
		list.add("인도네시아 / 누적확진자 : 4,258,752 / 신규확진자 : 192 / 사망률 : 3.4% ");
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Runnable 인터페이스) " + list.get(cnt));
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

			
	static int deathSum() { // [주석 4 : static 메소드]
		int sum = yesterday_death + today_death;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("------1단계 거리두기 정보-------");
		Step1 step1 = new Step1(); // [주석 3 : 생성자]
		show(step1); // [주석 8 : 다형성]
		System.out.println();
		System.out.println("------2단계 거리두기 정보-------");
		Step2 step2 = new Step2(); //생성자
		show(step2);
		System.out.println();
		System.out.println("------3단계 거리두기 정보-------");
		Step3 step3 = new Step3(); //생성자
		show(step3);
		System.out.println();
		System.out.println("------4단계 거리두기 정보-------");
		Step4 step4= new Step4(); //생성자
		show(step4);
		System.out.println();
		System.out.println("------오늘까지의 누적 사망자수-------");
		int result = deathSum();
		System.out.println(result + "명");
		System.out.println();
		System.out.println("------증가한 확진자수-------");
		Integer yesterday_confirm = new Integer(600); // [주석 9 : Wrapper 객체의 박싱]
		Integer today_confirm = new Integer(650);
		System.out.println(today_confirm - yesterday_confirm);
		System.out.println();
		System.out.println("------국가별 현황-------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("러시아 / 누적확진자 : 9,782,723 / 신규확진자 : 30,383 / 사망률 : 2.9% ");
		list.add("프랑스 / 누적확진자 : 7,912,944 / 신규확진자 : - / 사망률 : 1.5% ");
		list.add("독일 / 누적확진자 : 6,496,142 / 신규확진자 : 53,296 / 사망률 : 1.6% ");
		Thread t = new MyThread(); // [주석 12 : 다중스레드(Thread 클래스)]
		t.start();
		int cnt = 0;
		while(true) {
			try {
				System.out.println("(Thread 클래스) " + list.get(cnt));
				cnt++;
			}
			catch(Exception e) {
				break;
			}
		}
		list.add("이란 / 누적확진자 : 6,150,843 / 신규확진자 : 2,971 / 사망률 : 2.1% ");
		list.add("아르헨티나 / 누적확진자 : 5,354,440 / 신규확진자 : 3,573 / 사망률 : 2.2% ");
		list.add("스페인 / 누적확진자 : 5,290,273 / 신규확진자 : 17,095 / 사망률 : 1.7% ");
		Runnable r = new MyRunnable(); // [주석 13 : 다중스레드(Runnable 인터페이스)]
		Thread t_1 = new Thread(r);
		t_1.start();
	
		int cnt_1 = 3;
		while(true) {
			try {
				System.out.println("(Runnable 인터페이스) " + list.get(cnt_1));
				cnt_1++;
			}
			catch(Exception e) {
				break;
			}
		}	

	}
}
