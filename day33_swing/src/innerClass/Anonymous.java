package innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 4. Anonymous class

public class Anonymous extends JFrame {

	public static void main(String[] args) {

		// ������ ��ü ����
		Anonymous t = new Anonymous();

		// ������ ����
		t.setTitle("�͸� ���� Ŭ���� ����...");

		// ��ư ��ü ����
		JButton btn = new JButton("��ư�� �����ּ���.");

		// �����ӿ� ��ư ���̱�
		t.add(btn);

		// ������ ũ�� ����
		t.setSize(500,300); // ȭ�鿡 ����*���� ũ��
		// 1��ġ = 2.54cm(1��ġ �ȿ� ���� �������� ȭ���� ����)

		// ������ ȭ�鿡 x, y��ġ
		t.setLocation(100,100);	

		// ȭ�鿡 ���
		t.setVisible(true); 
		
		// ��ư�� Ŭ������ �� �̺�Ʈó�� �� ó����(�̺�Ʈ �ڵ鷯)����
		// �̺�Ʈ �߻���ų �ҽ�.�̺�Ʈ����(�̺�Ʈ ó����)
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// �̺�Ʈ�� �߻��� ��ư�� �ִ� ���ڸ� ����
				System.out.println(e);
				
				// ��ư�� ���� ��������
				String select = e.getActionCommand(); 

				if (select.equals("��ư�� �����ּ���."));
				System.out.println(select + "...");

				// �ý��� ���� == ���α׷� ���� 0 �Ǵ� �ٸ� ����
				// �ƹ��ų� ���� 0�� ���� ���
				System.exit(0);

			} // actionPerformed
		}); // ActionListener()
		
		t.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) { // â ����
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {	// â ������ Ŭ���� ��
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {	// â ������
				System.out.print("���� ���?");
//				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});	// WindowListener()
		
		
		

	}

}
