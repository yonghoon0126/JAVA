package text;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	Container contentPane;

	TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JTextField jt1 = new JTextField(10);
		JTextField jt2 = new JTextField("컴퓨터 공학과(수정)");
		JTextField jt3 = new JTextField("서울시...", 20);
		
		contentPane.add(new JLabel("이름 : "));
		contentPane.add(jt1); // 창 크기가 10인 텍스트 필드

		contentPane.add(new JLabel("학과 : "));
		contentPane.add(jt2); // 텍스트 필드

		contentPane.add(new JLabel("주소 : "));
		contentPane.add(jt3); // 창 크기가 20인 텍스트 필드

		// 입력 / 취소 버튼 생성하고, 달고, 이벤트 발생하기
		JPanel jp = new JPanel();
		JButton jb1 = new JButton("확인");
		JButton jb2 = new JButton("취소");
		jp.add(jb1);
		jp.add(jb2);
		contentPane.add(jp);
		
		add(jb1);
		add(jb2);

		setSize(350, 200);
		setVisible(true);
		
//=============================================================================

		// 확인 / 취소 눌렀을 때
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이름 : " + jt1.getText());
				System.out.println("학과 : " + jt2.getText());
				System.out.println("주소 : " + jt3.getText());
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
			}
		});
		
//=============================================================================
		
		// TextField에 text넣기
		jt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("이름 : " + jt1.getText());
				}
			});
		jt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("학과 : " + jt2.getText());
			}
		});
		jt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("주소 : " + jt3.getText());
			}
		});
	}

	public static void main(String[] args) {

		new TextFieldEx();
	}

}
