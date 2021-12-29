package Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class SawonReader {

	public static void main(String[] args) throws Exception {

		// sawon.txt���� �о����
		String fileName = "src/Test/sawon.txt";
		
		// fileReader, BufferedReader �̿��ؼ� ȭ�鿡 ���� ���� ���
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		// while(), readLine()�̿�
		String c;
		
		while( (c = br.readLine()) != null) {
			System.out.print(c);
		}
		
		fr.close();
		br.close();
	}

}


