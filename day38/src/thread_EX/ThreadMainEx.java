package thread_EX;

public class ThreadMainEx {

	public static void main(String[] args) {

		long id = Thread.currentThread().getId();	// main
		String name = Thread.currentThread().getName();	// id
		int priority = Thread.currentThread().getPriority();	// 우선순위
		Thread.State s = Thread.currentThread().getState();	// 상태

		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);

	}

}
