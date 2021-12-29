package swing_Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {

	Container contentPane;

	paintJPanelEx(){
		setTitle("JPanel paintComponent 에제");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(800,800);
		setVisible(true);
	}
	
//=========================================================================

	class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(10, 10, 50, 50);	// 사각형 채우기
			
			g.setColor(Color.yellow);
			g.fillRect(50, 50, 50, 50);	// 사각형 채우기
			
			g.setColor(Color.green);
			g.drawRect(90, 90, 50, 50);	// 사각형 그리기
			
			g.setColor(Color.red);
			g.drawString("자바는 재밌다.~~",160,160);	// 글씨 그리기
			g.drawString("얼마나? 하늘만큼 땅만큼!!!!",200,200);
			
		}
	}

	public static void main(String[] args) {

		new paintJPanelEx();

	}

}
