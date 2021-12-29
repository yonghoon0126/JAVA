package keyboard;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	public class FlyingTextEx extends JFrame {

		JPanel contentPane = new JPanel();
		JLabel la = new JLabel("HELLO");
		final int FLYING_UNIT = 10;

		FlyingTextEx() {
			setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			// �гο� �̺�Ʈ �߻�
			contentPane.addKeyListener(new MyKeyListener());
			
			la.setFont(new Font("���ü",Font.BOLD, la.getFont().getSize()+20));
			la.setLocation(50, 50);
			la.setSize(200, 30);
			contentPane.add(la);
			
			setSize(300, 300);
			setVisible(true);
			contentPane.requestFocus();
		}

		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				switch (keyCode) {
				
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
					System.out.println(la.getX()+","+la.getY());
					break;
				
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
					System.out.println(la.getX()+","+la.getY());
					break;
				
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - FLYING_UNIT, la.getY());
					System.out.println(la.getX()+","+la.getY());
					break;
				
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + FLYING_UNIT, la.getY());
					System.out.println(la.getX()+","+la.getY());
					break;
				}
			}
		}

		public static void main(String [] args) {
			new FlyingTextEx();
		}
	}
