package checkBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

		Container contentPane;
		
		CheckBoxEx(){
		
			setTitle("체크박스 만들기 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			contentPane = getContentPane();
			contentPane.setLayout(new FlowLayout());
			
			// image 가져오기
			ImageIcon cherryIcon = new ImageIcon("src/swingEx/cherry.jpg");
			// 선택 상태를 표시하는 image
			ImageIcon selectedCherryIcon = 
					new ImageIcon("src/swingEx/selectedCherry.jpg");
			
			JCheckBox apple = new JCheckBox("사과");
			JCheckBox pear = new JCheckBox("배", true);
			JCheckBox cherry = new JCheckBox("체리", cherryIcon);
			
			// 이미지의 외곽선이 보이도록 설정
			cherry.setBorderPainted(true);	
			// 선택 상태를 표시하는 이미지 등록
			cherry.setSelectedIcon(selectedCherryIcon);
			
			
			apple.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand() + ", id = " + e.getID());
				}
			});
			
			pear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand() + ", id = " + e.getID());
				}
			});
			
			cherry.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand() + ", id = " + e.getID());
				}
			});
			
			contentPane.add(apple);
			contentPane.add(pear);
			contentPane.add(cherry);
			
			setSize(250,150);
			setVisible(true);
		}
		
		public static void main(String[] args) {

			new CheckBoxEx();
			
	}

}
