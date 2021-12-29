package button;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {

	Container contentPane;

	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		// 보통 상태
		ImageIcon nomallcon = new ImageIcon("src/swingEx/normalIcon.gif");
		
		// Icon 위에 마우스 올려놓을 때
		ImageIcon rolloverIcon = new ImageIcon("src/swingEx/rolloverIcon.gif");

		// Icon을 눌렀을 때
		ImageIcon pressedIcon = new ImageIcon("src/swingEx/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", nomallcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);

		setSize(250, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ButtonImageEx();

	}
}
