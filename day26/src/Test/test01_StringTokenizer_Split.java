package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	문제1) 버퍼를 사용하여 키보드로 문자열을 입력 받아 콤마로 구분하여 아래와 같이
//	출력하시오
//	StringTokenizer사용하고 ,로 구분하시오
//	출력형식)
//	파싱할 문자열 입력[콤마 구분] : 파싱할, 문자열, 입력[콤마, 구분], : 
//		
//	파싱된 문자열 : 파싱할 문자열 입력[콤마 구분] : 


public class test01_StringTokenizer_Split {

	public static void main(String[] args) throws IOException {

		String strTemp;
		
		// 키보드
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파싱할 문자열 입력[콤마 구분] :");
		strTemp = br.readLine();	// 키보드에서 한줄 읽어오기
		
		
		
		// StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = 
				new StringTokenizer(strTemp, ",");
		System.out.print("파싱된 문자열 :");
		
		while(st.hasMoreTokens())
			System.out.print(st.nextToken());
		
		
		// split
		String str[] = strTemp.split(",");
		System.out.println("파싱된 문자열 :");
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " ");
		}
	}

}
