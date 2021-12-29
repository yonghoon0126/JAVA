package jang7;

class GStack<T> {	// 클래스도 제너릭
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {	// 매개변수 제너릭
		if (tos == 10) // 가득 찼냐?
			return;
		stck[tos] = item; // 값 넣고, 위치 증가
		tos++;
	}

	public T pop() {	// 반환형 제너릭
		if (tos == 0) // 비어 있냐?
			return null;
		tos--; // 위치 빼고, 값 삭제
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
