package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testFileWriter {

	public static void main(String[] args) throws IOException {

		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("src/Test/data,txt");
		
		String str;
		while(!(str = sc.nextLine()).equals("0"))	// 0이 들어오면
			fw.write(str + "\n");
		
		fw.flush();
		fw.close();
		
		
		
		
	}

}
