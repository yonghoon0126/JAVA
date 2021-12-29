package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

public class SawonProccessFinal {

	public static void main(String[] args) {

		// sawon.txt���� �о����
		String fileName = "src/Test/sawon.txt";

		// sawonResult.txt �����ϱ�
		String fileName2 = "src/Test/sawonResult.txt";

//============================================================================				
		
		try {
			// 1. ���Ͽ��� �о����(����
			FileReader fr = new FileReader(fileName);	

			// 2. ���ۿ��� �б�
			BufferedReader br = new BufferedReader(fr);	// src/Test/sawon.txt

			// 3. ����ϱ�
			FileWriter fw = new FileWriter(fileName2);	

			// 4. PrintWriter ��ü����
			PrintWriter pw = new PrintWriter(fw);	// src/Test/sawonResult.txt

			// 5. Calendar ��ü ������
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int day = cal.get(Calendar.DAY_OF_MONTH);


			// Ÿ��Ʋ�� sawonResult.txt ���Ͽ� ����
			pw.printf("     %s  �� ���Ի�� �� ����\n",year);
			pw.println("    -------------------------------");  
			pw.println("             ����: "+year+"�� "+ (month+1)+ "�� "+ day + "��");
			pw.println("�̸�  java jquery  html5 css3   total   avg");
			pw.println("---------------------------------------------");
			
			// ȭ�鿡 Ÿ��Ʋ�� ���
			System.out.printf("       %s  �� ���Ի�� �� ����\n",year);
			System.out.println("    ------------------------------");  
			System.out.println("               ����: "+year+"�� "+ (month+1)+ "�� "+ day + "��");
			System.out.println("\n�̸�  java jquery  html5 css3   total   avg\n");
			System.out.println("--------------------------------------------");
			
			String line = ""; // sawonResult.txt ���� �о�ͼ� ���� ����

			while (true) {
				line = br.readLine();
				if (line == null)
					break;

//				String str[] = line.split(",");	// �迭���� ,���� �� ����
//				
////========================================ȭ�鿡 ���
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
////========================================���Ͽ� ���
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
////========================================�� �κ��� ������ ��ȯ�� �� ������ ���
//				String name = str[0];
//				int java = Integer.parseInt(str[1]);	// ������ ��ȯ�ؼ� ����
//				int jquery = Integer.parseInt(str[2]);
//				int html5 = Integer.parseInt(str[3]);
//				int css3 = Integer.parseInt(str[4]);
//				int total = java + jquery + html5 + css3;
//				double avg = total / 4.;
					

//============================================================================				
				
				String str[] = line.split(",");
				String c = "";	// ,�� �� sawon������ �ִ� �迭�� ���� ����
				int total = 0;
				String name = str[0];
				
				// java jquery html5 css3 ���ؼ� total ���ϱ�	
				for(int i = 1; i < str.length; i++) {
					total += Integer.parseInt(str[i]);
					c += str[i] + " ";	// java jquery html5 css3
				}
				double avg = total / 4.;
				
				// sawonResult.txt�� ����
				pw.print(name + " " + c + total + " " + avg+ "\n");

				// ȭ�鿡 ���
				System.out.println(name + " " + c + total + " " + avg);
				System.out.println("----------------------------------------");
			}//while
			
			pw.flush();
			
			// �ڿ� ��ȯ
			br.close();
			fr.close();
			pw.close();
			fw.close();
				

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
