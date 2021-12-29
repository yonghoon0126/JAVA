package thisEx04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 받아서
//부장 - 700
//과장 - 500
//이외 - 300
//string - position

public class SwitchStringExample {
	public static void main(String[] args) throws IOException{

		// Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		String position = " ";
//		int money = 0;
//
//		while (true) {
//			System.out.println("[직책을 쓰세요]");
//			position = sc.next();
//
//			if (position.equals("끝")) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			switch (position) {
//
//			case "부장":
//				money = 700;
//				break;
//
//			case "과장":
//				money = 500;
//				break;
//
//			default:
//				money = 300;
//			}

			// BufferedReader 사용
			
		
			
			
			String position = " ";
			int money = 0;

			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("[직책을 쓰세요]");
				position = br.readLine();
				
				if (position.equals("끝")) {
					System.out.println("종료되었습니다.");
					break;
				}
				switch (position) {

				case "부장":
					money = 700;
					break;

				case "과장":
					money = 500;
					break;

				default:
					money = 300;
				}

			
			System.out.println();
		}

	}

}
