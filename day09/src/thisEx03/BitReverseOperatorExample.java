package thisEx03;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
						 	// 128(부호) 64	32	16	8	4	2	1	
		int v1 = 10;//*-1;	//		0	0	0	0	1	0	1	0
		int v2 = ~v1;	// -11
		int v3 = ~v1 + 1;	// -10 = -11 + (+1)
		// 					메소드 호출(값);
		System.out.println(toBinaryString(v1) + " (십진수 : " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수 : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수 : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		//기본형 정수 = 문자열(객체)를 객체형(Integer)클래스를 이용 기본형 정수로 변환
		System.out.println(toBinaryString(v4) + " (십진수 : " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수 : " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수 : " + v6 + ")");
	}

	// 정적메소드(static) : 클래스.메소드명() / 같은 클래스내에서 접근 : 메소드명() / 객체명.메소드()
	// 동적메소드(non-static) : 클래스명 객체명 = new 클래스명(); 객체명.메소드() 
	public static String toBinaryString(int value) {	// 10
		String str = Integer.toBinaryString(value);	// (0000)1010 + 10
		while (str.length() < 32) {	// 4 < 32
			str = "0" + str;	// 0 + 1010
		}
		return str;
	}
}
/*
 메소드 선언(원형 = prototype)
 접근지정자 지정자 반환형 메소드명(매개변수타입 변수명) {처리할 문장;return 값;}
 1. 반환형이 없고 매개변수가 없는 메소드 선언
 	예) public static void sum(){
 		처리할 문장;
 		return 값(x);	// return만 가능
    }// return
 1.1 메소드 사용(호출)
 반환형(x) 메소드명();
 예) 반환형(x) sum();
 
 2. 반환형이 없고 매개변수가 있을때 메소드 선언		
  예) public static void sum(int a){
 			처리할 문장; return(x)
 	}
 2.1 메소드 사용 //	int a = 값;
 반환형(x) sum(값); // 자료타입에 맞는 값을 넣고 호출
 
 3. 반환형이 있고 매개변수가 없을 때 메소드 선언
  예) public static int sum(){
  						처리할 문장;
  			return 반환타입의 맞는 값;		
 		}
 3.1 메소드 사용
 int tot = sum();
 
 4. 반환형이 있고 매개변수가 있을 때 메소드 선언
  예) public static ②-ⓐint sum(int a){
 						처리할 문장;
 				return ②반환타입의 값;
 				}
 4.1 메소드 사용
 ③int tot = sum(①값); 
 		
 */



