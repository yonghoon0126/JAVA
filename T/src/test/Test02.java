package test;
/*문제2]
 * char자료형의 배열과 알파벳 대문자를 채우고
 * 채워진 배열의 전체 요소를 출력하시오.
 * 단, char자료형의 배열을 구성하는 과정에서 
 * 반복문을 통해 초기화 시킬수 있도록 하시오.
 * 
 * 출력)
 * A B C D E F..........Z
 * 
 * */
public class Test02 {

	public static void main(String[] args) {
		char[] arpha = new char[26];
		for (int i = 0; i < arpha.length; i++) {
			arpha[i]=(char)(65+i);
		}
		for (int i = 0; i < arpha.length; i++) {
			System.out.printf("%2c",arpha[i]);
		}
	}

}
