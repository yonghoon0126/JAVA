package jang6;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st = 
			new StringTokenizer
			("name=È«±æµ¿/addr=ÀåÈ­/addr=È«·Ã/addr=ÄáÁã/addr=ÆÏÁã", "/=");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}
}
