package Quiz;
/*1���� 100���� 2,3,4 ����� ��(while��)
 * 
 * ���)
 * 12 24 36 48 60 72 84 96
 * �� : 432
 */
public class Quiz03 {
	public static void main(String []args) {
		//100���� 1�� ����, 2,3,4�� ������� ���� ����		
		int i = 0;	//��������
		int tot = 0;	//��

		while(i < 100) {
			i++;	// i=i+1;
			//and(&):~�߿�, ~�̰�, ~�̸鼭, ��� ���̸� ��)
			if((i%2==0) & (i%3==0) & (i%4==0)) {
				tot += i;
				System.out.print(i+" ");
			} //if
		} //while
		System.out.print("\n�� : "+tot);

	}

}

