



package day04;
/*���)
 * �������� :20 
 * �������� :20
 * �������� :20
 * ����    :60
 * ���    :20
 * */
public class Test03 {
	public static void main(String [] args) {
		//���� ���� �ʱ�ȭ
		int kor=20;
		int eng=20;
		int mat=20;
		int tot=0;
		float avg=0;
		tot=kor+eng+mat;
		//avg=tot/(float)3;
		avg=tot/3.f;//����=����/����, �Ǽ�=�Ǽ�/����, �Ǽ�=����/�Ǽ�
		//����� �ּ���.println()
		System.out.println("�������� : "+kor);
		System.out.println("�������� : "+eng);
		System.out.println("�������� : "+mat);
		System.out.println("����    : "+tot);
		System.out.println("���    : "+avg);
		//print()
		System.out.print("\n\n�������� : "+kor);
		System.out.print("\n�������� : "+eng);
		System.out.print("\n�������� : "+mat);
		System.out.print("\n����    : "+tot);
		System.out.print("\n���    : "+avg);
		
		//printf()
		System.out.printf("\n\n�������� : %d ",kor);
		System.out.printf("\n�������� : %d ", eng);
		System.out.printf("%n�������� : %d ", mat);
		System.out.printf("\n����    : %d ", tot);
		System.out.printf("\n���    : %f ", avg);
		
	}
}



