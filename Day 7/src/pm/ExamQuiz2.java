package pm;

public class ExamQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("제목", "작가", 320);
		System.err.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPages());
	}

}

class Book {
	
	private String title;
	private String author;
	private int pages;
	
	public Book(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		
		
	}
	
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String getPages() {
		return this.pages;
	}
}
