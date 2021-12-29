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
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	// �޴��ٿ� File �޴��� �����ϰ� File �޴��� 4���� �޴� �������� �����Ѵ�.
	void createMenu() {
		JMenuBar mb = new JMenuBar(); // �޴��� ����
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

	// Action �����ʷμ�, �޴��������� ���õǾ��� �� ó���Ѵ�.
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) 	// Color �޴� ������ ���õ� ���
				label.setForeground(Color.BLUE);
			else if(cmd.equals("Font")) 	// Font �޴� ������ ���õ� ���
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if(cmd.equals("Top")) 	// Top �޴� ������ ���õ� ���
				label.setVerticalAlignment(SwingConstants.TOP);
			else // Bottom �޴� ������ ���õ� ���
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}


	public static void main(String[] args) {
		new MenuActionEventEx();
	}

}
