package swing_Ex;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	GridLayoutEx() {
		setTitle("GridLayout Sample");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5, 2);	// 4*2 Layout����
		
		grid.setVgap(5);	// ���� ���� ����
		grid.setHgap(5);	// �¿� ���� ����
		setLayout(grid);

		JTextField jt1 = new JTextField("");
		JTextField jt2 = new JTextField("");
		JTextField jt3 = new JTextField("");
		JTextField jt4 = new JTextField("");

		jt1.setBackground(Color.yellow);
		jt2.setBackground(Color.yellow);
		jt3.setBackground(Color.yellow);
		jt4.setBackground(Color.yellow);

		JButton jb1 = new JButton("Ȯ��");
		JButton jb2 = new JButton("���");
		
		JLabel jl1 = new JLabel("�̸�");
		jl1.setOpaque(true);	// �������ϰ� �� �����ϱ� ���� ��
		jl1.setBackground(Color.cyan);	// �� ����x
		jt1.setText("ȫ�浿");
		add(jl1);
		add(jt1);
		
		add(new JLabel("�й�"));
		add(jt2);

		add(new JLabel("�а�"));
		add(jt3);

		add(new JLabel("����"));
		add(jt4);

		// ��ư ���̱�
		add(jb1);
		add(jb2);
		
		// Ȯ�� ��ư ������ �� 
		// �̺�Ʈ ó�� : �ҽ�.���(add***Listener(ó���� : new Ŭ������(){} );
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("�̸� : " + jt1.getText());
				System.out.println("�й� : " + jt2.getText());
				System.out.println("�а� : " + jt3.getText());
				System.out.println("���� : " + jt4.getText());
			}
		});
		
		
		// ��� ��ư ������ ��
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				
			}
		});
			
				
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new GridLayoutEx();
	}

}
