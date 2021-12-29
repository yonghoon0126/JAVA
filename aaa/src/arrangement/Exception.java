package arrangement;

import java.util.Scanner;

public class Exception {

	public static void main(String[] atrs) {

		Scanner a = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���.");
		System.out.print("����� ���̴� ");
		a.nextInt();
		
		System.out.print("����� ü���� ");
		a.nextDouble();
		
		System.out.print("����� ������ ");
		a.nextDouble();
		
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���.");
		System.out.println("����� ���̴� " + a.nextInt() + "���Դϴ�.");
		System.out.println("����� ���̴� " + a.nextDouble() + "kg�Դϴ�.");
		System.out.println("����� ���̴� " + a.nextDouble() + "cm�Դϴ�.");
	}

}

/*
  �ڹٴ� �����ڵ� 16��Ʈ char ch='\u0000' 
  ����� ==> ��Ʈ������ ���� 
  			�Է�(InputStream - 1����Ʈ, Reader - 2����Ʈ)
  			���(OutputStream - 1����Ʈ, Writer - 2����Ʈ) 
  �ֻ��� �߻� Ŭ���� : 1����Ʈ ���� (InputStream,OutputStream)
  				  ���ڴ���(2����Ʈ)(Reader/Writer) 
  ����Ʈ���� : InputStream/OutputStream (�̹���, ������, �׸�ó����)
  ���� ���� : Reader/Writer(������ ������, �޸��忡�� ����Ǵ� �͵�)
  
  *ObjectOutputStream / ObjectInputStream
  	��ü�� ������ϱ� ���� Ŭ����
  -����, �����ͺ��̽��� ��ü�� ����, ��Ʈ��ũ�� ���� �ڷḦ ���� �� �� ��� ==> 2byte
  -Ŭ������ ��ü ������ ����� �� �� �ְ� �����Ѵ�.
  -��ü�� ����ȭ(�������� ����Ʈ�� ǥ���ϴ� ������)
  	ObjectOutputStream : �⺻�ڷ��� �����͸� ����Ʈ ��Ʈ������ ��� ==> ����ȭ
  	ObjectInputStream : ����Ʈ ��Ʈ������ �ڹ��� �⺻ �ڷ��� �����ͷ� �о���� ��� ==> ������ȭ
  
  *����(Exception : �ֻ��� Ŭ����) 
  ����ó��(Exception Handling) 
  - ������ ����(compile-time error)�� ��Ÿ�� ����(runtime error) 
  	������ ���� ? ������ �� �� �߻��ϴ� ���� ==> ��, ���������� Ʋ���� ��
  	��Ÿ�� ���� ? ������ �� �߻��ϴ� ���� 
  
  -Java��Ÿ�� ���� ? ����(error)�� ����(Exception) 
  	Error - �ڵ忡�� ó���� �� ���� �ɰ��� ���� 
  	Exception - �ڵ忡�� ó���� �� �ִ� ������ ������ ����
  
  - ����ó���� ���� 
  	���α׷� ���� �� �߻��� �� �ִ� ��Ȳ���� �̸� ���س���, ���ܰ� �߻����� ��쿡 ����ϴ� �ڵ带 
  	�ۼ��Ͽ� ���α׷��� ���������� �۵��ϵ��� �ϱ� ����.
  
  	try : �˻�(���� �߻�)
  	catch : ����ó��
  	finally : � ����̴� �����ϰ� ���� ��
  
  ��1) try{	//�˻� �� ������ ������ try���� �����ϰ� finally���� ����
  			�˻繮 ���๮;
  		}catch(Exception e){	//�˻��ؼ� ������ �߻��ϸ� ó�� 
  				����ó�� ����  ==> ex)����¿��� ������ ���� - IOException
 		}finally{	//���������� �����ϰ� ������ ����
  				���� �� ��
  			} // �˻� �� �θ�Ŭ���� ���� - ū�ź��� �����ɷ�
  ��2) main(String a[]) throws Exception{}
  
  ��3) - ���ܸ� ���� ���� : new throw Exception("�޼��� �Է�")				
  	
  
 */
