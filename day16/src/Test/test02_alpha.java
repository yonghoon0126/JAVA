package Test;
//����2)

//char�ڷ����� �迭�� ���ĺ� �빮�ڸ� ä���
//ä���� �迭�� ��ü ��Ҹ� ����Ͻÿ�
//��, char�ڷ����� �迭�� �����ϴ� ��������
//�ݺ����� ���� �ʱ�ȭ ��ų �� �ֵ��� �Ͻÿ�
//
//���)
//A B C D E.......Z
//char 65~90

public class test02_alpha {

	public static void main(String[] args) {

		char alpha[] = new char[26];

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) (65 + i);
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.printf("%2c", alpha[i]);
			System.out.print(alpha[i] + " ");
		}
	}
}
