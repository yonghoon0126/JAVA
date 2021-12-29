package thread_EX;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {

	JLabel timerLabel; // Ÿ�̸� ���� ��µ� ���̺�

	public TimerRunnable(JLabel timerLabel) { // ������
		this.timerLabel = timerLabel; // ���̺� ������Ʈ�� �޾Ƽ� ���
	}

	// run()�� �����ϸ� ������ ����
	public void run() {
		int n = 0; // Ÿ�̸� ī��Ʈ ��

		while (true) { // ���� ����

			// Ÿ�̸� ���� ���̺� ���
			timerLabel.setText(Integer.toString(n));
			n++; // ī��Ʈ ����

			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			} catch (InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}

	}

}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {

		setTitle("ThreadTimerEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		// Ÿ�̸� ������� ����� ��ü ����
		// Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ� �����Ѵ�
		Thread th = new Thread(runnable);

		c.add(timerLabel); // ���̺��� ����Ʈ�ҿ� ����

		setSize(300, 150);
		setVisible(true);

		th.start(); // Ÿ�̸� �������� ������ ���۽�Ų��
	}

	public static void main(String[] args) {

		new RunnableTimerEx();
	}

}
