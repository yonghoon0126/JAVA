package jang_2;

public class BitShiftOperator {
	public static void main(String[] args) {
		short a = (short) 0x55ff;
		short b = 0x00ff;

		// ��Ʈ ����
		// printf("������������", ����)
		// %c:����, %s:���ڿ�, %3d:����, %x:16����, %o:8����, %f:�Ǽ�
		// %b:b00lean
		// %��ġ$,������������ : %1$3d(��ġ1, 3���������� ���)
		System.out.printf("%x\n", a & b);	// ff
		System.out.printf("%x\n", a | b);	// 55ff
		System.out.printf("%x\n", a ^ b);	// 5500
		System.out.printf("%x\n", ~a);		// ffffaa00
		byte c = 20; // 0x14
		byte d = -8; // 0xf8

		// ����Ʈ ����
		System.out.println(c << 2); // c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >> 2); // c�� 2��Ʈ ������ ����Ʈ. 0 ����
		System.out.println(d >> 2); // d�� 2��Ʈ ���� ����Ʈ. 1 ����
		System.out.printf("%x\n", d >>> 2); // d�� 2��Ʈ ������ ����Ʈ. 0 ����

	}

}
