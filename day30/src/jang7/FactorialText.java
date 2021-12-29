package jang7;

//	되부름 함수(recursive function) : 자기 자신을 부름
//	Stack : 연산에 중간 값, 결과값, 매개변수 값, 되부름 함수들의 값 저장, 컴파일 영역
//	객체의 주소

public class FactorialText {

	private static int factorial(int n) {
		int result = 0;
		if(n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1);	//되부름 함수, n*(n-1)*(n-2)...(n-4)
		}
		return result;
	}
	
	public static void main(String[] args) {

	}

}
