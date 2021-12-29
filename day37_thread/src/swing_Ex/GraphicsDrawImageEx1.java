package swing_Ex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame {
	Container contentPane;

	GraphicsDrawImageEx1() {

		setTitle("drawImage 사용 예제 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		setSize(300, 400);
		setVisible(true);
	}

//=============================================================================
	
	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("src/swing_Ex/image0.jpg");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, this);
		}
	}

//=============================================================================

	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}

}
