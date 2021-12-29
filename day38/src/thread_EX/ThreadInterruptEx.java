package thread_EX;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerR implements Runnable {
	JLabel timerLabel; 
	
	public TimerR(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n=0; 
		while(true) { 
			timerLabel.setText(Integer.toString(n)); 
			n++; 
			try {
				Thread.sleep(1000); // 1�� ���� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame {
	Thread th;

	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerR runnable = new TimerR(timerLabel);
		th = new Thread(runnable); // ������ ����
		c.add(timerLabel);

		// ��ư�� �����ϰ� Action ������ ���
		JButton btn =new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // Ÿ�̸� ������ ���� ����
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); // ��ư ��Ȱ��ȭ
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		
		th.start(); // ������ ���۽�Ŵ
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	} 
}
