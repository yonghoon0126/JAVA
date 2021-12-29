package thisEx03;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
						 	// 128(��ȣ) 64	32	16	8	4	2	1	
		int v1 = 10;//*-1;	//		0	0	0	0	1	0	1	0
		int v2 = ~v1;	// -11
		int v3 = ~v1 + 1;	// -10 = -11 + (+1)
		// 					�޼ҵ� ȣ��(��);
		System.out.println(toBinaryString(v1) + " (������ : " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (������ : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (������ : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		//�⺻�� ���� = ���ڿ�(��ü)�� ��ü��(Integer)Ŭ������ �̿� �⺻�� ������ ��ȯ
		System.out.println(toBinaryString(v4) + " (������ : " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (������ : " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (������ : " + v6 + ")");
	}

	// �����޼ҵ�(static) : Ŭ����.�޼ҵ��() / ���� Ŭ���������� ���� : �޼ҵ��() / ��ü��.�޼ҵ�()
	// �����޼ҵ�(non-static) : Ŭ������ ��ü�� = new Ŭ������(); ��ü��.�޼ҵ�() 
	public static String toBinaryString(int value) {	// 10
		String str = Integer.toBinaryString(value);	// (0000)1010 + 10
		while (str.length() < 32) {	// 4 < 32
			str = "0" + str;	// 0 + 1010
		}
		return str;
	}
}
/*
 �޼ҵ� ����(���� = prototype)
 ���������� ������ ��ȯ�� �޼ҵ��(�Ű�����Ÿ�� ������) {ó���� ����;return ��;}
 1. ��ȯ���� ���� �Ű������� ���� �޼ҵ� ����
 	��) public static void sum(){
 		ó���� ����;
 		return ��(x);	// return�� ����
    }// return
 1.1 �޼ҵ� ���(ȣ��)
 ��ȯ��(x) �޼ҵ��();
 ��) ��ȯ��(x) sum();
 
 2. ��ȯ���� ���� �Ű������� ������ �޼ҵ� ����		
  ��) public static void sum(int a){
 			ó���� ����; return(x)
 	}
 2.1 �޼ҵ� ��� //	int a = ��;
 ��ȯ��(x) sum(��); // �ڷ�Ÿ�Կ� �´� ���� �ְ� ȣ��
 
 3. ��ȯ���� �ְ� �Ű������� ���� �� �޼ҵ� ����
  ��) public static int sum(){
  						ó���� ����;
  			return ��ȯŸ���� �´� ��;		
 		}
 3.1 �޼ҵ� ���
 int tot = sum();
 
 4. ��ȯ���� �ְ� �Ű������� ���� �� �޼ҵ� ����
  ��) public static ��-��int sum(int a){
 						ó���� ����;
 				return ���ȯŸ���� ��;
 				}
 4.1 �޼ҵ� ���
 ��int tot = sum(�簪); 
 		
 */



