package finalEx;

public class Person {

	final String nation = "Korea";	// ���Ҵ� �Ұ� == ������ �Ұ�
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
//		this.nation = nation;	// final�� ���� ������־ ���� �Ұ�
		this.ssn = ssn;
		this.name = name;
	}
	
	// toString()�� Overring(������)
	@Override	// �����Ϸ��� �����ϴ� �ּ�
	public String toString() {
		
		
		return "Person��ü...";	// ~@�ؽ��ڵ尪
	}

}
