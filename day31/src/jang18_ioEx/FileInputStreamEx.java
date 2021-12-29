package jang18_ioEx;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/jang8_ioEX/data.txt");
//			fin = new FileInputStream("c:\\windows\\system.ini");

			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류" + e.getMessage());
		}

	}

}

//	; for 16-bit app support
//	[386Enh]
//	woafont=dosapp.fon
//	EGA80WOA.FON=EGA80WOA.FON
//	EGA40WOA.FON=EGA40WOA.FON
//	CGA80WOA.FON=CGA80WOA.FON
//	CGA40WOA.FON=CGA40WOA.FON
//	
//	[drivers]
//	wave=mmdrv.dll
//	timer=timer.drv
//	
//	[mci]
