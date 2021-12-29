package swing_Ex;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

	MenuEx() {
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();	// �޴��� �����Ͽ� �����ӿ� ����
		setSize(250, 200);
		setVisible(true);

	}

	// �޴��� ����� �����ӿ� �����Ѵ�
	void createMenu() {
		
		JMenuBar mb = new JMenuBar();	// �޴��� ����
		JMenu fileMenu = new JMenu("File");	// File �޴� ����
		JMenu editMenu = new JMenu("Edit");	// Edit �޴��� ���̱�


		// File �޴��� �޴������� ���� ����
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();	// �и��� ����
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("SaveAs"));

		// Edit �޴��� �޴������� ���� ����
		editMenu.add(new JMenuItem("Copy"));
		editMenu.add(new JMenuItem("Attatch"));

		
		// �޴��ٿ� �޴� ����
		mb.add(fileMenu);	// File �޴� ����
		mb.add(editMenu);	// Edit �޴� ���� ����
		
		mb.add(new JMenu("Source"));	// Source �޴� ���� ����
		mb.add(new JMenu("Project"));	// Project �޴� ���� ����
		mb.add(new JMenu("Run"));		// Run �޴� ���� ����
		this.setJMenuBar(mb);			// �޴��ٿ� �޴� ����
	
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
