package innerClass;

//	* �̳�Ŭ���� = ����Ŭ���� = ��øŬ����
//		- �̳�Ŭ������  ���ؿ� Ư¡
//	*Ư¡ : Ŭ�������� �� �ٸ� Ŭ������ ���ǵǴ� ���� �ǹ��Ѵ�.
//		   �ʿ��� ����? ���ݱ��� �۾��� �Դ� Ŭ���������
//		   ������������ ������ �ϳ��� ���ó�� ����� �� �ִ� Ư¡�� �ִ�.
//		   
//	* �̳�Ŭ������ ���� �� ���� ���� ����
//		- �̳�Ŭ������ �ܺ� Ŭ������ ��� ������� ��ġ �ڽ���
//		���ó�� ����� �� �ִ�.
//		- static �̳� Ŭ������ �����ϰ��� �ٸ� �̳� Ŭ������ 
//		�׻� �ܺ� Ŭ������ ���ؾ� ������ �����ϴ�.
//		- �ܺ�Ŭ����$����Ŭ������.class�� class������ �������
//		
//	* �̳�Ŭ������ ����
//		1. Member class : �ܺ� Ŭ������ ������� ������ġ�� ����.
//						  �ܺ� Ŭ������ �ν��Ͻ����ó�� �ٷ������.
//						  �ַ� �ܺ�Ŭ������ �ν��Ͻ� ������ ���õ� �۾���
//						  ���� �������� ����ȴ�.
//						  
//		2. Static MemberClass : �ܺ� Ŭ������ ������� ������ġ�� ����.
//								�ܺ�Ŭ������ static���ó�� �ٷ������.
//								�ַ� �ܺ�Ŭ������ static���, 
//								Ư�� static�޼ҵ忡�� ���� �������� ����ȴ�.
//								
//		3. Local class : �ܺ�Ŭ������ �޼ҵ峪 �ʱ�ȭ���� �ȿ� �����ϸ�,
//						 ����� ���� ���ο����� ��� �� �� �ִ�.
//						 
//		4. Anonymous class : Ŭ������ ����� ��ü�� ������ ���ÿ� �ϴ� 
//							 �̸����� Ŭ����((��ȸ�� : �ѹ��� ����ϰ� �������� 
//							 ��ü�� ��� �� �� �����ϰ� ���δ�. Swing���� ���� ��)
						 

public class MemberClass {


		// ����ʵ� ����
		int aa = 10;	// �ν��Ͻ� �������, default(���� ��Ű���������� ����)
		private int bb = 10;
		static int c = 200;
		
		
		// ����Ŭ���� : �ܺ� Ŭ������ ���, �޼ҵ� �ڱ�� ó�� ���.
		// Ŭ���� ���� ��ġ ���������ġ
		
		class Inner{
			MemberClass m = new MemberClass();
			// �ν��Ͻ��ʵ�, �ν��Ͻ��޼ҵ常 ����
//			static int a; // �����ʵ�, �����޼ҵ� ��� �Ұ�, �޸𸮰� ���� ����
//			static int b = 10;
//			static void a() {};
			
			public void printData() {
				System.out.println("int aa : " + m.aa);	// �Ǵ� aa
				System.out.println("int bb : " + m.bb);	// �Ǵ� m.bb
				System.out.println("static int cc : " + c);	// MemberClass.c
			}
		}; // innerclass
		
		public static void main(String[] args) {
			
			MemberClass.Inner inner = new MemberClass().new Inner();
			inner.printData();
			
		}
		
		
	}
