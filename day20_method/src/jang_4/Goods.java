package jang_4;

public class Goods {
	String name = "생산품"; // 명시적 초기화
	int price; // 묵시적 초기화
	int numberOfStock;
	int sold;

public static void underline() {
	System.out.println("=====================================");
}

	public Goods() {
		System.out.println("디폴트 생성자...");
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
		Goods camera2 = new Goods("냉장고", 50000, 10, 5);

		// 초기화, 직접 접근, 값 저장(직접 접근)
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;

//		disp(camera);
//		disp(camera2);
		
		// 멤버변수값 인출(직접 접근)
		System.out.println("상품 이름 : " + camera.name);
		System.out.println("상품 가격 : " + camera.price);
		System.out.println("재고 수량 : " + camera.numberOfStock);
		System.out.println("팔린 수량 : " + camera.sold);
		underline();
		
		System.out.println("상품 이름 : " + camera2.name);
		System.out.println("상품 가격 : " + camera2.price);
		System.out.println("재고 수량 : " + camera2.numberOfStock);
		System.out.println("팔린 수량 : " + camera2.sold);
		underline();

		// setter()로 출력
		camera2.setName("세탁기");
		camera2.setPrice(500);
		camera2.setNumberOfStock(5);
		camera2.setSold(5);
		underline();

		// getter()로 출력
		System.out.println("상품 이름 : " + camera2.getName());
		System.out.println("상품 가격 : " + camera2.getPrice());
		System.out.println("재고 수량 : " + camera2.getNunberOfStock());
		System.out.println("팔린 수량 : " + camera2.getSold());
		underline();

//		private static void disp(Goods camera) {
//			System.out.println("상품 이름 : " + camera.getName());
//			System.out.println("상품 가격 : " + camera.getPrice());
//			System.out.println("재고 수량 : " + camera.getNunberOfStock());
//			System.out.println("팔린 수량 : " + camera.getSold());
//			underline();
//		}
//		private static void disp(Goods camera2) {
//			System.out.println("상품 이름 : " + camera2.getName());
//			System.out.println("상품 가격 : " + camera2.getPrice());
//			System.out.println("재고 수량 : " + camera2.getNunberOfStock());
//			System.out.println("팔린 수량 : " + camera2.getSold());
//			underline();
//		}
		
	}

}
