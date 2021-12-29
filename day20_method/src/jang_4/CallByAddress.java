package jang_4;

public class CallByAddress {

	class MyInt{
		int val;
		MyInt(int i){
			val = i;
		}
	}

	public class Person4 {
		public String name;	
		public int age;	
		public Person4(String s) {	
			name = s;	
		}

		// ���ǸŰ�����, �����μ�, ��������
		public void setAge(MyInt i) {	// 33
			age = i.val;
			i.val++;
			System.out.println("����" + age);
		}
	}
	

	public class CallByValueObject{
		
		public void main(String[] args) {
			Person4 aPerson = new Person4("ȫ�浿");
			MyInt a = new MyInt(33);
			
			aPerson.setAge(a);	// call by address �ּҰ� ����, ��
			
			System.out.println(a.val);
		}
	}
}

