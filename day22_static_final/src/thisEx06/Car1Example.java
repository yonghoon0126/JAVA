package thisEx06;

public class Car1Example {

	public static void main(String[] args) {

		Car1 car1 = new Car1();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car1 car2 = new Car1("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		Car1 car3 = new Car1("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		Car1 car4 = new Car1("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();

	}
}

//- �޼ҵ� �ߺ� Overloading : �޼ҵ��̸��� ���ƾ���, �޼ҵ��̸� ������(���ų� �ٸ��ų� ����),
//�޼ҵ� �������� Ÿ��, ����,������ ��� ���ƾ� �Ѵ�.��Ӱ��� ����, 
//�ϳ��� �޼ҵ������ �پ��� �۾��� �� �� �ִ�.(�پ缺)
//
//- �޼ҵ� ������ Overring : �� ��� ���迡 �־�� �Ѵ�. 
//�θ��� �޼ҵ带 �ڽ��� �����ؼ� ����,(������)�� ���� ����(�پ��� ��ü�� ������)
//
//�޼ҵ� ������ ���� : ���������ڰ� �θ�� ���ų� Ŀ���ϰ�, ���������ڸ� ������ ��� �ñ״��Ĵ� �����ؾ� �Ѵ�.