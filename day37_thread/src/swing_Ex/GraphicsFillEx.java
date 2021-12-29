package swing_Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsFillEx extends JFrame {
	Container contentPane;

	GraphicsFillEx() {

		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(100, 350);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			// 사각형
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);

			// 원형
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);

			// 둥근 사각형
			g.setColor(Color.GREEN);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);

			// 원호
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 0, 270);

			// 다각형
			g.setColor(Color.ORANGE);
			int x[] = { 30, 10, 30, 60 };
			int y[] = { 250, 275, 300, 275 };
			g.fillPolygon(x, y, 4);
		}
	}

	public static void main(String[] args) {
		new GraphicsFillEx();
	}

}
