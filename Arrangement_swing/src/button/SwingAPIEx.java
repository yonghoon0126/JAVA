package button;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingAPIEx extends JFrame {

	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;

	SwingAPIEx() {

		setTitle("Swing 공통 메소드 예제");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);

		b2 = new JButton("모양 정보");
		b2.setOpaque(true); // 배경색 변경 가능하게
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("고딕체", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);

		b3 = new JButton("작동하지 않는 버튼");
		b3.setEnabled(false); // 수정 불가, 클릭해도 반응 없음
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);

		b4 = new JButton("숨기기 / 보이기");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);

		setSize(250, 200);
		setVisible(true);
	}

	class MyButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			Object source = e.getSource();

			// 위치와 크기 정보 버튼 클릭 시
			if (source == b1) { 
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치 = (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("크기 = (" + b1.getWidth() + "," + b1.getHeight() + ")");

//*******************************************************************************
				// 부모 컨테이너의 주소를 알아낸다. 부모는 컨텐트팬
				JPanel c = (JPanel) b2.getParent();	
//*******************************************************************************
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치 = (" + c.getX() + "," + c.getY() + ")");
				System.out.println("크기 = (" + c.getWidth() + "," + c.getHeight() + ")");

			// 모양 정보 버튼 선택 시
			} else if (source == b2) {	
				System.out.println("폰트 = " + b2.getFont());
				System.out.println("배경색 = " + b2.getBackground());
				System.out.println("글자색 = " + b2.getForeground());
			
			// 숨기기 / 보이기 클릭 시
			} else {	
				
				// 숨기기
				if (b1.isVisible()) {	
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				
				// 보이기
				} else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);

				}
			}

		}
	}

	public static void main(String[] args) {

		new SwingAPIEx();
	}

}
