package slider;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderEx extends JFrame {

	Container contentPane;

	SliderEx() {
		setTitle("슬라이더 만들리 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
//						JSlider(int orientation, int min, int max, int  val)
//								(JSlider가 수평인지 수직인지, 최소값, 최대값, 기본값)

		slider.setPaintLabels(true); // 수치(label)가 보이도록 설정
		slider.setPaintTicks(true); // 눈금(tick)이 보이도록 설정
		slider.setPaintTrack(true); // 트랙(track==막대)이 보이도록 설정
		slider.setMajorTickSpacing(50); // 큰 눈금 간격을 50픽셀로 설정
		slider.setMinorTickSpacing(10); // 작은 눈금 간격을 10픽셀로 설정

		contentPane.add(slider);
		setSize(300, 100);
		setVisible(true);

//============================================================================

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// 슬라이더 눈금 움직일 때 마다 값 콘솔에 출력
				System.out.println(slider.getValue());
			}
		});
	}

	public static void main(String[] args) {

		new SliderEx();
	}
}
