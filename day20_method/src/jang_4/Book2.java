package jang_4;

public class Book2 {
	String title;
	String author;
	int ISBN;

	public Book2(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("3�� ȣ��");
	}

	public Book2(String title, int ISBN) {
		this(null, null, 0);
		System.out.println("�����ڰ� 2�� ȣ��Ǿ���");
	}

	public Book2() {
		System.out.println("����Ʈ...");
	}

	public static void main(String[] args) {
		Book2 javaBook = new Book2("Java JDK", "Ȳ����", 3333);
		Book2 HolyBible = new Book2("Holy Bible", 1);
		Book2 emptyBook = new Book2();
	}
}
