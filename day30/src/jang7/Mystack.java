package jang7;

class GStack<T> {	// Ŭ������ ���ʸ�
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {	// �Ű����� ���ʸ�
		if (tos == 10) // ���� á��?
			return;
		stck[tos] = item; // �� �ְ�, ��ġ ����
		tos++;
	}

	public T pop() {	// ��ȯ�� ���ʸ�
		if (tos == 0) // ��� �ֳ�?
			return null;
		tos--; // ��ġ ����, �� ����
		return (T) stck[tos];
	}
}

public class Mystack {

	public static void main(String[] args) {

		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");

		for (int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());


		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);

		for (int n = 0; n < 3; n++)
			System.out.println(intStack.pop());

	}

}
