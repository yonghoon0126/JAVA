package day04;

public class CircleArea {

	public static void main(String[] args) {
		final double PI=3.14;//상수화 된 변수, 값 고정
		double radius=10;
		double circleArea=0;
		//PI=3;//재 할당 불가
		circleArea=radius*radius*PI;
		
		System.out.print("\n원의 면적= ");
		System.out.println(circleArea);
	}

}
