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

		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = 
				new ImageIcon("src/swingEx/cherry.jpg");
		ImageIcon selectedcherryIcon = 
				new ImageIcon("src/swingEx/selectedCherry.jpg");

		
//*****************************************************************************
		// 버튼 그룹 생성
		ButtonGroup g = new ButtonGroup();
		// Radio 버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		// 이미지 라디오 버튼
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
//*****************************************************************************

		
		cherry.setBorderPainted(true);
		// 선택 상태를 표시하는 이미지 등록
		cherry.setSelectedIcon(selectedcherryIcon);

		
		// 버튼 그룹 객체에 3개의 라디오 버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		
		// 컨텐트팬에 3개의 라디오 버튼 삽입
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
