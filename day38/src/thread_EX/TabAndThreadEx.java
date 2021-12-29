package thread_EX;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel {
	int barSize = 0; // 바의 크기
	int maxBarSize;

	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int) ((double) (this.getWidth()) / maxBarSize * barSize);
		if (width == 0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}


	// 증가
	synchronized void fill() {
		if (barSize == maxBarSize) {
			try {
				// 바의 크기가 최대이면, ConsumerThread에 의해 바의 크기가
				// 줄어들 때까지 대기
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize++;
		repaint(); // 바 다시 그리기
		notify(); // 기다리는 ConsumerThread 깨우기
	}

	// 감소
	synchronized void consume() {
		if (barSize == 0) {
			try {
				// 바의 크기가 0이면 바의 크기가 0보다 커질때까지 대기
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint(); // 바 다시 그리기
		notify(); // 기다리는 이벤트 스레드 깨우기
	}
}

class ConsumerThread extends Thread {
	MyLabel bar;

	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}

	public void run() {
		while (true) {
			try {
				sleep(200);
				bar.consume(); // 0.2초 마다 대기
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame {
	MyLabel bar = new MyLabel(100);

	TabAndThreadEx(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);

		c.addKeyListener(new KeyAdapter() {

			// 키를 누를때마다 바가 1씩 증가한다.
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350, 200);
		setVisible(true);

		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start(); // 스레드 시작
	}

	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
	}
}
