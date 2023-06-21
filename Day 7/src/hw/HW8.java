package hw;

public class HW8 {

	public static void main(String[] args) {
		
	Book book = new Book("1Q84", "Jiho", 14);
	System.out.println(book.title);
	System.out.println(book.author);
	System.out.println(book.pages);
	}

}

class Book {
	
	String title;
	String author;
	int pages;
	
	public Book(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	
}