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
	String text[] = { "사과", "배", "체리" };

	// image에 imageIcon 삽입
	ImageIcon image[] = { 
			new ImageIcon("src/swingEx/apple.jpg"), 
			new ImageIcon("src/swingEx/pear.jpg"), 
			new ImageIcon("src/swingEx/cherry.jpg") };

	JLabel imageLabel = new JLabel();

	
	RadioButtonItemEventEx() {
		
		setTitle("라디오 버튼 Item Event 예제");
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

		// 레이블에 수평 가운데에 이미지 배치
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(250,200);
		setVisible(true);
	}

	
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

			// 선택이 없으면 변화없음
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			
			// 사과 선택하면 == 사과 사진 
			if (radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);

			// 배 선택하면 == 배 사진
			} else if (radio[1].isSelected()) {
				
				imageLabel.setIcon(image[1]);
			// 체리 선택하면 == 체리 사진
			}else {
				
				imageLabel.setIcon(image[2]);
			}

		}
	}

	
	
	public static void main(String[] args) {

		new RadioButtonItemEventEx();
		
	}

}
