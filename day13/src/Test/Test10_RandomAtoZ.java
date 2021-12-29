package Test;

//문제10)
//Random클래스를 이용해
//알파벳 대문자 중에서
//무작위로 추출하여 출력하시오.(for문 이용)
//
//출력)
//
//G	A	O	P	B
//G	A	O	P	B
//G	A	O	P	B

public class Test10_RandomAtoZ {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 3; j++) {
				
		      char c = (char) ((Math.random() * 26) + 65);
		      System.out.print(c + " ");
		    }
	}

}
