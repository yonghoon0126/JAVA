package thisEx06;

//--������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
//===================================================
//Ŭ���������� �ʱ�ȭ ���� : Ŭ������ ó�� �ε��� �� �� �ѹ� �ʱ�ȭ �ȴ�.
//�ν��Ͻ������� �ʱ�ȭ ���� : �ν��Ͻ��� ������ �� ���� �� �ν��Ͻ����� �ʱ�ȭ�� �̷������.
//
//Ŭ���� ������ �ʱ�ȭ ���� : 
//�⺻�� --> ������ʱ�ȭ --> Ŭ�����ʱ�ȭ �� --> �ν��Ͻ� �ʱ�ȭ �� --> ������
//
//�ν��Ͻ� ������ �ʱ�ȭ ���� :
//�⺻�� --> ������ʱ�ȭ --> �ν��Ͻ� �ʱ�ȭ �� --> ������

public class TelevisionExample {

	public static void main(String[] args) {

		System.out.println(Television.info);
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		
		if (tv1 == tv2) {
			System.out.println("���� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("�����ּҰ� �ٸ��ϴ�.");
		}
		System.out.println("tv1.hashCode = " + tv1.hashCode() );
		System.out.println("tv2.hashCode = " + tv2.hashCode() );

	}

}
