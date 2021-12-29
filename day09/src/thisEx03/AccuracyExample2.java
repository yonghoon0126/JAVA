package thisEx03;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		//					정수 * 10
		int totalPieces = apple * 10;
		int number = 7;
		// 정수	=		정수		-	정수
		int temp = totalPieces - number;
		// double	=	정수	/	실수
		double result = temp / 10.0;

		System.out.println("사과 한개에서 ");
		System.out.println(" 0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");

	}
}
