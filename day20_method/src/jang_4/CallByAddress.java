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

		// 형실매개변수, 형식인수, 형식인자
		public void setAge(MyInt i) {	// 33
			age = i.val;
			i.val++;
			System.out.println("나이" + age);
		}
	}
	

	public class CallByValueObject{
		
		public void main(String[] args) {
			Person4 aPerson = new Person4("홍길동");
			MyInt a = new MyInt(33);
			
			aPerson.setAge(a);	// call by address 주소값 전달, 값
			
			System.out.println(a.val);
		}
	}
}

