package swing_Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	
	Container contentPane;
	JLabel colorLabel;
	JSlider[] sl = new JSlider[3];

	SliderChangeEx() {
	
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		colorLabel = new JLabel("        SLIDER EXAMPLE        ");
		
		for (int i = 0; i < sl.length; i++) {
			// 수평으로, 최소0, 최대250, 눈금128
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);	
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);	// 큰눈금 50 
			sl[i].setMinorTickSpacing(10);	// 작은눈금 10
			sl[i].addChangeListener(new MyChangeListener());
			contentPane.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);	// 첫번째 슬라이더 빨간색	
		sl[1].setForeground(Color.GREEN);	// 두번째 슬라이더 초록색
		sl[2].setForeground(Color.BLUE);	// 세번째 슬라이더 파란색
		
		colorLabel.setOpaque(true);	// 완전 불투명하게 설정
		colorLabel.setBackground(new Color(sl[0].getValue(), 
				sl[1].getValue(), sl[2].getValue()));	// 실린더가 움직이면 라벨 색도 변함
		
		contentPane.add(colorLabel);
		setSize(300, 300);
		setVisible(true);
	}

//===============================================================================

	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			colorLabel.setBackground(new Color(sl[0].getValue(), 
					sl[1].getValue(), sl[2].getValue()));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}
}
