package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {

	Container contentPane;

	String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

	String[] names = { "kitae", "jaemoon", "hyosoo", "namyun" };

	ComboBoxEx() {

		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JComboBox strCombo = new JComboBox(fruits);
		contentPane.add(strCombo);

		JComboBox nameCombo = new JComboBox();
		for (int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]); // �޺��ڽ��� ������ ����
		}

		contentPane.add(nameCombo);
		setSize(300, 300);
		setVisible(true);

//==============================================================================
		
		// �����ϸ� ��Ͽ��� �����
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = (String) strCombo.getSelectedItem();
				System.out.printf("������ %s %n", str);
				System.out.println("������ " + str);
				strCombo.removeItem(str);
			}
		});
		// �����ϸ� �ֿܼ� ��µ�
		nameCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(nameCombo.getSelectedItem());
				nameCombo.getSelectedIndex();
			}
		});
	}

	public static void main(String[] args) {

		new ComboBoxEx();
	}

}
