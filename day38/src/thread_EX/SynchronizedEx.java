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

//	���� �������� �������� �ùķ��̼��ϴ� Ŭ����.
//	�� WorkerThread �����忡 ���� ���� ���ٵ�
class SyncObject {
	int sum = 0;	// �������� ��

	void add() {
	synchronized (this) {
	//void add() synchronized{

		int n = sum;	// �������� ��

		// Thread.currentThread().yield();
		// �������� ���� �ӵ��� �ʹ� ������ ������
		// �浹 �߻��� ���� �ʴ�. �׷��� ���Ƿ� add()�޼ҵ忡
		// ���� �浹�� ���� �߻���Ű�� ���� �ٸ� �����忡�� �纸�ϵ��� �Ͽ���.
		Thread.currentThread();
		Thread.yield();
		
		n += 10;	// 10�� ����
		sum = n;	// ������ ���� �����տ� ����.
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}
	int getSum() {
		return sum;
	}
}; // SyncObject

//====================================================================================================

// �л��� �ùķ��̼� �ϴ� ������ Ŭ����
class WorkerThread extends Thread {
	SyncObject sObj;	// �������� �ּ�
	
	WorkerThread(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}

//====================================================================================================
	
	// �������� �ݺ������� 10�� �����Ͽ� ī�����Ѵ�.
	public void run() {
		
		int i = 0;
		
		while (i < 10) {
			sObj.add();
			i++;
		}
	}
}
