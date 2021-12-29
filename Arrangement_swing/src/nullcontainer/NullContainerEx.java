package nullcontainer;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class NullContainerEx extends JFrame{
	

	NullContainerEx(){
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Button!");
		la.setLocation(130,50);
		la.setSize(200,20);
		la.setBorder(new LineBorder(Color.green,5));	// ��, �׵θ� ����
		add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			
			// ���� 3���		: CMYK �þ�(û��), ����Ÿ(����), ����==>��
			// ��(��)�� 3���  : RGBW ����(0~255), �Ķ�(0~255), �ʷ�(0~255)-->white
			// ��ư(b)������ ����				   (r,  g,  b)
			b.setBackground(new Color(i*25,200,i*25));
			
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			add(b);
			
		}
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new NullContainerEx();
	}

}
