package thisEx06;

//--생성자(Constructor)와 초기화 블럭(Initialized Block)
//===================================================
//클래스변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
//인스턴스변수의 초기화 시점 : 인스턴스가 생성될 때 마다 각 인스턴스별로 초기화가 이루어진다.
//
//클래스 변수의 초기화 순서 : 
//기본값 --> 명시적초기화 --> 클래스초기화 블럭 --> 인스턴스 초기화 블럭 --> 생성자
//
//인스턴스 변수의 초기화 순서 :
//기본값 --> 명시적초기화 --> 인스턴스 초기화 블럭 --> 생성자

public class TelevisionExample {

	public static void main(String[] args) {

		System.out.println(Television.info);
		
		Television tv1 = new Television();
		Television tv2 = new Television();
		
		if (tv1 == tv2) {
			System.out.println("실제 주소가 같습니다.");
		} else {
			System.out.println("실제주소가 다릅니다.");
		}
		System.out.println("tv1.hashCode = " + tv1.hashCode() );
		System.out.println("tv2.hashCode = " + tv2.hashCode() );

	}

}
