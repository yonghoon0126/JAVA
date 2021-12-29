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
		ts.setDaemon(true);	// daemon Thread ==> main�� �����ϸ� ��� thread����
		ts.setDaemon(false);	// user Thread ==> main����� �����ϰ� thread��� ����
		
		
		System.out.println("������ �ʱⰪ Ȯ�� : " + ts.isDaemon());	// �⺻�� false
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
