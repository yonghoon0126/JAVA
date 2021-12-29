package Test;

import java.util.Random;

//문제)
//2차원 배열을 생성하여
//모든 요소를 0~99까지
//난수로 채우기
//
//출력)
//행수 : 2
//열수 : 3
//x[0][0] = 92
//x[0][1] = ?
//x[0][2] = ?
//x[1][0] = ?
//x[1][1] = ?
//x[1][2] = ?

public class test04_MathRandom {

	public static void main(String[] args) {

		
		int i = 0;
		int j = 0;
		int aa[][] = new int[2][3];
		
		System.out.println("행수 : 2");
		System.out.println("열수 : 3");
		for(i = 0; i < aa.length; i++) {
			for(j = 0; j < aa[i].length; j++) {
				int r = (int)(Math.random()*100) + 1;
				System.out.printf("x[%d][%d] = %d%n", i, j, r);	
			}
			
		}
	}

}
