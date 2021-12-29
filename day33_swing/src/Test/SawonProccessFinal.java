package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

public class SawonProccessFinal {

	public static void main(String[] args) {

		// sawon.txt파일 읽어오기
		String fileName = "src/Test/sawon.txt";

		// sawonResult.txt 저장하기
		String fileName2 = "src/Test/sawonResult.txt";

//============================================================================				
		
		try {
			// 1. 파일에서 읽어오기(파일
			FileReader fr = new FileReader(fileName);	

			// 2. 버퍼에서 읽기
			BufferedReader br = new BufferedReader(fr);	// src/Test/sawon.txt

			// 3. 출력하기
			FileWriter fw = new FileWriter(fileName2);	

			// 4. PrintWriter 객체생성
			PrintWriter pw = new PrintWriter(fw);	// src/Test/sawonResult.txt

			// 5. Calendar 객체 얻어오기
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int day = cal.get(Calendar.DAY_OF_MONTH);


			// 타이틀만 sawonResult.txt 파일에 저장
			pw.printf("     %s  년 신입사원 평가 점수\n",year);
			pw.println("    -------------------------------");  
			pw.println("             평가일: "+year+"년 "+ (month+1)+ "월 "+ day + "일");
			pw.println("이름  java jquery  html5 css3   total   avg");
			pw.println("---------------------------------------------");
			
			// 화면에 타이틀만 출력
			System.out.printf("       %s  년 신입사원 평가 점수\n",year);
			System.out.println("    ------------------------------");  
			System.out.println("               평가일: "+year+"년 "+ (month+1)+ "월 "+ day + "일");
			System.out.println("\n이름  java jquery  html5 css3   total   avg\n");
			System.out.println("--------------------------------------------");
			
			String line = ""; // sawonResult.txt 파일 읽어와서 담을 변수

			while (true) {
				line = br.readLine();
				if (line == null)
					break;

//				String str[] = line.split(",");	// 배열에서 ,빼고 값 저장
//				
////========================================화면에 출력
//				System.out.print(str[0] + "	");	
//				System.out.print(str[1] + "	");	// java
//				System.out.print(str[2] + "	");	// jquery
//				System.out.print(str[3] + "	");	// html5
//				System.out.print(str[4] + "	");	// css3
//				System.out.println();
//				while(true) {
//					for(int i = 0; i < str.length; i++) {
//						System.out.println(str[i]);
//					}
//					System.out.println();
//				}
////========================================파일에 출력
//				pw.print(str[0] + "	");
//				pw.print(str[1] + "	");
//				pw.print(str[2] + "	");
//				pw.print(str[3] + "	");
//				pw.print(str[4] + "	");
//				System.out.println();
//				while(true) {
//					for(int i = 0; i < str.length; i++) {
//						pw.print(str[i]);
//					}
//					System.out.println();
//				}	
////========================================이 부분을 정수로 변환한 후 변수에 담고
//				String name = str[0];
//				int java = Integer.parseInt(str[1]);	// 정수로 변환해서 저장
//				int jquery = Integer.parseInt(str[2]);
//				int html5 = Integer.parseInt(str[3]);
//				int css3 = Integer.parseInt(str[4]);
//				int total = java + jquery + html5 + css3;
//				double avg = total / 4.;
					

//============================================================================				
				
				String str[] = line.split(",");
				String c = "";	// ,를 뺀 sawon내용이 있는 배열을 담을 변수
				int total = 0;
				String name = str[0];
				
				// java jquery html5 css3 더해서 total 구하기	
				for(int i = 1; i < str.length; i++) {
					total += Integer.parseInt(str[i]);
					c += str[i] + " ";	// java jquery html5 css3
				}
				double avg = total / 4.;
				
				// sawonResult.txt에 저장
				pw.print(name + " " + c + total + " " + avg+ "\n");

				// 화면에 출력
				System.out.println(name + " " + c + total + " " + avg);
				System.out.println("----------------------------------------");
			}//while
			
			pw.flush();
			
			// 자원 반환
			br.close();
			fr.close();
			pw.close();
			fw.close();
				

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
