package text;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	Container contentPane;

	TextFieldEx() {
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JTextField jt1 = new JTextField(10);
		JTextField jt2 = new JTextField("��ǻ�� ���а�(����)");
		JTextField jt3 = new JTextField("�����...", 20);
		
		contentPane.add(new JLabel("�̸� : "));
		contentPane.add(jt1); // â ũ�Ⱑ 10�� �ؽ�Ʈ �ʵ�

		contentPane.add(new JLabel("�а� : "));
		contentPane.add(jt2); // �ؽ�Ʈ �ʵ�

		contentPane.add(new JLabel("�ּ� : "));
		contentPane.add(jt3); // â ũ�Ⱑ 20�� �ؽ�Ʈ �ʵ�

		// �Է� / ��� ��ư �����ϰ�, �ް�, �̺�Ʈ �߻��ϱ�
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("Ȯ��");
		JButton jb2 = new JButton("���");
		jp.add(jb1);
		jp.add(jb2);
		contentPane.add(jp);
		
		add(jb1);
		add(jb2);

		setSize(350, 200);
		setVisible(true);
		
//=============================================================================

		// Ȯ�� / ��� ������ ��
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�̸� : " + jt1.getText());
				System.out.println("�а� : " + jt2.getText());
				System.out.println("�ּ� : " + jt3.getText());
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
			}
		});
		
//=============================================================================
		
		// TextField�� text�ֱ�
		jt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("�̸� : " + jt1.getText());
				}
			});
		jt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�а� : " + jt2.getText());
			}
		});
		jt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ּ� : " + jt3.getText());
			}
		});
	}

	public static void main(String[] args) {

		new TextFieldEx();
	}

}
