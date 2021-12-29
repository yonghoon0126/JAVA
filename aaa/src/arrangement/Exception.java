package arrangement;

import java.util.Scanner;

public class Exception {

	public static void main(String[] atrs) {

		Scanner a = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
		System.out.print("당신의 나이는 ");
		a.nextInt();
		
		System.out.print("당신의 체중은 ");
		a.nextDouble();
		
		System.out.print("당신의 신장은 ");
		a.nextDouble();
		
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
		System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
		System.out.println("당신의 나이는 " + a.nextDouble() + "kg입니다.");
		System.out.println("당신의 나이는 " + a.nextDouble() + "cm입니다.");
	}

}

/*
  자바는 유니코드 16비트 char ch='\u0000' 
  입출력 ==> 스트림으로 관리 
  			입력(InputStream - 1바이트, Reader - 2바이트)
  			출력(OutputStream - 1바이트, Writer - 2바이트) 
  최상위 추상 클래스 : 1바이트 단위 (InputStream,OutputStream)
  				  문자단위(2바이트)(Reader/Writer) 
  바이트단위 : InputStream/OutputStream (이미지, 동영상, 그림처리시)
  문자 단위 : Reader/Writer(문장을 읽을때, 메모장에서 진행되는 것들)
  
  *ObjectOutputStream / ObjectInputStream
  	객체를 입출력하기 위한 클래스
  -파일, 데이터베이스에 객체를 저장, 네트워크를 통해 자료를 전달 할 때 사용 ==> 2byte
  -클래스를 객체 단위로 입출력 할 수 있게 지원한다.
  -객체를 직렬화(순차적인 바이트로 표현하는 데이터)
  	ObjectOutputStream : 기본자료형 데이터를 바이트 스트림으로 출력 ==> 직렬화
  	ObjectInputStream : 바이트 스트림에서 자바의 기본 자료형 데이터로 읽어오는 기능 ==> 역직렬화
  
  *예외(Exception : 최상위 클래스) 
  예외처리(Exception Handling) 
  - 컴파일 에러(compile-time error)와 런타임 에러(runtime error) 
  	컴파일 에러 ? 컴파일 할 때 발생하는 에러 ==> 논리, 문법적으로 틀렸을 때
  	런타임 에러 ? 실행할 때 발생하는 에러 
  
  -Java런타임 에러 ? 에러(error)와 예외(Exception) 
  	Error - 코드에서 처리할 수 없는 심각한 오류 
  	Exception - 코드에서 처리할 수 있는 가벼운 정도의 오류
  
  - 예외처리의 목적 
  	프로그램 실행 시 발생할 수 있는 상황들을 미리 정해놓고, 예외가 발생했을 경우에 대비하는 코드를 
  	작성하여 프로그램이 정상적으로 작동하도록 하기 위함.
  
  	try : 검사(예외 발생)
  	catch : 예외처리
  	finally : 어떤 경우이던 무관하게 실행 됨
  
  예1) try{	//검사 시 오류가 없으면 try내에 문장하고 finally문장 실행
  			검사문 실행문;
  		}catch(Exception e){	//검사해서 오류가 발생하면 처리 
  				예외처리 구문  ==> ex)입출력에서 에러가 났다 - IOException
 		}finally{	//예외유무와 무관하게 무조건 실행
  				실행 할 문
  			} // 검사 시 부모클래스 부터 - 큰거부터 작은걸로
  예2) main(String a[]) throws Exception{}
  
  예3) - 예외를 새로 생성 : new throw Exception("메세지 입력")				
  	
  
 */
