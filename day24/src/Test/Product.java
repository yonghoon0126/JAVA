package Test;

//	Product클래스 : 각 상품의 고유한 식별자, 상품 설명, 생산자, 가격 정보를 포함하고 있다.
//	Book 클래스 : ISBN번호, 저자, 책 제목 정보를 포함한다.
//	CompacDisc클래스 : 앨범제목, 가수 이름정보를 포함한다.
//	ConversationBook : 회화책 에서 다루는 언어명 정보를 포함한다.
//	객체 지향 개념에 부합하도록 적절한 접근지정자, 필드, 메소드, 생성자 등을 작성하시오.
//	ProductionInfo(main)클래스를 만든다. main에서 최대 5개의 상품을 추가할 수 있고,
//	모든 상품의 정보를 조회 할 수 있다.
//	모든 제품에 대한 정보를 출력 할 때 Product 타입의 변수를 이용하시오.
//	
//	출력형식)
//	상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> 1
//	상품 종류 책(1), 음악CD(2), 회화책(3) >> 1
//	상품 설명>> 자바책
//	생산자>> 한빛미디어
//	가격>> 20000
//	책 제목>> 자바를 배우자
//	저자>> 홍길동
//	ISBN>> 3333
//	
//	-----------------------------------
//	
//	상품ID>>0
//	상품 설명>>자바책
//	생산자>>한빛미디어
//	가격>>20000
//	ISBN>> 3333
//	책제목>> 자바를 배우자
//	생산자>> 홍길동
//	상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> 2
//	
//	-----------------------------------
//	
//	상품ID>>0
//	상품 설명>>자바책
//	생산자>>한빛미디어
//	가격>>20000
//	ISBN>> 3333
//	책제목>> 자바를 배우자
//	생산자>> 홍길동
//	상품 추가(1), 모든 상품 조회(2), 끝내기(3) >> 3
//	그만~~

public class Product {

	// 필드 선언
	private int productID = 0; // 상품 고유 식별번호
	private String description; // 상품 설명
	private String maker; // 생산자
	private int price; // 가격정보

	// 생성자를 통해 초기화 선언

	public Product(int productId, String description, 
			String maker, int price) {

		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		
		System.out.println("-------------------------------------");
		System.out.println("상품 ID >> " + productID);
		System.out.println("상품 설명 >> " + description);
		System.out.println("생산자 >> " + maker);
		System.out.println("가격 >> " + price);
		
		System.out.println("");
	}
	
}