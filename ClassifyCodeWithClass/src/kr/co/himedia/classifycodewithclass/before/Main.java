package kr.co.himedia.classifycodewithclass.before;

public class Main {
    public static void main(String[] args) {

        Item book = new Item(Item.CLASSIFYCODE_BOOK, "오베라는 남자", 15000);
        Item dvd = new Item(Item.CLASSIFYCODE_DVD, "프레드릭 베크만", 50000);
        Item software = new Item(Item.CLASSIFYCODE_SOFTWARE, "기계자식아", 30000);
        //tem item = new Item(100, "Sanz", 25000);

        System.out.println(book);
        System.out.println(dvd);
        System.out.println(software);

    }
}
