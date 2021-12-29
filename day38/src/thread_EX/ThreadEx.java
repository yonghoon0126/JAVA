package thread_EX;

class ThreadSub extends Thread {
	@Override
	public void run() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}; // ThreadSub

public class ThreadEx {

	public static void main(String[] args) {
		
		ThreadSub ts = new ThreadSub();
		ts.setDaemon(true);	// daemon Thread ==> main이 종료하면 모든 thread종료
		ts.setDaemon(false);	// user Thread ==> main종료와 무관하게 thread계속 실행
		
		
		System.out.println("스레드 초기값 확인 : " + ts.isDaemon());	// 기본값 false
		ts.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main : " + i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
