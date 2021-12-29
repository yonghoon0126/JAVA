package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	ContentPaneEx(){
		setTitle("ContentPane�� JFrame");	// �������� Ÿ��Ʋ �ޱ�
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ������ �����츦 ������ ���α׷� ����
	
		// ContentPane�� JFrame��ü�� ������ �� �ڵ����� �����ȴ�
		Container contentPane = getContentPane();	// contentpane�� �˾Ƴ���
		contentPane.setBackground(Color.orange);
		
		//contentPane.
//		setBackground(Color.orange); // this.setBackground(Color.ORANGE);
		// ����ȵ�

		// contentPane�� FlowLayout ��ġ������ �ޱ�
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350, 150);	// ������ ũ�� 300*150 ����
		setVisible(true);	// �������� ȭ�鿡 ���
	}

	public static void main(String[] args) {
		
		new ContentPaneEx();
	}

}
