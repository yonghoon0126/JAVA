package button;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingAPIEx extends JFrame {

	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;

	SwingAPIEx() {

		setTitle("Swing ���� �޼ҵ� ����");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		b1 = new JButton("��ġ�� ũ�� ����");
		b1.addActionListener(new MyButtonListener());
		contentPane.add(b1);

		b2 = new JButton("��� ����");
		b2.setOpaque(true); // ���� ���� �����ϰ�
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("���ü", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		contentPane.add(b2);

		b3 = new JButton("�۵����� �ʴ� ��ư");
		b3.setEnabled(false); // ���� �Ұ�, Ŭ���ص� ���� ����
		b3.addActionListener(new MyButtonListener());
		contentPane.add(b3);

		b4 = new JButton("����� / ���̱�");
		b4.addActionListener(new MyButtonListener());
		contentPane.add(b4);

		setSize(250, 200);
		setVisible(true);
	}

	class MyButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			Object source = e.getSource();

			// ��ġ�� ũ�� ���� ��ư Ŭ�� ��
			if (source == b1) { 
				System.out.println("��ư�� ��ġ�� ũ��");
				System.out.println("��ġ = (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("ũ�� = (" + b1.getWidth() + "," + b1.getHeight() + ")");

//*******************************************************************************
				// �θ� �����̳��� �ּҸ� �˾Ƴ���. �θ�� ����Ʈ��
				JPanel c = (JPanel) b2.getParent();	
//*******************************************************************************
				System.out.println("����Ʈ���� ��ġ�� ũ��");
				System.out.println("��ġ = (" + c.getX() + "," + c.getY() + ")");
				System.out.println("ũ�� = (" + c.getWidth() + "," + c.getHeight() + ")");

			// ��� ���� ��ư ���� ��
			} else if (source == b2) {	
				System.out.println("��Ʈ = " + b2.getFont());
				System.out.println("���� = " + b2.getBackground());
				System.out.println("���ڻ� = " + b2.getForeground());
			
			// ����� / ���̱� Ŭ�� ��
			} else {	
				
				// �����
				if (b1.isVisible()) {	
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				
				// ���̱�
				} else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);

				}
			}

		}
	}

	public static void main(String[] args) {

		new SwingAPIEx();
	}

}
