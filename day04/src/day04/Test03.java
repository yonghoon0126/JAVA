



package day04;
/*출력)
 * 국어점수 :20 
 * 영어점수 :20
 * 수학점수 :20
 * 총점    :60
 * 평균    :20
 * */
public class Test03 {
	public static void main(String [] args) {
		//변수 선언 초기화
		int kor=20;
		int eng=20;
		int mat=20;
		int tot=0;
		float avg=0;
		tot=kor+eng+mat;
		//avg=tot/(float)3;
		avg=tot/3.f;//정수=정수/정수, 실수=실수/정수, 실수=정수/실수
		//출력해 주세요.println()
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+mat);
		System.out.println("총점    : "+tot);
		System.out.println("평균    : "+avg);
		//print()
		System.out.print("\n\n국어점수 : "+kor);
		System.out.print("\n영어점수 : "+eng);
		System.out.print("\n수학점수 : "+mat);
		System.out.print("\n총점    : "+tot);
		System.out.print("\n평균    : "+avg);
		
		//printf()
		System.out.printf("\n\n국어점수 : %d ",kor);
		System.out.printf("\n영어점수 : %d ", eng);
		System.out.printf("%n수학점수 : %d ", mat);
		System.out.printf("\n총점    : %d ", tot);
		System.out.printf("\n평균    : %f ", avg);
		
	}
}



