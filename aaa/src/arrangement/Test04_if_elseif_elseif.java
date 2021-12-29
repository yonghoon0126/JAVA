package arrangement;

import java.util.Scanner;

public class Test04_if_elseif_elseif {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while(true) {
			String c = "철수";
			String y = "영희";
			
			
		System.out.print(c + " >> ");
		c = s.next();

		System.out.print(y + " >> ");
		y = s.next();

		if (c.equals("가위")) {
			if(y.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(c.equals("바위")){
				System.out.println("철수가 겼습니다.");
			}else{
					System.out.println("철수가 이겼습니다.");
				}
		}else if (c.equals("바위")) {
			if(y.equals("가위")) {
				System.out.println("철수가 졌습니다.");

			}else if(y.equals("바위")){
				System.out.println("비겼습니다.");

			}else{
					System.out.println("철수가 이겼습니다.");
			}

		}else if (c.equals("보")) {
			if(y.equals("가위")) {
				System.out.println("철수가 졌습니다.");

			}else if(y.equals("바위")){
				System.out.println("철수가 이겼습니다.");

			}else{
					System.out.println("비겼습니다.");
				}

		}//if
		
		}
	}//main

}
