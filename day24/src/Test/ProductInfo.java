package Test;

import java.util.Scanner;

public class ProductInfo {

	// �����ʵ� ����
	static int productID = 0;	// ��ǰ ���� �ĺ���ȣ
	static int numberOfproduct = 0;	
	static Product [] p = new Product[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		while(choice != 3) {

			int type;
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >>");
			choice = sc.nextInt();

			switch (choice) {
			
			case 1 : // ��ǰ�߰�(1)
				
				if(numberOfproduct > p.length) {
					System.out.println("�� �̻� �߰� �� �� �����ϴ�.");
					break;
				}
				System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭå(3) >> ");
				type = sc.nextInt();
				
				if(type < 1 || type > 3) {
					System.out.println("�߸��� ��ǰ �����Դϴ�.");
					break;
				}
				addProduct(type);	// ��ǰ �߰� �޼ҵ�

			case 2 : // ��� ��ǰ ��ȸ(2)
				for(int i = 0; i < numberOfproduct; i++) {
					p[i].showInfo();
				}
				break;

			case 3 : // ������(3)
				System.out.println("�׸�~~");
				break;

			default : 
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}	// switch
		}	// while
	}	// main

	public static void addProduct(int type) {

		Scanner sc = new Scanner(System.in);

		System.out.println("��ǰ ���� >> ");
		String desc = sc.nextLine();

		System.out.println("������ >> ");
		String maker = sc.nextLine();

		System.out.println("���� >> ");
		int price = sc.nextInt();

		sc.nextLine();	// ���͸� ���ֱ� ����

		switch(type) {
		
		case 1 : // å

			System.out.println("å ���� >> ");
			String title = sc.nextLine();

			System.out.println("���� >> ");
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

		case 2 : // ���� CD

			System.out.print("�ٹ� ���� >> ");
			String albumTitle = sc.nextLine();

			System.out.print("���� >> ");
			String artist = sc.nextLine();

			p[numberOfproduct] = 
					new CompactDisc(productID++, desc, maker, 
							price, albumTitle, artist);
			break;

		case 3: // ȸȭå

			System.out.println("å ���� >> ");
			String title2 = sc.nextLine();

			System.out.println("���� >> ");
			String author2 = sc.nextLine();

			System.out.println("��� >> ");
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
