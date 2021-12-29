package Quiz;

/*1부터 10까지 짝수/홀수 합을 구하시오
 * 출력(while/if/break, 조건식으로 비교
 * 
 * 출력)
 * 2 4 6 8 10
 * 1~10까지 짝수의 합 : 30
 * 
 * 1 3 5 7 9
 * 1~10까지 홀수의 합 : 25
 * 
 * 1 2 3 4 5 6 7 8 9 10
 * 1~10까지 전체의 합 : 55
 */
public class Quiz02 {
	public static void main(String[] args) {

		int i=0;//증가변수
		int tot=0;//전체합계
		int otot=0;//홀수합계
		int etot=0;//짝수합계

		String s="";//전체 수 모임
		String s1="";//짝수 수 모임
		String s2="";//홀수 수 모임

		while(i<10) {
			i=i+1;
			if(i%2==0) {//짝수합과 짝수들의 집합
				etot += i;
				s1 += i + " ";
				System.out.print(i + " ");

			}else {
				otot += i;
				s2 += i + " ";
			}
			tot+=i;
			s += i + " ";
		}
		System.out.println(s1);
		System.out.println("\n 1~10까지 짝수의 합 : "+etot+"\n");
		System.out.println(s2);
		System.out.println("1~10까지 홀수의 합 : "+otot+"\n");
		System.out.println(s);
		System.out.println("1~10까지 전체 합 : "+tot);
	}
}