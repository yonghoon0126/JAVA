package Test;

//����10)
//RandomŬ������ �̿���
//���ĺ� �빮�� �߿���
//�������� �����Ͽ� ����Ͻÿ�.(for�� �̿�)
//
//���)
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
