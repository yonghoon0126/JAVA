package thread_Ex;

//	-스레드의 생명주기
//	스레드는 Thread 객체가 생성되면 생명주기를 갖게 되는데 크게 5가지로 나눈다.
//		1. new - 스레드가 만들어진 상태
//		2. Runnable - 스레드 객체가 생성된 후에 Start() 메소드를 호출하면 
//						Runnable 상태로 이동하게 된다.
//		3. Running - Runnable 상태에서 스레드 스케줄러에 의해 Runnig 상태로 이동.
//		4. Blocked - 스레드가 다른 특정한 이유로 Running 상태에서 Blocked 상태로 이동.
//		5. Dead - 스레드가 종료되면 그 스레드는 다시 시작할 수 없게 된다.
//	
//	스레드 활용 : Thread class를 상속받아서 구현하기
//	스레드 활용 : main부터 실행되고 Sub 실행
//	
//	*Thread의 종류
//		-User Thread : main의 종료와 상관없이 thread가 계쏙 실행됨
//						[setDaemon(false)]와 같다.
//		-Daemon Thread : main의 종료시 thread종료 : Daemon : 보조 스레드 
//						예)gc,메인을 대신 [setDaemon(true)]와 같다.
//		
//		*Thread.activeCount();	// 현재 실행 중인 thread의 개수 스레드의 스케줄 방식
//		
//		-선점형 스레드 스케줄링 방식 : 스레드의 우선권을 가지고 우선순위가 높은 스레드를 
//								먼저 수행시키는 방식
//		
//		-비선점형 스레드 스케줄링 방식 : 실행중인 스레드가 CPU 사용권을 다른 스레드에게 넘길 때까지 
//								기다리는 방식
//
//	JVM은 우선순위에 따른 선점형 스레드 스케줄링방식을 사용한다.
//	우선순위가 빠르다고 해서 먼저 수행되지 않는다.
//	작업량에 따라 결정됨, 우선순위는 참고일뿐.
//	
//	멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다.
//
//	*동기화 : 여러명이 접근하는 것을 방지하기 위한 방법
//	임계영역 : 멀티 스레드에 의해 공유자원이 참조될 수 있는 코드의 범위를 말한다.
//	멀티 스레드 프로그램에서 임계영역을 처리하는 경우 심각한 문제가 발생할 수 있다.
//	이러한 상황을 해결할 수 있는 방법이 동기화를 이용하는 것이다.
//	
//	LOCK : 공유 객체에 여러 스레드가 동시에 접근하지 못하도록 하기 위한 것으로
//	모든 객체가 힙 영역에 생성될 때 자동으로 만들어진다.
//	잘못 동기화 시키면 DAED LOCK(교착상태)에 걸림
//	
//
//	*동기화 방법
//	메소드 기반 : 될 수 있으면 사용x, 속도 떨어짐
//	-public synchronized void synchronizedEx() {
//		임계영역 코딩
//	}
//
//	
//	동기화 기준을 다양화 할 수 있다.
//	-public void normalMethod() {
//		공유객체가 객체 자신이면 this를 넣을 수 있다. : 동기화의 대상을 알리는 용도로 사용
//		메소드가 호출된 인스턴스 자신의 열쇠(synchronized)를 
//		대상으로 동기화를 진행하는 문장
//		synchonized(동기화 할 객체 또는 클래스명) {
//			임계영역 코딩
//		}
//	}
//
//	
//	*DEAD LOCK(교착상태) : 두개이상의 스레드가 만족하지 못하는 상태로 계속 기다릴 때 발생한다.


public class TestThread {

	public static void main(String[] args) {

		MyThread th = new MyThread();
		th.start(); // 스레드 호출(스레드 준비, 시작)

		Thread th2 = new Thread(new MyThread2());
		th2.start();
		System.out.println("프로그램 종료...");

	}

};

//	스레드 : 단일프로그램에서 OS(VM)에 의해 호출될 수 있는 메소드
//	주스레드 : main()메소드
//	다중스레드 환경에서는 모든 스레드가 종료해야 프로그램이 종료되며
//	메인은 시작점이지 종료점은 아니다.

//=========================================================================

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("i : " + i);

			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				e.getStackTrace();

			}
		}
		super.run();
	}
};

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int n = 1; n <= 20; n++) {
			System.out.println("n : " + n);

			try {
				Thread.sleep(500);

			} catch (Exception e) {
				e.getStackTrace();

			}
		}
	}

};