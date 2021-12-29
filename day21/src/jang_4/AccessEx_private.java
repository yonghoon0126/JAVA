package jang_4;

class Sample{
	public int a;
	
	private int b;	// 정보은닉 = 캡슐화 // 외부클래스에서 직접접근 불가
	// 간접접근 getter() / setter()
	
	int c;

	// getter() 
	public int getB() {	// int b = aClass.getB();
		return a;
	}
	// setter()
	public void setB(int b) {	// aClass.setB(10);
		this.b = b;
	}
}

public class AccessEx_private {
	
	public static void main(String[] args) {
		
		Sample aClass = new Sample();
		aClass.a = 10;

//**********************************************************************
//		aClass.b = 10;	// 직접접근해서 에러남, setter()로 저장해야 함
		aClass.setB(10); // 간접접근, setter()
//**********************************************************************
		
		aClass.c = 10;

		System.out.println("b값 = " + aClass.getB());
	}

}
