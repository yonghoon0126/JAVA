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
		setTitle("�����̴� ���鸮 ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
//						JSlider(int orientation, int min, int max, int  val)
//								(JSlider�� �������� ��������, �ּҰ�, �ִ밪, �⺻��)

		slider.setPaintLabels(true); // ��ġ(label)�� ���̵��� ����
		slider.setPaintTicks(true); // ����(tick)�� ���̵��� ����
		slider.setPaintTrack(true); // Ʈ��(track==����)�� ���̵��� ����
		slider.setMajorTickSpacing(50); // ū ���� ������ 50�ȼ��� ����
		slider.setMinorTickSpacing(10); // ���� ���� ������ 10�ȼ��� ����

		contentPane.add(slider);
		setSize(300, 100);
		setVisible(true);

//============================================================================

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// �����̴� ���� ������ �� ���� �� �ֿܼ� ���
				System.out.println(slider.getValue());
			}
		});
	}

	public static void main(String[] args) {

		new SliderEx();
	}
}
