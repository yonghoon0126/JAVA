package thisEx11;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {

		
		System.out.println("====Split=================");
		
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";

		String[] names = text.split("&|,|-");	// & , -�� ����
		for (String name : names) {	// names���� name���� �ݺ��Ͽ� ���

			System.out.println(name);
		}

		
		System.out.println("====StringTokenizer=================");
		
		
//		StringTokenizer st = new StringTokenizer(text, "/|&|,|-");	
													// / & , -�� ����
		StringTokenizer st = new StringTokenizer(text, "/&,-");	
													// / & , -�� ���� 
		
		while (st.hasMoreTokens()) {	// �����ִ� ��ū�� �ִ��� ����
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
