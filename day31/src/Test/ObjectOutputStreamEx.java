package Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
//			�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ����
//			����� �� �ִ� ObjectOutputStream ��ü ����
//			ObjectOutputStream�� ���ؼ� ����ȭ�� �� ���Ϸ� ��ϵ� Data
//			��ü���� DataŬ������ �ݵ�� Serializable�� �����ϰ� �־�� �Ѵ�.
			
			oos = new ObjectOutputStream
					(new FileOutputStream("src/Test/test.txt"));
					// �������� �������, ���θ���ų� �������

			Data data = new Data(); // ����ȭ �� ��ü ����
			data.setNo(25);
			data.setName("ȫ�浿");
			data.setMail("hong@naver.com");

			oos.writeObject(data); // ����ȭ �� ������(test.txt)�� ����
			// ObjectOutputStream�� ��ü�� ����ȭ�ؼ� ��Ʈ����
			// ���� ����� �� �ִ� writeObject()�� �����Ѵ�.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
