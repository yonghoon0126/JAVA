package jang_4;

class CurrencyConverter {

	private static double rate; // 한국 원화에 대한 환율
	
	// 일반 메소드 == non static
	public double toDollar2(double won) {
		System.out.println("여기는 일반 메소드...");
		return won / rate; // 한국 원화를 달러로 변환
	}
	
	// static 메소드
	public static double toDollar(double won) {
		System.out.println("여기는 일반 메소드...");
		return won / rate; // 한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate; // 달러를 한국 원화로 변환
	}
	public static void setRate(double rate) {
		// this.rate = rate ==> static 메소드에서 this 사용 불가
		rate = rate; // 환율 설정.KWR / $1
	}
}


public class staticMember {

	public static void main(String[] args) {

		CurrencyConverter curr = new CurrencyConverter();
		
		CurrencyConverter.setRate(1121); // 미국 달러 환율 설정

		System.out.println("백만원은 " + CurrencyConverter.toDollar(10000000) 
							+ "달러 입니다.");
		System.out.println("백만원은 " + curr.toDollar2(20000000) + "달러 입니다."); 

		System.out.println("백달러는 " + CurrencyConverter.toKWR(100) 
							+ "원 입니다.");
	}
}
