package mouse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMoveMotionEx extends JFrame {

	JLabel la;

	MouseMoveMotionEx() {
		setTitle("Mouse 이벤트 예제");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		
//		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mousePressed(MouseEvent e) {	// 마우스 클릭했을 때 hello
	
				int x = e.getX();
				int y = e.getY();
				System.out.println("("+x+","+y+")");	// 클릭했을 때 좌표 출력
				la.setLocation(x, y);
			}
		});
		
		// 마우스 움직일 때 처리
		
		contentPane.addMouseMotionListener(new MouseAdapter() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				System.out.println("("+x+","+y+")");	// 클릭했을 때 좌표 출력
				la.setLocation(x, y);
				
				super.mouseMoved(e);
			}
		});
		
		

		la = new JLabel("hello");
		la.setFont(new Font("궁서",Font.ITALIC,50));
		la.setForeground(Color.WHITE);
		la.setOpaque(true);	// 완전 불투명하게 설정
		la.setBackground(Color.RED);
		
		la.setSize(200, 50);
		la.setLocation(30, 30);
		contentPane.add(la);
		

		setSize(800, 500);
		setVisible(true);

	};	// 내부 클래스

////		class MyMouseListener implements MouseListener {	// MouseListener 인터페이스
//		class MyMouseListener extends MouseAdapter {	// MouseAdapter 익명 클래스
//
//			
////		@Override
////		public void mouseClicked(MouseEvent e) {
////		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {	// 마우스 클릭했을 때 hello
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

		new MouseMoveMotionEx();

	}

}
