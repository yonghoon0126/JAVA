package mouse;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample extends JFrame {
	
	ListenerSample() {
		setTitle("Action 이벤트 리스터 작성");
		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Action");
		JButton btn1 = new JButton("문제");
		JButton btn2 = new JButton("풀이");

		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);

		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			
			
			@Override//
			public void mouseExited(MouseEvent e) {
				
				JButton btn = (JButton)e.getSource();
				btn.setBackground(Color.YELLOW);
				System.out.println(btn.toString());
				System.out.println(btn.getActionCommand());
				System.out.println(btn.getBackground());
			}
			
			@Override//
			public void mouseEntered(MouseEvent e) {

				JButton btn = (JButton)e.getSource();
				btn.setBackground(Color.RED);
				System.out.println(btn.getActionCommand());
				System.out.println(btn.getBackground());
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JButton btn = (JButton)e.getSource();
				btn.setToolTipText("나는 클릭했을 때");
				
			}
		});
		
		add(btn);
		add(btn1);
		add(btn2);

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ListenerSample();

	}

}

// Action -> 액션, 문제 --> 결과, 풀이 --> 과정
class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		System.out.println(e.toString());
		if (b.getText().equals("Action")) {
			b.setText("액션");
		} else if (b.getText().equals("문제")) {
			b.setText("결과");
			System.out.println(b.getActionCommand() + "...\n");
		} else if (b.getText().equals("풀이")) {
			b.setText("과정");
			System.out.println(b.getActionCommand() + "...\n");
		} else {
			b.setText("Action");
			System.out.println(b.getText());

		}
	}
	

}
