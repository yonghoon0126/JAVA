package Test;

import java.util.Scanner;

public class ProductInfo {

	// 정적필드 선언
	static int productID = 0;	// 상품 고유 식별번호
	static int numberOfproduct = 0;	
	static Product [] p = new Product[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		while(choice != 3) {

			int type;
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >>");
			choice = sc.nextInt();

			switch (choice) {
			
			case 1 : // 상품추가(1)
				
				if(numberOfproduct > p.length) {
					System.out.println("더 이상 추가 할 수 없습니다.");
					break;
				}
				System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3) >> ");
				type = sc.nextInt();
				
				if(type < 1 || type > 3) {
					System.out.println("잘못된 상품 종류입니다.");
					break;
				}
				addProduct(type);	// 상품 추가 메소드

			case 2 : // 모든 상품 조회(2)
				for(int i = 0; i < numberOfproduct; i++) {
					p[i].showInfo();
				}
				break;

			case 3 : // 끝내기(3)
				System.out.println("그만~~");
				break;

			default : 
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}	// switch
		}	// while
	}	// main

	public static void addProduct(int type) {

		Scanner sc = new Scanner(System.in);

		System.out.println("상품 설명 >> ");
		String desc = sc.nextLine();

		System.out.println("생산자 >> ");
		String maker = sc.nextLine();

		System.out.println("가격 >> ");
		int price = sc.nextInt();

		sc.nextLine();	// 엔터를 없애기 위함

		switch(type) {
		
		case 1 : // 책

			System.out.println("책 제목 >> ");
			String title = sc.nextLine();

			System.out.println("저자 >> ");
			String author = sc.nextLine();

			System.out.println("ISBN >> ");
			int ISBN = sc.nextInt();

			//			(int productID, String description, String maker, 
			//			int price, int ISBN, String title, String author,
			//			String language)
			
			p[numberOfproduct] = 
					new Book(productID++, desc, 
							maker, price, ISBN, title, author );


			break;

		case 2 : // 음악 CD

			System.out.print("앨범 제목 >> ");
			String albumTitle = sc.nextLine();

			System.out.print("가수 >> ");
			String artist = sc.nextLine();

			p[numberOfproduct] = 
					new CompactDisc(productID++, desc, maker, 
							price, albumTitle, artist);
			break;

		case 3: // 회화책

			System.out.println("책 제목 >> ");
			String title2 = sc.nextLine();

			System.out.println("저자 >> ");
			String author2 = sc.nextLine();

			System.out.println("언어 >> ");
			String language = sc.nextLine();

			System.out.println("ISBN >> ");
			int ISBN2 = sc.nextInt();

			p[numberOfproduct] = 
					new ConversationBook(productID++, desc, maker, price,
							ISBN2, title2, author2, language);
			break;
		}	// switch

		numberOfproduct++;

	};	// addProduct
}	// class
