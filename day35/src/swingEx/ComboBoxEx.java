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

		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JComboBox strCombo = new JComboBox(fruits);
		contentPane.add(strCombo);

		JComboBox nameCombo = new JComboBox();
		for (int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]); // 콤보박스에 아이템 삽입
		}

		contentPane.add(nameCombo);
		setSize(300, 300);
		setVisible(true);

//==============================================================================
		
		// 선택하면 목록에서 사라짐
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = (String) strCombo.getSelectedItem();
				System.out.printf("삭제전 %s %n", str);
				System.out.println("삭제전 " + str);
				strCombo.removeItem(str);
			}
		});
		// 선택하면 콘솔에 출력됨
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
