package Test;

// ISBN��ȣ, ����, å ����
public class Book extends Product{

	private int ISBN;	// ISBN��ȣ
	private String title;	// å ����
	private String author ;	// ����

	public Book(int productID, String description, String maker, int price, 
			int ISBN, String title, String author) {
		
		super(productID, description, maker, price);
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("-------------------------------------");
		System.out.println("ISBN >> " + ISBN);
		System.out.println("å ���� >> " + title);
		System.out.println("������ >> " + author + "\n");
	}
	
}
