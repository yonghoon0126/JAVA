package thisEx06;

public class Car1Example {

	public static void main(String[] args) {

		Car1 car1 = new Car1();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car1 car2 = new Car1("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car1 car4 = new Car1("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();

	}
}

//- 메소드 중복 Overloading : 메소드이름이 같아야함, 메소드이름 왼쪽은(같거나 다르거나 무관),
//메소드 오른쪽은 타입, 개수,순서가 모두 같아야 한다.상속관계 무관, 
//하나의 메소드명으로 다양한 작업을 할 수 있다.(다양성)
//
//- 메소드 재정의 Overring : 꼭 상속 관계에 있어야 한다. 
//부모의 메소드를 자식이 수정해서 정의,(다형성)과 관계 있음(다양한 객체를 전달함)
//
//메소드 재정의 조건 : 접근지정자가 부모와 같거나 커야하고, 접근지정자를 제외한 모든 시그니쳐는 동일해야 한다.