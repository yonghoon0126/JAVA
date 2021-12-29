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
	String names[] = { "사과", "배", "체리" };
	JLabel sumLabel;	// 계산 합을 출력할 레이블
	int sum = 0;	// 가격의 합

	CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

		// 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, Item 리스너 등록
		for (int i = 0; i < fruits.length; i++) {	// fruits.length=3
			fruits[i] = new JCheckBox(names[i]);	// 배열 names[]의 문자열로 체크박스
			fruits[i].setBorderPainted(true);	// 체크박스의 외곽선이 보이도록 설정
			contentPane.add(fruits[i]);	// 체크박스 컴포넌트를 컨텐트팬에 삽입
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("현재 0 원 입니다.");
		contentPane.add(sumLabel);

		setSize(250, 200);
		setVisible(true);
	}

	// Item 리스너 구현
	class MyItemListener implements ItemListener {
		
		// 체크박스의 선택 상태가 변하면 itemStateChanged()가 호출됨
		public void itemStateChanged(ItemEvent e) {

			int selected = 1;	// 1이면 선택, -1이면 해제 상태
			System.out.println(e.getStateChange() + "...");
			
			if (e.getStateChange() == ItemEvent.SELECTED) {
				selected = 1;	// 선택 상태
			}else {
				selected = -1;	// 선택 해제 상태
			}
			System.out.println("아이템..." + e.getItem());
			
			
			// 어떤 체크 박스인지 판별
			if (e.getItem() == fruits[0]) {
				sum = sum + selected * 100;	// 사과
			System.out.println(e.getItem());
			
			}else if (e.getItem() == fruits[1]) {
				sum = sum + selected * 500;	// 배
			
			}else {
				sum = sum + selected * 20000;	// 체리
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}
	
	
	
	public static void main(String[] args) {

		new CheckBoxItemEventEx();
	}

}
