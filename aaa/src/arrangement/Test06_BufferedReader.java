package arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test06_BufferedReader {

//	문제5) 키보드로 이름과, 국어/영어/수학점수를 입력받아
//	총점을 구하여 아래처럼 출력하시오.(BufferedReader사용)
//	
//	이름을 입력하세요 : 오민경
//	국어 : 100
//	영어 : 90
//	수학 : 80
//	
//	=====[결과]=====
//	이름 : 오민경
//	국어점수 : 100
//	영어점수 : 90
//	수학점수 : 80
//	총점 : 270
	public static void main(String[] args) throws IOException {
		// BufferedReader 인스턴스 == 객체생성
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		//--'대'라는 문자를 BufferedReader를 통해 입력받을 경우
		//	2바이트로 구성되어 있기 때문에 1바이트씩 쪼갠다.
		//	InputStreamReader가 바이트 스트림을
		//	문자스트림으로 변환시켜주는 역할을 하게된다.
		//--new를 통해 heap 메모리 영역을 할당받아 올라간다
		//	이 경우 br은 reference type변수이다.
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		String name = "";
		//--String은?
		//	'A' : 문자 stack 영역에 저장
		//	"A" : 문자열 Heap 영역에 저장
		//--String 만큼은 new를 사용하여 메모리 영역을
		//	할당받지 않아도 사용 가능하다.
		//	int k, e, m, t(국, 영, 수, 총 점수 변수)
		//	stack 메모리 영역에 4바이트씩
		//	총 16바이트 올라간다.
		
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		//--사용자가 입력한 값(외부 데이터)를 받아와서 변수에 담아내기
		//--readLine()은?
		//	BufferedReader의 메소드로 한줄씩 입력받는다.
		//	숫자 입력은 못받는다. 오직 문자열만 입력받는다.
		//	read() 메소드로 입력 받을 경우
		//	[홍길동]은 3번을 입력받아야한다.
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(br.readLine());
		//--이 상황에서 국어점수 70점을 입력받았다고 가정할 때
		//	readLine()을 통해 입력받은 70은
		//	숫자가 아니라 문자열이다.
		//	숫자로 바꾸지 않으면 산술 연산이 불가능하다.
		//	즉, 문자형식의 숫자를 숫자 타입으로 바꾸어주는 것이다
		//	Integer.paseInt()를 통해 정수로 형 변환을 한다.
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 : ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.println("===[결과===");
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.println("총점 : "+(kor+eng+mat));
		
	}

}
