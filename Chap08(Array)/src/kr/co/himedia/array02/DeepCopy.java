package kr.co.himedia.array02;

public class DeepCopy {
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("전설의 도시 해병성채", "황근출");
		book[1] = new Book("전설의 해병짜장", "톤톤정");
		book[2] = new Book("전설의 해병", "조 이보이");
		book[3] = new Book("전설의 오도봉고", "무모칠");
		book[4] = new Book("전설의 자진입대", "아쎄이");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for(int i = 0; i<book.length; i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		System.out.println("------original------");
		for(Book booki : book) {
			booki.showInfo();
		}
		System.out.println("--------copy--------");
		for(Book booki : copyBook) {
			booki.showInfo();
		}
	}
}
