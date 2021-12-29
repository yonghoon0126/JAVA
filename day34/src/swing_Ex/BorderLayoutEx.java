package swing_Ex;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	
	BorderLayoutEx() {
		setTitle("BoarderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// contentPane에 BorderLayout 배치관리자 설정
		setLayout(new BorderLayout(30,20));
		
		
		add(new JButton("add"), BorderLayout.NORTH);
	
		JButton jb = new JButton("add");
		add("North", jb);	// 또는 add("North", jb);
		
		
		add(new JButton("sub"), BorderLayout.SOUTH);
//		add(new JButton("sub"), "South")
		
		
		add(new JButton("mul"), BorderLayout.EAST);
//		add("East", new JButton("mul"));
		
		add(new JButton("div"), BorderLayout.WEST);
		add(new JButton("Calculate"), BorderLayout.CENTER);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new BorderLayoutEx();
	}

}
