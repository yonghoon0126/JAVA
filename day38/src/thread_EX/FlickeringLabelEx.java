package thread_EX;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		
		super(text); // JLabel ������ ȣ��
		setOpaque(true); // ���� ������ �����ϵ��� ����

//		// ������ ��ü ����
//		Thread th = new Thread(this);
//		
//		// ������ ����
//		th.start();
	}

//===========================================================================================

	public void run() {	// thread ���� 

		int n = 0;
		
		while (true) {	// ���� ����
			
			// n�� 0�� 1�� ������ ����
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);

			if (n == 0)
				n = 1;
			else
				n = 0;
			
			try {
				Thread.sleep(500); // 0.5�� ���� ���� �ܴ�
			
			} catch (InterruptedException e) {
				return;	// ���ܰ� �߻��ϸ� ������ ����

			}
		}
	}
}

//===========================================================================================

public class FlickeringLabelEx extends JFrame {	// label ����� class
	public FlickeringLabelEx() {
		
		setTitle("FlickeringEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// �����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����");

		// �������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");

		// �����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����");
		
//===========================================================================================
		
		// ������ ��ü ����
		Thread th = new Thread(fLabel);	// new Runnable
		Thread th2 = new Thread(fLabel2);	// new Runnable
		
		// ������ ����
		th.start();
		th2.start();
		
//===========================================================================================

		// ����Ʈ�濡 ���̺� ����
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {

		new FlickeringLabelEx();
	}

}
