package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����7)
//����) BufferedReader, ���׿�����(���ǿ�����)�̿�
//���)
//������ ���� �Է� : 15
//
//===[�Ǻ� ���]===
//15 ==> Ȧ��

public class Test07 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		String str;

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());


		
//		if (a % 2 == 1){
		
//			str = "Ȧ��";
//		} else {
//			str = "¦��";
//		}
		str = (a%2==0) ?  "¦��" : "Ȧ��";

		System.out.println();
		System.out.println("===[�Ǻ� ���]===");
		System.out.println(a + " ==> " + str);
	
	}
}
