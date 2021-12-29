package finalEx;

public class Person {

	final String nation = "Korea";	// 재할당 불가 == 재저장 불가
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
//		this.nation = nation;	// final에 값이 저장되있어서 수정 불가
		this.ssn = ssn;
		this.name = name;
	}
	
	// toString()을 Overring(재정의)
	@Override	// 컴파일러가 이해하는 주석
	public String toString() {
		
		
		return "Person객체...";	// ~@해쉬코드값
	}

}
