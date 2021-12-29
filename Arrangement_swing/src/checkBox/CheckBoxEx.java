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
		
			setTitle("üũ�ڽ� ����� ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			contentPane = getContentPane();
			contentPane.setLayout(new FlowLayout());
			
			// image ��������
			ImageIcon cherryIcon = new ImageIcon("src/swingEx/cherry.jpg");
			// ���� ���¸� ǥ���ϴ� image
			ImageIcon selectedCherryIcon = 
					new ImageIcon("src/swingEx/selectedCherry.jpg");
			
			JCheckBox apple = new JCheckBox("���");
			JCheckBox pear = new JCheckBox("��", true);
			JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
			
			// �̹����� �ܰ����� ���̵��� ����
			cherry.setBorderPainted(true);	
			// ���� ���¸� ǥ���ϴ� �̹��� ���
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
