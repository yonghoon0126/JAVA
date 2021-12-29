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
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		// 1번째 List
		JList strList = new JList(fruits);	// 리스트 컴포넌트 생성
		contentPane.add(strList);

		// 2번째 List
		JList imageList = new JList(images);	// 리스트 컴포넌트 생성
		//		imageList.setListData(images);
		contentPane.add(imageList);

		// 3번째 List
		JList scrollList = new JList(fruits);	// 리스트 컴포넌트 생성
		contentPane.add(new JScrollPane(scrollList));	// 리스트를 스크롤 리스트에 삽입

		setSize(300,300);
		setVisible(true);

		//=========================================================================

		// 리스트 목록 클릭하면 출력
		strList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("인덱스 : " + strList.getSelectedIndex());
				System.out.println("값 : " + fruits[strList.getSelectedIndex()]);
			}

		});
		
		// 이미지 클릭하면 출력
		imageList.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				System.out.println("인덱스 : " + imageList.getSelectedIndex());
				System.out.println("값 : " + images[imageList.getSelectedIndex()]);
			}
		});
	}

	//=========================================================================

	public static void main(String[] args) {

		new ListEx();
	}

}
