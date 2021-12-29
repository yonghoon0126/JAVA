package day04;
//접근지정자 지정자 class 클래스명{}
public class Test01 {
	//멤버변수
	//접근지정자 지정자 자료타입 변수명=초기값;	//public static int a=10;
	//기본이 초기화 되어 있음.
	//기본형, 메모리는 컴파일러가 크기 결정,  스택영역
	
	//논리형 
	boolean b;//false ,1byte
	//정수형
	byte    by;//0 ,이진값 표현시, 이미지,사운드, 동영상에서 사용 ,1byte
	char    c;//' '//문자 하나, 2byte, \u0000, 부호가 없음
	short   sh;//0 c사용자를 위한 자료타입  ,2byte //byte b=2; short sh= b+2;
	int     i;//0  자바는 정수타입이라고 하면 무조건 int형을 말함  ,4byte
	long    l;//0  회계에서 많이 사용,8byte, long l=20L;
	//실수 4,8   / 정수와 실수중에 실수가 표현범위가 크다, 계산속도는 실수가 느리다. 
	float   f;//0.0 , 4바이트   float f=2.5;(x),float f=2.5f;(O),
	          // float f=(float)2.5;(O)--> '(자료타입)'를 형변환=캐스팅연산자 
	double  d;//0.0 , 8바이트 실수에서 기본타입, double d=2.5;(O)
	//float를 쓰고 싶으면 실수 뒤에다가 f붙여야됨,
	//아니면 double이 기본형이기 때문에double로 인식
	
	
	//객체형=참조형=참조변수 선언=레퍼런스형
	//참조형: String, 클래스, 인터페이스, 배열, Enum(열거형상수),객체 /Heep영역
	//컴파일 시 메모리 확보X, 실행시에 메모리 확보
	//사용할때 new연산자로 객체 만들어서 사용
	String str;//null: 아무주소도 가리키지 않음, 아무값도 없다
	
	//생성자 : 객체를 생성, 클래스내에 멤버변수들을 초기화 해주는 역할을 한다.
	public Test01(){
		System.out.println("나는 디폴트 생성자야...");
	}//디폴트 생성자
	public static void main(String[] args) {

		//객체 생성
		// 클래스명 객체변수명= new 클래스명();
		//식별자 : 사용자가 지정하는 이름
		Test01 t=new Test01();
		System.out.println("--------기본형--------");	
		System.out.println("boolean b="+t.b);
		System.out.println("byte    by="+t.by);
		System.out.println("char    c="+t.c);
		System.out.println("short   sh="+t.sh);
		System.out.println("int     i="+t.i);
		System.out.println("long    l="+t.l);
		System.out.println("float   f="+t.f);
		System.out.println("double  d="+t.d);
		System.out.println("--------참조형--------");
		
		System.out.println("String str="+t.str);
	}
}











