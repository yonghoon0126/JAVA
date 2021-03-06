package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame {

	Container contentPane;

	String fruits[] = { "apple", "banana", "kiwi", "mango" };

	ImageIcon images[] = { // 이미지 객체 배열
			new ImageIcon("src/swingEx/apple.jpg"), 
			new ImageIcon("src/swingEx/banana.jpg"), 
			new ImageIcon("src/swingEx/kiwi.jpg"), 
			new ImageIcon("src/swingEx/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]);

//========================================================================

	ComboActionEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

//========================================================================

		JComboBox strCombo = new JComboBox(fruits);	// 콤보 박스 생성
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300, 300);
		setVisible(true);

		// Action 리스너 등록
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox cb = (JComboBox) e.getSource();	// 과일 이름 출력
				
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);	// 과일이랑 맞는 사진 출력
			}
		});
	}

	public static void main(String[] args) {

		new ComboActionEx();

	}

}
