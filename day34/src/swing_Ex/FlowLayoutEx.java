package swing_Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	
	FlowLayoutEx(){	

		// 프레임의 타이틀 달기
		setTitle("FlowLayout Sample");	
	
		// 프레임 윈도우를 닫으면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		// contentPane()얻어오기 contentPane
		Container contentPane = getContentPane();
		
		// 프레임 색 변경 오렌지색 배경 설정
		contentPane.setBackground(Color.orange);
		
		// contentPane에 FlowLayout 배치 관리자 설정
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));	
		
		JButton j = new JButton("add");
		
		// 글꼴, 글자속성, 글자크기
		j.setFont(new Font("굴림",Font.BOLD,70));
		j.setBackground(Color.RED);
		j.setForeground(Color.GREEN);

		
		add(j);
		// add(new JButton("add"));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		setSize(300, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {

		new FlowLayoutEx();
		
	}

}
