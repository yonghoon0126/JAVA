package swing_Ex;

//	JFrame : 
//
//		������ JFrame�� AWT�� Frame�� �޸� �� ������ ������ �Ǿ� �ִ�. ������ ��ü�� �����Ǿ�
//		�ִ� ���� �ƴ϶� �� �ȿ� 4���� ����(Pane)�� ������ �����Ǿ� �ִ�.
//	
//	1. JRootPane : 
//	
//		�������� ������ ����� �����ϴ� �淮�� �����̳��̴�.
//		��� ��������� �����̳� ����� ���� ��������, �ٸ� ������Ʈ���
//		�� ��ȭ�� �� �� �ֵ��� �����ֱ� �����̴�.
//		GlassPane�� LayeredPane���� �����Ǿ� �ְ�,
//		LayeredPane�� JMenuBar, ContentPane�� �����Ѵ�.
//					
//	2. GlassPane : 
//	
//		�⺻������ ������ ���·� �Ǿ� �ִ�. �ٸ� �г� ���� �����ϴ� �г��̴�.
//		�ַ� ���콺 �̺�Ʈ�� ó���ϱ� ���� ���� ���� ��Ʈ���ο� �߰��ȴ�.(Componet)
//					
//	3. LayeredPane : 
//	
//		��Ʈ ���ο� ���� ���̾ �� �� �ֵ��� ���� ���� �г��� ���� �� �� �ִ�
//		�гη� ���� ������Ʈ�� ���� ������(������Ʈ ���� �ٸ� ������Ʈ�� ���̴� �۾�)
//		�� �� �ֵ��� �Ѵ�.
//		�� �κ��� JMenuBar, �Ʒ��κ��� ContentPane���� �̷���� �ִ�.
//		
//	4. ContentPane : 
//	
//		�Ϲ������� ������Ʈ�� ���� �� �ִ� �г�. ������ ��ü�� getContentPene()��
//		�̿��ؼ� ���� �� �ִ�.(�޴��� ������ GUI ������Ʈ���� �����ϴ� ����)
//						
//	5. JMenuBar : 
//	
//		�������� �޴��� �����ϴ� ���ҷ� ������ �����ϴ�.
//		JMenu, JMenuItem���� �̿��ؼ� �޴��� �����Ͽ� SetJMenu()��
//		�̿��ؼ� ��� �� �� �ִ�.

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame() {
		setTitle("ù��° ������");
		setSize(300,300);	// x,yũ��
//		setBounds(200,200,300,300);	// x,y��ǥ ��ġ, x,yũ��
		setLocation(500,500);	//x,y��ǥ ��ġ
//		pack();	�⺻ũ�⸸ŭ ǥ��
		setVisible(true);	// ȭ�� ǥ��
		System.out.println(this.getTitle());	// = getTitle();
	}
	
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
	}
}
