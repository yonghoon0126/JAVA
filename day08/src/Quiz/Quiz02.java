package Quiz;

/*1���� 10���� ¦��/Ȧ�� ���� ���Ͻÿ�
 * ���(while/if/break, ���ǽ����� ��
 * 
 * ���)
 * 2 4 6 8 10
 * 1~10���� ¦���� �� : 30
 * 
 * 1 3 5 7 9
 * 1~10���� Ȧ���� �� : 25
 * 
 * 1 2 3 4 5 6 7 8 9 10
 * 1~10���� ��ü�� �� : 55
 */
public class Quiz02 {
	public static void main(String[] args) {

		int i=0;//��������
		int tot=0;//��ü�հ�
		int otot=0;//Ȧ���հ�
		int etot=0;//¦���հ�

		String s="";//��ü �� ����
		String s1="";//¦�� �� ����
		String s2="";//Ȧ�� �� ����

		while(i<10) {
			i=i+1;
			if(i%2==0) {//¦���հ� ¦������ ����
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
		System.out.println("\n 1~10���� ¦���� �� : "+etot+"\n");
		System.out.println(s2);
		System.out.println("1~10���� Ȧ���� �� : "+otot+"\n");
		System.out.println(s);
		System.out.println("1~10���� ��ü �� : "+tot);
	}
}