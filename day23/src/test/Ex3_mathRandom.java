package test;

//[�䱸����-3] 1~10����(1�� 10 ����)�� ���� �� �������� 5���� ���ڸ� 
//����� ũ�Ⱑ 5�� �迭numbers�� ���, �հ踦 ���Ͻÿ�.
//
//�������)
//numbers[0] = ?
//...
//numbers[4] = ?
//
//numbers[0]~numbers[4] �� �� = ?
		
public class Ex3_mathRandom {

	public static void main(String[] args) {

		int num[] = new int [5]; 
		
		int sum = 0;
		int n = 0;
		
		for(int i = 0; i < num.length; i++) {
			n = (int)Math.random()*10 +1 ;
			System.out.printf("numbers[%d] = %d%n", i, n);
			sum += n;
		}
		
		System.out.println("numbers[0] ~ numbers[4] �� ��? = " + sum);
	}

}
