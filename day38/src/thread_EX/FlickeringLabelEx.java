package thread_EX;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		
		super(text); // JLabel 생성자 호출
		setOpaque(true); // 배경색 변경이 가능하도록 설정

//		// 스레드 객체 생성
//		Thread th = new Thread(this);
//		
//		// 스레드 시작
//		th.start();
	}

//===========================================================================================

	public void run() {	// thread 실행 

		int n = 0;
		
		while (true) {	// 무한 루프
			
			// n을 0과 1로 번갈아 변경
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);

			if (n == 0)
				n = 1;
			else
				n = 0;
			
			try {
				Thread.sleep(500); // 0.5초 동안 잠을 잔다
			
			} catch (InterruptedException e) {
				return;	// 예외가 발생하면 스레드 종료

			}
		}
	}
}

//===========================================================================================

public class FlickeringLabelEx extends JFrame {	// label 만드는 class
	public FlickeringLabelEx() {
		
		setTitle("FlickeringEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 깜빡이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜빡");

		// 깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("안깜빡");

		// 깜빡이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡");
		
//===========================================================================================
		
		// 스레드 객체 생성
		Thread th = new Thread(fLabel);	// new Runnable
		Thread th2 = new Thread(fLabel2);	// new Runnable
		
		// 스레드 실행
		th.start();
		th2.start();
		
//===========================================================================================

		// 컨텐트펜에 레이블 부착
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {

		new FlickeringLabelEx();
	}

}
