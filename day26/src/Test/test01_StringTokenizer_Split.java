package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	����1) ���۸� ����Ͽ� Ű����� ���ڿ��� �Է� �޾� �޸��� �����Ͽ� �Ʒ��� ����
//	����Ͻÿ�
//	StringTokenizer����ϰ� ,�� �����Ͻÿ�
//	�������)
//	�Ľ��� ���ڿ� �Է�[�޸� ����] : �Ľ���, ���ڿ�, �Է�[�޸�, ����], : 
//		
//	�Ľ̵� ���ڿ� : �Ľ��� ���ڿ� �Է�[�޸� ����] : 


public class test01_StringTokenizer_Split {

	public static void main(String[] args) throws IOException {

		String strTemp;
		
		// Ű����
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ľ��� ���ڿ� �Է�[�޸� ����] :");
		strTemp = br.readLine();	// Ű���忡�� ���� �о����
		
		
		
		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = 
				new StringTokenizer(strTemp, ",");
		System.out.print("�Ľ̵� ���ڿ� :");
		
		while(st.hasMoreTokens())
			System.out.print(st.nextToken());
		
		
		// split
		String str[] = strTemp.split(",");
		System.out.println("�Ľ̵� ���ڿ� :");
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " ");
		}
	}

}
