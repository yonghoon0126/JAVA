package test;
/*����2]
 * char�ڷ����� �迭�� ���ĺ� �빮�ڸ� ä���
 * ä���� �迭�� ��ü ��Ҹ� ����Ͻÿ�.
 * ��, char�ڷ����� �迭�� �����ϴ� �������� 
 * �ݺ����� ���� �ʱ�ȭ ��ų�� �ֵ��� �Ͻÿ�.
 * 
 * ���)
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
