package thisEx11;

public class NewInstanceExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("thisEx11.SendAction");	// �ش� Ÿ��(Ŭ����)�˾ƺ���
			Class clazz2 = Class.forName("thisEx11.ReceiveAction");
			// �������� ��ü ����
			// �ڵ� �ۼ��ÿ� Ŭ���� �̸��� ������ �� ����, ��Ÿ�� �ÿ� Ŭ���� �̸��� ������ ��� ���
			Object obj = clazz.newInstance();
				
			Action action = (Action) clazz.newInstance();	// ��ü�� ���ͼ� ���� Ÿ������ ��ȯ
			Action action2 = (Action) clazz2.newInstance();

			action.execute();
			action2.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}