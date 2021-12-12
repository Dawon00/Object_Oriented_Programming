public class InterruptThread extends Thread {
	private int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n); // 화면에 카운트 값 출력
			n++;
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				return; // 예외를 받고 스스로 리턴하여 종료
			}
		}
	}
	
	public static void main(String [] args) {
		InterruptThread th = new  InterruptThread();
		th.start();
		
		th.interrupt(); // InterruptThread 강제 종료
	}

}