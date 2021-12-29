package Test;

//	ProductŬ���� : �� ��ǰ�� ������ �ĺ���, ��ǰ ����, ������, ���� ������ �����ϰ� �ִ�.
//	Book Ŭ���� : ISBN��ȣ, ����, å ���� ������ �����Ѵ�.
//	CompacDiscŬ���� : �ٹ�����, ���� �̸������� �����Ѵ�.
//	ConversationBook : ȸȭå ���� �ٷ�� ���� ������ �����Ѵ�.
//	��ü ���� ���信 �����ϵ��� ������ ����������, �ʵ�, �޼ҵ�, ������ ���� �ۼ��Ͻÿ�.
//	ProductionInfo(main)Ŭ������ �����. main���� �ִ� 5���� ��ǰ�� �߰��� �� �ְ�,
//	��� ��ǰ�� ������ ��ȸ �� �� �ִ�.
//	��� ��ǰ�� ���� ������ ��� �� �� Product Ÿ���� ������ �̿��Ͻÿ�.
//	
//	�������)
//	��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >> 1
//	��ǰ ���� å(1), ����CD(2), ȸȭå(3) >> 1
//	��ǰ ����>> �ڹ�å
//	������>> �Ѻ��̵��
//	����>> 20000
//	å ����>> �ڹٸ� �����
//	����>> ȫ�浿
//	ISBN>> 3333
//	
//	-----------------------------------
//	
//	��ǰID>>0
//	��ǰ ����>>�ڹ�å
//	������>>�Ѻ��̵��
//	����>>20000
//	ISBN>> 3333
//	å����>> �ڹٸ� �����
//	������>> ȫ�浿
//	��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >> 2
//	
//	-----------------------------------
//	
//	��ǰID>>0
//	��ǰ ����>>�ڹ�å
//	������>>�Ѻ��̵��
//	����>>20000
//	ISBN>> 3333
//	å����>> �ڹٸ� �����
//	������>> ȫ�浿
//	��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >> 3
//	�׸�~~

public class Product {

	// �ʵ� ����
	private int productID = 0; // ��ǰ ���� �ĺ���ȣ
	private String description; // ��ǰ ����
	private String maker; // ������
	private int price; // ��������

	// �����ڸ� ���� �ʱ�ȭ ����

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
		System.out.println("��ǰ ID >> " + productID);
		System.out.println("��ǰ ���� >> " + description);
		System.out.println("������ >> " + maker);
		System.out.println("���� >> " + price);
		
		System.out.println("");
	}
	
}