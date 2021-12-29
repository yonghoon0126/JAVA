package swingEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame {

	Container contentPane;

	JRadioButton radio[] = new JRadioButton[3];
	String text[] = { "���", "��", "ü��" };

	// image�� imageIcon ����
	ImageIcon image[] = { 
			new ImageIcon("src/swingEx/apple.jpg"), 
			new ImageIcon("src/swingEx/pear.jpg"), 
			new ImageIcon("src/swingEx/cherry.jpg") };

	JLabel imageLabel = new JLabel();

	
	RadioButtonItemEventEx() {
		
		setTitle("���� ��ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);


		ButtonGroup g = new ButtonGroup();

		for(int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}

		radio[2].setSelected(true);
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);

		// ���̺� ���� ����� �̹��� ��ġ
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(250,200);
		setVisible(true);
	}

	
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

			// ������ ������ ��ȭ����
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			
			// ��� �����ϸ� == ��� ���� 
			if (radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);

			// �� �����ϸ� == �� ����
			} else if (radio[1].isSelected()) {
				
				imageLabel.setIcon(image[1]);
			// ü�� �����ϸ� == ü�� ����
			}else {
				
				imageLabel.setIcon(image[2]);
			}

		}
	}

	
	
	public static void main(String[] args) {

		new RadioButtonItemEventEx();
		
	}

}
