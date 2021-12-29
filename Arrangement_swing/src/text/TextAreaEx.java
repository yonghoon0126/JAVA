package text;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {

	Container contentPane;

	TextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 컨텐트팬에 MyCenterPanel을 즉 JPanel을 부착한다
		contentPane = getContentPane();

		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

//============================================================================

	// 텍스트 필드, 버튼, 텍스트영역 컴포넌트를 가지는 패널
	class MyCenterPanel extends JPanel {

		JTextField tf;
		JButton btn, btn2;
		JTextArea ta;

		MyCenterPanel() {
			tf = new JTextField(20);	// 텍스트 필드 생성
			btn = new JButton("추가");	// 추가 버튼 생성
			btn2 = new JButton("지우기");	// 지우기 버튼 생성

//============================================================================
			
			// 추가 버튼에 Action 리스너를 등록한다
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");	// 입력 텍스트 내용 추가
				}
			});
			
			// 지우기 버튼에 Action 리스너를 등록한다
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText("");	// 텍스트 필드 내용 지우기
					ta.setText("");	// 텍스트 영역 내용 지우기
				}
			});

			// 텍스트 영역
			ta = new JTextArea("입력하세요.", 7, 20);	
			add(new JLabel("아래 창에 문자열을 입력하고 클릭하세요."));

			
			add(tf);	// 텍스트 필드 삽입
			add(btn);	// 추가 버튼 삽입
			add(btn2);	// 지우기 버튼 삽입
			add(new JScrollPane(ta));	// 스크롤바 삽입

		}
	}

	public static void main(String[] args) {

		new TextAreaEx();
	}

}
