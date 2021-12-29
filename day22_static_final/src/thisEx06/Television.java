package thisEx06;

public class Television {

	static String company = "Samsung";	// 명시적 초기화
	static String model = "LCD";
	static String info;	// 기본값 = 묵시적 초기화
	
	// 정적 블럭 = 클래스 블럭
	static {
		info = company + "-" + model;
	}
	
	{} // 동적 블럭 == 인스턴스 블럭
	
}
