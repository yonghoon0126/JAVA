package jang_4;

public class Book2 {
	String title;
	String author;
	int ISBN;

	public Book2(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("3개 호출");
	}

	public Book2(String title, int ISBN) {
		this(null, null, 0);
		System.out.println("생성자가 2개 호출되었음");
	}

	public Book2() {
		System.out.println("디폴트...");
	}

	public static void main(String[] args) {
		Book2 javaBook = new Book2("Java JDK", "황기태", 3333);
		Book2 HolyBible = new Book2("Holy Bible", 1);
		Book2 emptyBook = new Book2();
	}
}
