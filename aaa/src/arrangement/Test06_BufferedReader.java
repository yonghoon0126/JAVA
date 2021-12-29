package arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test06_BufferedReader {

//	����5) Ű����� �̸���, ����/����/���������� �Է¹޾�
//	������ ���Ͽ� �Ʒ�ó�� ����Ͻÿ�.(BufferedReader���)
//	
//	�̸��� �Է��ϼ��� : ���ΰ�
//	���� : 100
//	���� : 90
//	���� : 80
//	
//	=====[���]=====
//	�̸� : ���ΰ�
//	�������� : 100
//	�������� : 90
//	�������� : 80
//	���� : 270
	public static void main(String[] args) throws IOException {
		// BufferedReader �ν��Ͻ� == ��ü����
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		//--'��'��� ���ڸ� BufferedReader�� ���� �Է¹��� ���
		//	2����Ʈ�� �����Ǿ� �ֱ� ������ 1����Ʈ�� �ɰ���.
		//	InputStreamReader�� ����Ʈ ��Ʈ����
		//	���ڽ�Ʈ������ ��ȯ�����ִ� ������ �ϰԵȴ�.
		//--new�� ���� heap �޸� ������ �Ҵ�޾� �ö󰣴�
		//	�� ��� br�� reference type�����̴�.
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		String name = "";
		//--String��?
		//	'A' : ���� stack ������ ����
		//	"A" : ���ڿ� Heap ������ ����
		//--String ��ŭ�� new�� ����Ͽ� �޸� ������
		//	�Ҵ���� �ʾƵ� ��� �����ϴ�.
		//	int k, e, m, t(��, ��, ��, �� ���� ����)
		//	stack �޸� ������ 4����Ʈ��
		//	�� 16����Ʈ �ö󰣴�.
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		//--����ڰ� �Է��� ��(�ܺ� ������)�� �޾ƿͼ� ������ ��Ƴ���
		//--readLine()��?
		//	BufferedReader�� �޼ҵ�� ���پ� �Է¹޴´�.
		//	���� �Է��� ���޴´�. ���� ���ڿ��� �Է¹޴´�.
		//	read() �޼ҵ�� �Է� ���� ���
		//	[ȫ�浿]�� 3���� �Է¹޾ƾ��Ѵ�.
		
		System.out.print("���� : ");
		kor = Integer.parseInt(br.readLine());
		//--�� ��Ȳ���� �������� 70���� �Է¹޾Ҵٰ� ������ ��
		//	readLine()�� ���� �Է¹��� 70��
		//	���ڰ� �ƴ϶� ���ڿ��̴�.
		//	���ڷ� �ٲ��� ������ ��� ������ �Ұ����ϴ�.
		//	��, ���������� ���ڸ� ���� Ÿ������ �ٲپ��ִ� ���̴�
		//	Integer.paseInt()�� ���� ������ �� ��ȯ�� �Ѵ�.
		
		System.out.print("���� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� : ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.println("===[���===");
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + mat);
		System.out.println("���� : "+(kor+eng+mat));
		
	}

}
