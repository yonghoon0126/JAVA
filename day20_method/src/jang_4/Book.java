package jang_4;

public class Book {

	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	// ����Ʈ ������
	public Book() {

	}

	// set
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	// get
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getISBN() {
		return ISBN;
	}

// ==========================main===================================

	public static void main(String[] args) {

		Book javaBook = new Book("Java JDk", "Ȳ����", 3333);

		// javaBook2�� ������� �ʱ�ȭ
		Book javaBook2 = new Book();

		// static
		Book javaBook3 = new Book("Java", "��浿", 4321);

		javaBook2.title = "�ڹ�";
		javaBook2.author = "ȫ�浿";
		javaBook2.ISBN = 1234;

		// ���
		// System.out.println("å ���� : " + javaBook.title);
		// System.out.println("���� : " + javaBook.author);
		// System.out.println("���ڵ� : " + javaBook.ISBN);
		//
		// System.out.println("å ���� : " + javaBook2.title);
		// System.out.println("���� : " + javaBook2.author);
		// System.out.println("���ڵ� : " + javaBook2.ISBN);

		// �޼ҵ� ȣ��()
		javaBook.disp(javaBook);
		javaBook2.disp2(javaBook2);

		// static
		javaBook3.staticDisp(javaBook3);
		// staticDisp(javaBook3);

		// set
		javaBook3.setTitle("JRE");
		javaBook3.setAuthor("�Ѹ�");
		javaBook3.setISBN(5678);

		staticDisp(javaBook3);

		// get
		staticDisp(javaBook3);
		System.out.println("å ���� : " + javaBook3.getTitle());
		System.out.println("���� : " + javaBook3.getAuthor());
		System.out.println("���ڵ� : " + javaBook3.getISBN());
	}

	
	
	
	public void disp(Book javaBook) {
		System.out.println("å ���� : " + javaBook.title);
		System.out.println("���� : " + javaBook.author);
		System.out.println("���ڵ� : " + javaBook.ISBN);
	}

	public void disp2(Book javaBook2) {
		System.out.println("å ���� : " + javaBook2.title);
		System.out.println("���� : " + javaBook2.author);
		System.out.println("���ڵ� : " + javaBook2.ISBN);
	}

	// static
	public static void staticDisp(Book javaBook) {
		System.out.println("å ���� : " + javaBook.title);
		System.out.println("���� : " + javaBook.author);
		System.out.println("���ڵ� : " + javaBook.ISBN);

	}

}
