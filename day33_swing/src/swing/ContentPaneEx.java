package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	ContentPaneEx(){
		setTitle("ContentPane과 JFrame");	// 프레임의 타이틀 달기
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 프레임 윈도우를 닫으면 프로그램 종료
	
		// ContentPane은 JFrame객체가 생성될 때 자동으로 생성된다
		Container contentPane = getContentPane();	// contentpane을 알아낸다
		contentPane.setBackground(Color.orange);
		
		//contentPane.
//		setBackground(Color.orange); // this.setBackground(Color.ORANGE);
		// 적용안됨

		// contentPane에 FlowLayout 배치관리자 달기
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350, 150);	// 프레임 크기 300*150 설정
		setVisible(true);	// 프레임을 화면에 출력
	}

	public static void main(String[] args) {
		
		new ContentPaneEx();
	}

}
