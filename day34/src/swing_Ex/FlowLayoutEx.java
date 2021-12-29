package swing_Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	
	FlowLayoutEx(){	

		// �������� Ÿ��Ʋ �ޱ�
		setTitle("FlowLayout Sample");	
	
		// ������ �����츦 ������ ���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		// contentPane()������ contentPane
		Container contentPane = getContentPane();
		
		// ������ �� ���� �������� ��� ����
		contentPane.setBackground(Color.orange);
		
		// contentPane�� FlowLayout ��ġ ������ ����
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));	
		
		JButton j = new JButton("add");
		
		// �۲�, ���ڼӼ�, ����ũ��
		j.setFont(new Font("����",Font.BOLD,70));
		j.setBackground(Color.RED);
		j.setForeground(Color.GREEN);

		
		add(j);
		// add(new JButton("add"));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		setSize(300, 250);
		setVisible(true);
		
	}
	public static void main(String[] args) {

		new FlowLayoutEx();
		
	}

}
