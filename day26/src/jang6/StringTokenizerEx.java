package jang6;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st = 
			new StringTokenizer
			("name=ȫ�浿/addr=��ȭ/addr=ȫ��/addr=����/addr=����", "/=");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
	}
}
