package thread_EX;

public class SynchronizedEx {
	public static void main(String[] args) {

		SyncObject obj = new SyncObject();
		Thread th1 = new WorkerThread("kitae", obj);
		Thread th2 = new WorkerThread("hyosoo", obj);

		th1.start();
		th2.start();
	}
}; // main

//====================================================================================================

//	공유 데이터인 집계판을 시뮬레이션하는 클래스.
//	두 WorkerThread 스레드에 의해 동시 접근됨
class SyncObject {
	int sum = 0;	// 집계판의 합

	void add() {
	synchronized (this) {
	//void add() synchronized{

		int n = sum;	// 집계판의 합

		// Thread.currentThread().yield();
		// 스레드의 실행 속도가 너무 빠르기 때문에
		// 충돌 발생이 쉽지 않다. 그래서 고의로 add()메소드에
		// 대한 충돌을 쉽게 발생시키기 위해 다른 스레드에게 양보하도록 하였음.
		Thread.currentThread();
		Thread.yield();
		
		n += 10;	// 10을 증가
		sum = n;	// 증가한 값을 집계합에 쓴다.
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}
	int getSum() {
		return sum;
	}
}; // SyncObject

//====================================================================================================

// 학생을 시뮬레이션 하는 스레드 클래스
class WorkerThread extends Thread {
	SyncObject sObj;	// 집계판의 주소
	
	WorkerThread(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}

//====================================================================================================
	
	// 집계판을 반복적으로 10번 접근하여 카운팅한다.
	public void run() {
		
		int i = 0;
		
		while (i < 10) {
			sObj.add();
			i++;
		}
	}
}
