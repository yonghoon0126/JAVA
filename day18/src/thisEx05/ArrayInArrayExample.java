package thisEx05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		// 00->0
		// -------------------------------------------------------수학

		int[][] mathScores = new int[2][3]; // 정방 행렬
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();

		// -------------------------------------------------------영어

		int[][] englishScores = new int[2][]; // 비정방행렬 : 행고정, 열 생략
		englishScores[0] = new int[2]; // 0행의 열의 갯수만큼 메모리 생성
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println();

		// -------------------------------------------------------자바

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } }; // 비정방행렬 : 행/열의 갯수 자유
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}
		// -------------------------------------------------------주소치환
		System.out.println("\n\n주소 치환해서 메소드 호출하여 출력하기------");
		englishScores = javaScores; // 주소를 치환
		disp(englishScores); // 주소값 전송 후
		
		// 주소값주고 호출을 하여 계산처리(합)/출력을 한 후 처리된 합을 갖고 와서 메인에 출력하기
		System.out.println();
		int sum = disp2(englishScores);
		System.out.println("합 : " + sum);
		// 합계 출력 --> 합 : 443
	}

	public static int disp2(int[][] englishScores) {

		// 주소치환해서 메소드호출하여 출력하기(반환형o)-------------------------
		int sum = 0;
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
				sum += englishScores[i][k];
			}
		}
		return sum;
	}

	public static void disp(int[][] englishScores) { // 주소값 받아서 EnglishScores내용물 출력

		// 주소치환해서 메소드호출하여 출력하기(반환형x)-------------------------
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
	}
}