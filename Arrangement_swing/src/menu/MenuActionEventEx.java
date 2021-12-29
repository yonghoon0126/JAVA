package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuActionEventEx extends JFrame {

	Container contentPane;
	JLabel label = new JLabel("Hello");

	MenuActionEventEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	// 메뉴바와 File 메뉴를 생성하고 File 메뉴에 4개의 메뉴 아이템을 삽입한다.
	void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenuItem menuItem[] = new JMenuItem[4];
		String itemTitle[] = { "Color", "Font", "Top", "Bottom" };

		JMenu fileMenu = new JMenu("Text");
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			fileMenu.add(menuItem[i]);
		}
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}

	// Action 리스너로서, 메뉴아이템이 선택되었을 때 처리한다.
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) 	// Color 메뉴 아이템 선택된 경우
				label.setForeground(Color.BLUE);
			else if(cmd.equals("Font")) 	// Font 메뉴 아이템 선택된 경우
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if(cmd.equals("Top")) 	// Top 메뉴 아이템 선택된 경우
				label.setVerticalAlignment(SwingConstants.TOP);
			else // Bottom 메뉴 아이템 선택된 경우
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}


	public static void main(String[] args) {
		new MenuActionEventEx();
	}

}
