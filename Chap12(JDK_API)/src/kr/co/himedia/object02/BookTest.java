package kr.co.himedia.object02;


class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title= title;
		this.author = author;
	}
	
//	@Override
//	public String toString() {
//		return title +", "+ author;
//	}	
	
	@Override
	public int hashCode() {
		System.out.println("mte");
		return super.hashCode();
	}
}


public class BookTest {
	public static void main(String[] args) {
		
		Book book = new Book("전역은 오는가", "따흐흑");
		System.out.println(book.toString());
	}
}
