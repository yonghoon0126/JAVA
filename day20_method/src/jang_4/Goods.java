package jang_4;

public class Goods {
	String name = "����ǰ"; // ����� �ʱ�ȭ
	int price; // ������ �ʱ�ȭ
	int numberOfStock;
	int sold;

public static void underline() {
	System.out.println("=====================================");
}

	public Goods() {
		System.out.println("����Ʈ ������...");
	}
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}

	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNunberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}

//========================================main===============================
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		Goods camera2 = new Goods("�����", 50000, 10, 5);

		// �ʱ�ȭ, ���� ����, �� ����(���� ����)
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;

//		disp(camera);
//		disp(camera2);
		
		// ��������� ����(���� ����)
		System.out.println("��ǰ �̸� : " + camera.name);
		System.out.println("��ǰ ���� : " + camera.price);
		System.out.println("��� ���� : " + camera.numberOfStock);
		System.out.println("�ȸ� ���� : " + camera.sold);
		underline();
		
		System.out.println("��ǰ �̸� : " + camera2.name);
		System.out.println("��ǰ ���� : " + camera2.price);
		System.out.println("��� ���� : " + camera2.numberOfStock);
		System.out.println("�ȸ� ���� : " + camera2.sold);
		underline();

		// setter()�� ���
		camera2.setName("��Ź��");
		camera2.setPrice(500);
		camera2.setNumberOfStock(5);
		camera2.setSold(5);
		underline();

		// getter()�� ���
		System.out.println("��ǰ �̸� : " + camera2.getName());
		System.out.println("��ǰ ���� : " + camera2.getPrice());
		System.out.println("��� ���� : " + camera2.getNunberOfStock());
		System.out.println("�ȸ� ���� : " + camera2.getSold());
		underline();

//		private static void disp(Goods camera) {
//			System.out.println("��ǰ �̸� : " + camera.getName());
//			System.out.println("��ǰ ���� : " + camera.getPrice());
//			System.out.println("��� ���� : " + camera.getNunberOfStock());
//			System.out.println("�ȸ� ���� : " + camera.getSold());
//			underline();
//		}
//		private static void disp(Goods camera2) {
//			System.out.println("��ǰ �̸� : " + camera2.getName());
//			System.out.println("��ǰ ���� : " + camera2.getPrice());
//			System.out.println("��� ���� : " + camera2.getNunberOfStock());
//			System.out.println("�ȸ� ���� : " + camera2.getSold());
//			underline();
//		}
		
	}

}
