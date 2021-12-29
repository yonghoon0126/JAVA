package thread_Ex;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
//	class TimerThread implements Runnable {
	
	JLabel timerLabel;	// 타이머 값이 출력된 테이블

	public TimerThread(JLabel timerLabel) {	// 생성자
		this.timerLabel = timerLabel;	// 레이블 컴포넌트를 받아서 기억
	}
	
	// run()이 종료하면 스레드 종료
	public void run() {
		int n = 0;	// 타이머 카운트 값

		while (true) {	// 무한 루프

			// 타이머 값을 레이블에 출력
			timerLabel.setText(Integer.toString(n));
			n++;	// 카운트 증가
			
			try {
				Thread.sleep(1000);	// 1초동안 잠을 잔다.
			} catch (InterruptedException e) {
				return;	// 예외가 발생하면 스레드 종료
			}
		}

	}

}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		
		setTitle("ThreadTimerEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		// 타이머 스레드로 사용할 객체 생성
		// 타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달한다
		TimerThread th = new TimerThread(timerLabel);
		
		c.add(timerLabel);	// 레이블을 컨텐트팬에 부착

		setSize(300, 150);
		setVisible(true);

		th.start();	// 타이머 스레드의 실행을 시작시킨다
	}

	public static void main(String[] args) {

		new ThreadTimerEx();
	}

}
