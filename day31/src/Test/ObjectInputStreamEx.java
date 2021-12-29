package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//	ObjectOutputStream	����ȭ	: �Ϸõ� ����Ʈ�� ����	
//	ObjectInputStream	������ȭ	: ���� �ڷ������� ��ȯ
//		- ��ü�� ����ȭ
//			����ӽ� �ȿ� �����ϴ� Ư�� ��ü(��ü�� �޸𸮿� ��ü�� ���� ����)�� �������� 
//			����Ʈ ���·� ��ȯ�ϴ� ��
//			��ü�� ����ȭ�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ���� �̿��ؼ�
//			���������� �����ϰų� ���� �� �� �ִ�.
//		- ����ȭ ������ Ŭ������ ����� ���
//			1) Serializable �������̽��� �̿�
//			2) Externalizable �������̽��� �̿�

public class ObjectInputStreamEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectInputStream ois = null;

		try {
//			���Ͽ� ����� ��ü�� �о���̱� ����
//			ObjectInputStream ��ü ����
//			������ȭ : ���� �ڷ������� ��ȯ
//			������ȭ�� �� �ʿ��� Ŭ���� ������ ã�� ���� ���
//			ClassNotFoundException�� �߻���Ų��
			
			ois = new ObjectInputStream(new FileInputStream("src/Test/test.txt"));
			Data data = (Data) ois.readObject();	// ���� �����ͷ� ��ȯ
			
			System.out.println(data + "\n-----------------");
			System.out.println("��ȣ : "+ data.getNo());
			System.out.println("�̸� : "+ data.getName());
			System.out.println("���� : "+ data.getMail());
			
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
