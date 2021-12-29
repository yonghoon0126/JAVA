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

	// 디폴트 생성자
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

		Book javaBook = new Book("Java JDk", "황기태", 3333);

		// javaBook2의 멤버들을 초기화
		Book javaBook2 = new Book();

		// static
		Book javaBook3 = new Book("Java", "고길동", 4321);

		javaBook2.title = "자바";
		javaBook2.author = "홍길동";
		javaBook2.ISBN = 1234;

		// 출력
		// System.out.println("책 제목 : " + javaBook.title);
		// System.out.println("저자 : " + javaBook.author);
		// System.out.println("바코드 : " + javaBook.ISBN);
		//
		// System.out.println("책 제목 : " + javaBook2.title);
		// System.out.println("저자 : " + javaBook2.author);
		// System.out.println("바코드 : " + javaBook2.ISBN);

		// 메소드 호출()
		javaBook.disp(javaBook);
		javaBook2.disp2(javaBook2);

		// static
		javaBook3.staticDisp(javaBook3);
		// staticDisp(javaBook3);

		// set
		javaBook3.setTitle("JRE");
		javaBook3.setAuthor("둘리");
		javaBook3.setISBN(5678);

		staticDisp(javaBook3);

		// get
		staticDisp(javaBook3);
		System.out.println("책 제목 : " + javaBook3.getTitle());
		System.out.println("저자 : " + javaBook3.getAuthor());
		System.out.println("바코드 : " + javaBook3.getISBN());
	}

	
	
	
	public void disp(Book javaBook) {
		System.out.println("책 제목 : " + javaBook.title);
		System.out.println("저자 : " + javaBook.author);
		System.out.println("바코드 : " + javaBook.ISBN);
	}

	public void disp2(Book javaBook2) {
		System.out.println("책 제목 : " + javaBook2.title);
		System.out.println("저자 : " + javaBook2.author);
		System.out.println("바코드 : " + javaBook2.ISBN);
	}

	// static
	public static void staticDisp(Book javaBook) {
		System.out.println("책 제목 : " + javaBook.title);
		System.out.println("저자 : " + javaBook.author);
		System.out.println("바코드 : " + javaBook.ISBN);

	}

}
