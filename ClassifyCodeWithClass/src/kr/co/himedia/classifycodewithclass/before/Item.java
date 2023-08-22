package kr.co.himedia.classifycodewithclass.before;

public class Item {
    public static final int CLASSIFYCODE_BOOK = 0;
    public static final int CLASSIFYCODE_DVD = 1;
    public static final int CLASSIFYCODE_SOFTWARE = 2;

    private final int classifyCode;
    private final String title;
    private final int price;

    public Item(int classifyCode, String title, int price) {
        this.classifyCode = classifyCode;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "classifyCode=" + classifyCode +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
