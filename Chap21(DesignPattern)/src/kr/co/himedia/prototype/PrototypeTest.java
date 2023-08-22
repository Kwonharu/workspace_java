package kr.co.himedia.prototype;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		//super();
		this.title = title;
		this.author = author;
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

	@Override
	public String toString() {
		return "[" + title + ", " + author + "]";
	}
}

class BookShelf extends Object implements Cloneable{
	private ArrayList<Book> shelf;
	
	public BookShelf() {
		shelf = new ArrayList<>(); 
	}

	public ArrayList<Book> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}
	
	public void addBook(Book book) {
		shelf.add(book);
	}

	@Override
	public String toString() {
		return shelf.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//깊은 복사
		
		BookShelf another = new BookShelf();	
		for(Book book : shelf) {
			another.addBook(new Book(book.getTitle(), book.getAuthor()));
		}
		
		return another;
	}
}


public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(new Book("노조무", "티어문 제국 이야기 1"));
		bookShelf.addBook(new Book("모치즈키", "티어문 제국 이야기 2"));
		bookShelf.addBook(new Book("현노을", "티어문 제국 이야기 3"));
		
		System.out.println(bookShelf);
		
		BookShelf another = (BookShelf) bookShelf.clone();
		System.out.println(another);
		
		System.out.println();
		bookShelf.getShelf().get(0).setAuthor("지나가던개");
		bookShelf.getShelf().get(0).setTitle("방구석에 인어아가씨");
		
		System.out.println(bookShelf);
		System.out.println(another);		//얕은 복사가 이루아짐
	}
}




