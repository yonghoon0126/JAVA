package thisEx11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
		System.out.println(sdf.format(now));	// 2021-10-25

		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");	
		System.out.println(sdf.format(now));	// 2021�� 10�� 25��

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");	
		System.out.println(sdf.format(now));	// 2021.10.25 ���� 11:06:45

		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));	// ������ ������

		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf.format(now));	// ������ 298��° ��

		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println(sdf.format(now));	// �̴��� 25��° ��

	}

}
