public class Book {
	private String title;
   private String isbn;
	public Book(String title, String isbn) {
		this.title= title;
		this.isbn = isbn;  	
	}

	public String toString() {
		return "ISBN: " + isbn + "; TITLE: " + title + ";";
	}
	public static void main(String[] args) {
		Book myBook = new Book("The java Tutorial", "0123456");
		System.out.println(myBook);
	}
}