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
		la.setBorder(new LineBorder(Color.green,5));	// 색, 테두리 굵기
		add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			
			// 색의 3요소		: CMYK 시안(청록), 마젠타(자주), 엘로==>블랙
			// 색(광)의 3요소  : RGBW 빨강(0~255), 파랑(0~255), 초록(0~255)-->white
			// 버튼(b)바탕색 적용				   (r,  g,  b)
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
