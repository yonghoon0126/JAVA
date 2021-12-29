package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {

	Container contentPane;

	RadioButtonEx() {

		setTitle("���� ��ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = 
				new ImageIcon("src/swingEx/cherry.jpg");
		ImageIcon selectedcherryIcon = 
				new ImageIcon("src/swingEx/selectedCherry.jpg");

		
//*****************************************************************************
		// ��ư �׷� ����
		ButtonGroup g = new ButtonGroup();
		// Radio ��ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		// �̹��� ���� ��ư
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
//*****************************************************************************

		
		cherry.setBorderPainted(true);
		// ���� ���¸� ǥ���ϴ� �̹��� ���
		cherry.setSelectedIcon(selectedcherryIcon);

		
		// ��ư �׷� ��ü�� 3���� ���� ��ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		
		// ����Ʈ�ҿ� 3���� ���� ��ư ����
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);

		
		apple.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(apple.getActionCommand());
			}
		});
		
		pear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(pear.getActionCommand());
			}
		});
		
		cherry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cherry.getActionCommand());
			}
		});

		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {

		new RadioButtonEx();
	}

}
