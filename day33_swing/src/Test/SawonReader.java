package Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class SawonReader {

	public static void main(String[] args) throws Exception {

		// sawon.txt파일 읽어오기
		String fileName = "src/Test/sawon.txt";
		
		// fileReader, BufferedReader 이용해서 화면에 위와 같이 출력
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		// while(), readLine()이용
		String c;
		
		while( (c = br.readLine()) != null) {
			System.out.print(c);
		}
		
		fr.close();
		br.close();
	}

}


