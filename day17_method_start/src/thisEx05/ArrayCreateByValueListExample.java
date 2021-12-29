package thisEx05;

import java.util.Scanner;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		int[] score = new int[] {83, 90, 87};
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		
		String[] name;	// null
		name = new String[] {"a","a"};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.printf("score[%d] = %d %n", i, score[i]);
		}
		
		// for each¹®
		int n = 0;
		for(int i :score) {
			sum += i;
			System.out.printf("score[%d] = %d %n", n++, i);
		}
		
		System.out.println("ÃÑÇÕ : " + sum);

		double avg = (double) sum / score.length;
		System.out.println("Æò±Õ : " + avg);
	}

}
