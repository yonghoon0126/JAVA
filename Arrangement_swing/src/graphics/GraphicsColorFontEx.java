package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsColorFontEx extends JFrame {

	Container contentPane;
	GraphicsColorFontEx() {
		setTitle("Color, Font 사용  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel , BorderLayout.CENTER);
		
		setSize(800, 800);
		setVisible(true);
	}


	class MyPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		
			g.setColor(Color.BLUE);
			g.drawString("I love Java~~", 30, 30);
			
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff));

			for (int i = 1; i <= 5; i++) {
				g.setFont(new Font("Jokeman", Font.ITALIC, i * 10));
				g.drawString("This much!!", 30, 60 + i * 60);
			}
			// 선 그리기
			g.setColor(Color.BLACK);
			g.drawLine(20, 20, 100, 100);	// (x시작, y시작, x끝, y끝)
			g.drawLine(100, 400, 400, 600);
			
			// 원 그리기
			g.setColor(Color.RED);
			g.drawLine(70, 70, 120, 120);	// (x시작, y시작, x끝, y끝)
			
			// 사각형 그리기
			g.setColor(Color.MAGENTA);
			g.drawLine(20, 20, 80, 80);	// (x시작, y시작, x끝, y끝)
			
			
			g.fillOval(20, 20, 80, 80);
			
			// 타원형
			g.setColor(Color.DARK_GRAY);
			g.fillRoundRect(100,100,120,80,40,60);
			
			// 원호
			g.setColor(Color.CYAN);
			g.fillArc(20, 100, 80, 80, 90, 270);	
			// (x좌표, y좌표, x좌표, y좌표, 시작각도, 끝각도)
			
			
			// 다각형
			int x[] = {80,40,80,120};
			int y[] = {40,120,200,120};
			g.drawPolygon(x,y,4);
			
			
		}
	}

	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}

}
