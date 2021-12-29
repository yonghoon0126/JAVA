package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	Container contentPane;

	LabelEx() {
		
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		// textLabel ����
		JLabel textLabel = new JLabel("����մϴ�.");
		
		// imageIcon ����
		ImageIcon beauty = new ImageIcon("src/swingEx/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		// imageIcon + label ����
		ImageIcon normallcon = new ImageIcon("src/swingEx/normalIcon.gif");
		JLabel label = 
				new JLabel("���� ������ ��ȭ�ϼ���.", normallcon, SwingConstants.CENTER);

		
		// textLabel ���̱�
		contentPane.add(textLabel);	
		// imageLabel ���̱�
		contentPane.add(imageLabel);
		// image + label ���̱�
		contentPane.add(label);			

		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {

		new LabelEx();
	}

}
