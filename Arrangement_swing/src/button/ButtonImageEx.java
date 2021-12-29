package button;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame {

	Container contentPane;

	ButtonImageEx() {
		setTitle("��ư�� ������ �ޱ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		// ���� ����
		ImageIcon nomallcon = new ImageIcon("src/swingEx/normalIcon.gif");
		
		// Icon ���� ���콺 �÷����� ��
		ImageIcon rolloverIcon = new ImageIcon("src/swingEx/rolloverIcon.gif");

		// Icon�� ������ ��
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
