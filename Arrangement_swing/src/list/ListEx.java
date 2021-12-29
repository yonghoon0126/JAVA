package list;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {

	Container contentPane;

	String fruits[] = { "apple", "banana", "kiwi", "mango", "pear", 
			"peach", "berry", "strawberry", "blackberry" 
	};

	ImageIcon images[] = { new ImageIcon("src/swingEx/icon1.png"), 
			new ImageIcon("src/swingEx/icon2.png"), 
			new ImageIcon("src/swingEx/icon3.png"), 
			new ImageIcon("src/swingEx/icon4.png") 
	};

	//=========================================================================

	ListEx(){
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		// 1��° List
		JList strList = new JList(fruits);	// ����Ʈ ������Ʈ ����
		contentPane.add(strList);

		// 2��° List
		JList imageList = new JList(images);	// ����Ʈ ������Ʈ ����
		//		imageList.setListData(images);
		contentPane.add(imageList);

		// 3��° List
		JList scrollList = new JList(fruits);	// ����Ʈ ������Ʈ ����
		contentPane.add(new JScrollPane(scrollList));	// ����Ʈ�� ��ũ�� ����Ʈ�� ����

		setSize(300,300);
		setVisible(true);

		//=========================================================================

		// ����Ʈ ��� Ŭ���ϸ� ���
		strList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("�ε��� : " + strList.getSelectedIndex());
				System.out.println("�� : " + fruits[strList.getSelectedIndex()]);
			}

		});
		
		// �̹��� Ŭ���ϸ� ���
		imageList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("�ε��� : " + imageList.getSelectedIndex());
				System.out.println("�� : " + images[imageList.getSelectedIndex()]);
			}
		});
	}

	//=========================================================================

	public static void main(String[] args) {

		new ListEx();
	}

}
