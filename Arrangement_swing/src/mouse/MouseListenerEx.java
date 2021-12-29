package mouse;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame {

	JLabel la;

	MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		
//		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mousePressed(MouseEvent e) {	// ���콺 Ŭ������ �� hello
	
				int x = e.getX();
				int y = e.getY();
				System.out.println("("+x+","+y+")");	// Ŭ������ �� ��ǥ ���
				la.setLocation(x, y);
			}
		});

		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);

		setSize(200, 200);
		setVisible(true);

	};	// ���� Ŭ����

////		class MyMouseListener implements MouseListener {	// MouseListener �������̽�
//		class MyMouseListener extends MouseAdapter {	// MouseAdapter �͸� Ŭ����
//
//			
////		@Override
////		public void mouseClicked(MouseEvent e) {
////		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {	// ���콺 Ŭ������ �� hello
//
//			int x = e.getX();
//			int y = e.getY();
//			System.out.println("("+x+","+y+")");
//			la.setLocation(x, y);
//		}
//
////		@Override
////		public void mouseReleased(MouseEvent e) {}
////		@Override
////		public void mouseEntered(MouseEvent e) {}
////		@Override
////		public void mouseExited(MouseEvent e) {}
//
//	}

	public static void main(String[] args) {

		new MouseListenerEx();

	}

}
