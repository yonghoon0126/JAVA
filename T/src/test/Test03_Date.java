package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*    - 서기 1년 1월 1일 :월요일
	  - 년도가 4의 배수이고, 100의 배수가 아니거나
	    400의 배수이면 2월은 29일(윤년)
	    나머지는 2월은 28일(평년)
	    
	   - 2021년 4월 달력을 그린다고 가정하면
	     1.1.1 ~ 2021.3.31(마지막날)까지의 전체 일 수를 구한다. 
	     그 일 수에 +1 연산을 수행하면(요일 확인)
	     4월 달력이 된다
	     
	  - 요일 = 전체일수 % 7
	    요일= 0->일요일.........6->토요일     
	출력)
	년도를 입력하세요 : 2021
    월을 입력하세요   : 4

	[2021년4월] 

   일  월   화  수   목  금   토
================================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30
==============================
 * 
 * */
public class Test03_Date {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//버퍼 만들어 주세요 br
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		//12달 중에서 각 달에 마지막을 일을 배열에 초기값을 설정해 주세요.
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		int y, m, w, ilsu;//년, 월, 요일, 일수
		
		do {//년도
			System.out.print("년도를 입력하세요: ");
			y=Integer.parseInt(br.readLine());
		}while(y<1);
		
		do {//월
			System.out.print("월을 입력하세요 :");
			m=Integer.parseInt(br.readLine());
		}while(m < 1 || m > 12);//0~11사이에 월 입력 받음
		 
		//1년 1월 1일~입력받은 년도 이전 년도의 12월 31일까지의 일수 계산
		//             년도/4  and  년도/100 or 년도/400
		ilsu=(y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		
		//입력받은 년도의 2월의 마지막 일 계산
		if( (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ) 
			days[1] =29;
		//해당 년도 1월부터 입력 받은 월 이전의 월의
		//마지막 날짜까지의 일 수 누적 연산
		for (int i = 0; i < (m-1) ; i++) {
			ilsu += days[i];
		}
		
		//입력 받은 월은 1일	
		ilsu +=1;
		
		//----------------------------------------------모든 일수 계산 끝
		//요일 계산
		//입력 받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = ilsu % 7;//0:일요일, 1:월요일, 2:화요일......6:토요일
		
		//달력 출력하기
		System.out.println();
		System.out.println("\t[" + y + "년" + m+ "월] \n");
		System.out.println();
		System.out.println("   일  월   화  수  목   금   토");
		System.out.println("================================");
		
		for(int i=1;i<=w;i++) {
			System.out.print("    ");//공백4칸 발생
		}
		for (int i = 1; i <= days[m-1]; i++) {
			System.out.printf("%4d",i);
			w++;//날짜가 증가하는 만큼 요일이 함께 증가
			
			//일요일 출력할 때 마다 줄 바꿈하고
			//출력할 수 있도록 처리
			if(w % 7 == 0)
				System.out.println();
		}
		
		//달의 마지막 날짜가 출력형식을 모두 채웠을 경우
		//이미 일요일 개행이 이루어졌기 때문에
		//이 경우는 개행을 하지 않도록 처리
		if( w % 7 !=0 )
			System.out.println();
		
		System.out.println("==============================");
	}

}
