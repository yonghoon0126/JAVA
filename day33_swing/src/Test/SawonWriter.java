package Test;

import java.io.FileWriter;
import java.io.PrintWriter;

public class SawonWriter {

	public static void main(String[] args) {

		// sawon.txt에 저장하기
		String fileName = "src/Test/sawon.txt";

		try {
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);	// fileName

			pw.println("a1,90,90,90,90");
			pw.println("a2,80,80,98,80");
			pw.println("a3,70,70,70,70");
			System.out.println("sawon.txt에 저장되었습니다.");

			pw.close();
			fw.close();

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
