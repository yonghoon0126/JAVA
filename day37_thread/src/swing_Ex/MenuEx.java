package swing_Ex;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {

	MenuEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();	// 메뉴를 생성하여 프레임에 삽입
		setSize(250, 200);
		setVisible(true);

	}

	// 메뉴를 만들어 프레임에 삽입한다
	void createMenu() {
		
		JMenuBar mb = new JMenuBar();	// 메뉴바 생성
		JMenu fileMenu = new JMenu("File");	// File 메뉴 생성
		JMenu editMenu = new JMenu("Edit");	// Edit 메뉴에 붙이기


		// File 메뉴에 메뉴아이템 생성 삽입
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();	// 분리선 삽입
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("SaveAs"));

		// Edit 메뉴에 메뉴아이템 생성 삽입
		editMenu.add(new JMenuItem("Copy"));
		editMenu.add(new JMenuItem("Attatch"));

		
		// 메뉴바에 메뉴 삽입
		mb.add(fileMenu);	// File 메뉴 삽입
		mb.add(editMenu);	// Edit 메뉴 생성 삽입
		
		mb.add(new JMenu("Source"));	// Source 메뉴 생성 삽입
		mb.add(new JMenu("Project"));	// Project 메뉴 생성 삽입
		mb.add(new JMenu("Run"));		// Run 메뉴 생성 삽입
		this.setJMenuBar(mb);			// 메뉴바에 메뉴 저장
	
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
