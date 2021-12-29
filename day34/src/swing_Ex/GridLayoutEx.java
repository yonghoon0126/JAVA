package swing_Ex;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	GridLayoutEx() {
		setTitle("GridLayout Sample");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5, 2);	// 4*2 Layout생성
		
		grid.setVgap(5);	// 상하 수직 간격
		grid.setHgap(5);	// 좌우 수평 간격
		setLayout(grid);

		JTextField jt1 = new JTextField("");
		JTextField jt2 = new JTextField("");
		JTextField jt3 = new JTextField("");
		JTextField jt4 = new JTextField("");

		jt1.setBackground(Color.yellow);
		jt2.setBackground(Color.yellow);
		jt3.setBackground(Color.yellow);
		jt4.setBackground(Color.yellow);

		JButton jb1 = new JButton("확인");
		JButton jb2 = new JButton("취소");
		
		JLabel jl1 = new JLabel("이름");
		jl1.setOpaque(true);	// 불투명하게 색 적용하기 위해 줌
		jl1.setBackground(Color.cyan);	// 색 적용x
		jt1.setText("홍길동");
		add(jl1);
		add(jt1);
		
		add(new JLabel("학번"));
		add(jt2);

		add(new JLabel("학과"));
		add(jt3);

		add(new JLabel("과목"));
		add(jt4);

		// 버튼 붙이기
		add(jb1);
		add(jb2);
		
		// 확인 버튼 눌렀을 때 
		// 이벤트 처리 : 소스.등록(add***Listener(처리기 : new 클래스명(){} );
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("이름 : " + jt1.getText());
				System.out.println("학번 : " + jt2.getText());
				System.out.println("학과 : " + jt3.getText());
				System.out.println("과목 : " + jt4.getText());
			}
		});
		
		
		// 취소 버튼 눌렀을 때
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				
			}
		});
			
				
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new GridLayoutEx();
	}

}
