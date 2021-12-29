package swing_Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {

	Container contentPane;

	paintJPanelEx(){
		setTitle("JPanel paintComponent ����");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(800,800);
		setVisible(true);
	}
	
//=========================================================================

	class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(10, 10, 50, 50);	// �簢�� ä���
			
			g.setColor(Color.yellow);
			g.fillRect(50, 50, 50, 50);	// �簢�� ä���
			
			g.setColor(Color.green);
			g.drawRect(90, 90, 50, 50);	// �簢�� �׸���
			
			g.setColor(Color.red);
			g.drawString("�ڹٴ� ��մ�.~~",160,160);	// �۾� �׸���
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ!!!!",200,200);
			
		}
	}

	public static void main(String[] args) {

		new paintJPanelEx();

	}

}
