package jang6;

//	상속받아 추상메소드를 구현해야 하지만
//	Calendar는 Calendar의 getInstance()를 호출해서
//	가상머신에서 Calendar class의 인스턴스를 생성해서 사용함.
//	Singletone-pattern = factory pattern : 
//	day22 참고

import java.util.Calendar;

public class CalendarEx {
	
	public static void printCalendar(String msg, Calendar cal) {

	int year = cal.get(Calendar.YEAR);
	
	// get()은 0~30까지의 정수 리턴
	int month = cal.get(Calendar.MONTH) +1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	int hour = cal.get(Calendar.HOUR);
	
	int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
	int ampm = cal.get(Calendar.AM_PM);
	int minute = cal.get(Calendar.MINUTE);	    
    int second = cal.get(Calendar.SECOND);
    int millisecond = cal.get(Calendar.MILLISECOND);

    System.out.print(msg + year + "/" + month + "/" + day + "/");	// 현재날짜
    
    
    switch(dayOfWeek) {	// 일요일 1~7(토요일)
    case Calendar.SUNDAY : System.out.print("일요일"); break;
    case Calendar.MONDAY : System.out.print("월요일"); break;
    case Calendar.TUESDAY : System.out.print("화요일"); break;
    case Calendar.WEDNESDAY : System.out.print("수요일"); break;
    case Calendar.THURSDAY : System.out.print("목요일"); break;
    case Calendar.FRIDAY : System.out.print("금요일"); break;
    case Calendar.SATURDAY : System.out.print("토요일"); break;
    }
    System.out.print("(" + hourOfDay + "시)");	// 현재요일 + 시간
	
    if(ampm == Calendar.AM)
    	System.out.print("오전");
    else
    	System.out.print("오후");
    System.out.println(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초");
	}

	public static void main(String[] args) {

		// 객체 얻어오기
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // 2021년 8월 8일. 12월을 표현하기 위해 month에 8로 설정
		
		firstDate.set(2021, 8, 8);
		firstDate.set(Calendar.HOUR_OF_DAY, 9); // 저녁 20시
		firstDate.set(Calendar.MINUTE, 30); // 30분
		printCalendar("처음 데이트한 날은 ", firstDate);
		
	}

}
