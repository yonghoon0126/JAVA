package checkBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	Container contentPane;

	JCheckBox fruits[] = new JCheckBox[3];
	String names[] = { "���", "��", "ü��" };
	JLabel sumLabel;	// ��� ���� ����� ���̺�
	int sum = 0;	// ������ ��

	CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));

		// 3���� üũ�ڽ� ������Ʈ�� �����ϰ� ����Ʈ�ҿ� ����, Item ������ ���
		for (int i = 0; i < fruits.length; i++) {	// fruits.length=3
			fruits[i] = new JCheckBox(names[i]);	// �迭 names[]�� ���ڿ��� üũ�ڽ�
			fruits[i].setBorderPainted(true);	// üũ�ڽ��� �ܰ����� ���̵��� ����
			contentPane.add(fruits[i]);	// üũ�ڽ� ������Ʈ�� ����Ʈ�ҿ� ����
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("���� 0 �� �Դϴ�.");
		contentPane.add(sumLabel);

		setSize(250, 200);
		setVisible(true);
	}

	// Item ������ ����
	class MyItemListener implements ItemListener {
		
		// üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged()�� ȣ���
		public void itemStateChanged(ItemEvent e) {

			int selected = 1;	// 1�̸� ����, -1�̸� ���� ����
			System.out.println(e.getStateChange() + "...");
			
			if (e.getStateChange() == ItemEvent.SELECTED) {
				selected = 1;	// ���� ����
			}else {
				selected = -1;	// ���� ���� ����
			}
			System.out.println("������..." + e.getItem());
			
			
			// � üũ �ڽ����� �Ǻ�
			if (e.getItem() == fruits[0]) {
				sum = sum + selected * 100;	// ���
			System.out.println(e.getItem());
			
			}else if (e.getItem() == fruits[1]) {
				sum = sum + selected * 500;	// ��
			
			}else {
				sum = sum + selected * 20000;	// ü��
			}
			sumLabel.setText("���� " + sum + "�� �Դϴ�.");
		}
	}
	
	
	
	public static void main(String[] args) {

		new CheckBoxItemEventEx();
	}

}
