package thisEx06;

public class Car223 {

	// �ʵ�
	int gas;
	
	// ������
	Car223() {
		
	}
	
	// �޼ҵ�
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return;
			}
		}
	}
}
