package innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 4. Anonymous class

public class Anonymous extends JFrame {

	public static void main(String[] args) {

		// 프레임 객체 생성
		Anonymous t = new Anonymous();

		// 프레임 제목
		t.setTitle("익명 내부 클래스 연습...");

		// 버튼 객체 생성
		JButton btn = new JButton("버튼을 눌러주세요.");

		// 프레임에 버튼 붙이기
		t.add(btn);

		// 프레임 크기 설정
		t.setSize(500,300); // 화면에 가로*세로 크기
		// 1인치 = 2.54cm(1인치 안에 점이 많을수록 화질이 좋음)

		// 프레임 화면에 x, y위치
		t.setLocation(100,100);	

		// 화면에 출력
		t.setVisible(true); 
		
		// 버튼을 클릭했을 시 이벤트처리 할 처리기(이벤트 핸들러)연결
		// 이벤트 발생시킬 소스.이벤트연결(이벤트 처리기)
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 이벤트를 발생한 버튼에 있는 글자를 대입
				System.out.println(e);
				
				// 버튼에 글자 가져오기
				String select = e.getActionCommand(); 

				if (select.equals("버튼을 눌러주세요."));
				System.out.println(select + "...");

				// 시스템 종료 == 프로그램 종료 0 또는 다른 정수
				// 아무거나 보통 0을 많이 사용
				System.exit(0);

			} // actionPerformed
		}); // ActionListener()
		
		t.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) { // 창 열때
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {	// 창 아이콘 클릭할 때
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {	// 창 닫을때
				System.out.print("닫을 까요?");
//				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});	// WindowListener()
		
		
		

	}

}
