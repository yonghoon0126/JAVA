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
		
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		// textLabel 설정
		JLabel textLabel = new JLabel("사랑합니다.");
		
		// imageIcon 설정
		ImageIcon beauty = new ImageIcon("src/swingEx/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		// imageIcon + label 설정
		ImageIcon normallcon = new ImageIcon("src/swingEx/normalIcon.gif");
		JLabel label = 
				new JLabel("보고 싶으면 전화하세요.", normallcon, SwingConstants.CENTER);

		
		// textLabel 붙이기
		contentPane.add(textLabel);	
		// imageLabel 붙이기
		contentPane.add(imageLabel);
		// image + label 붙이기
		contentPane.add(label);			

		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {

		new LabelEx();
	}

}
