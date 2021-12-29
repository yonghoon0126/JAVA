package text;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {

	Container contentPane;

	TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ����Ʈ�ҿ� MyCenterPanel�� �� JPanel�� �����Ѵ�
		contentPane = getContentPane();

		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

//============================================================================

	// �ؽ�Ʈ �ʵ�, ��ư, �ؽ�Ʈ���� ������Ʈ�� ������ �г�
	class MyCenterPanel extends JPanel {

		JTextField tf;
		JButton btn, btn2;
		JTextArea ta;

		MyCenterPanel() {
			tf = new JTextField(20);	// �ؽ�Ʈ �ʵ� ����
			btn = new JButton("�߰�");	// �߰� ��ư ����
			btn2 = new JButton("�����");	// ����� ��ư ����

//============================================================================
			
			// �߰� ��ư�� Action �����ʸ� ����Ѵ�
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");	// �Է� �ؽ�Ʈ ���� �߰�
				}
			});
			
			// ����� ��ư�� Action �����ʸ� ����Ѵ�
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText("");	// �ؽ�Ʈ �ʵ� ���� �����
					ta.setText("");	// �ؽ�Ʈ ���� ���� �����
				}
			});

			// �ؽ�Ʈ ����
			ta = new JTextArea("�Է��ϼ���.", 7, 20);	
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� Ŭ���ϼ���."));

			
			add(tf);	// �ؽ�Ʈ �ʵ� ����
			add(btn);	// �߰� ��ư ����
			add(btn2);	// ����� ��ư ����
			add(new JScrollPane(ta));	// ��ũ�ѹ� ����

		}
	}

	public static void main(String[] args) {

		new TextAreaEx();
	}

}
