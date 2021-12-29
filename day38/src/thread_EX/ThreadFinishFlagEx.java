package thread_EX;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class RandomThread extends Thread {
	Container contentPane;
	boolean flag=false; // �������� ���� ����� ǥ���ϴ� �÷���.
							// true : ���� ����
	
	public RandomThread(Container contentPane) { 
		this.contentPane = contentPane;
	}
	
	void finish() { // ������ ���� ����� flag�� ǥ��
		flag = true;
	} 
	
	public void run() {
		
		while(true) { 
			
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			
			JLabel label = new JLabel("Java"); //�� ���̺� ����
			label.setSize(80, 30); 
			label.setLocation(x, y);			
			
			contentPane.add(label); 
			contentPane.repaint(); 
			
			try {
				Thread.sleep(300); // 0.3�� ���� ���� �ܴ�.
				
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish"); 
					label.setSize(80, 30); 
					label.setLocation(100, 100); 
					label.setForeground(Color.RED);
					
					contentPane.add(label); 
					contentPane.repaint(); 
					return; // ������ ����
				}
			}catch(InterruptedException e) {	
				return;	
			}
		}
	}
}


public class ThreadFinishFlagEx extends JFrame {
	
	RandomThread th; // ������ ���۷���
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addMouseListener(new MouseAdapter() {	// ���콺 ������ ���
			public void mousePressed(MouseEvent e) {
				th.finish(); // RandomThread ������ ���� ���
			}
		});
		
		setSize(300,200);
		setVisible(true);

		th = new RandomThread(c); // ������ ����		
		th.start(); // ������ ���۽�Ŵ
	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}
