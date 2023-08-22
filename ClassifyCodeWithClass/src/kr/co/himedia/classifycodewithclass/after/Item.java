package kr.co.himedia.classifycodewithclass.after;

public class Item {
    public static final int CLASSIFYCODE_BOOK = ItemType.BOOK.getClassfiyCode();
    public static final int CLASSIFYCODE_DVD = ItemType.DVD.getClassfiyCode();
    public static final int CLASSIFYCODE_SOFTWARE = ItemType.SOFTWARE.getClassfiyCode();

    //private final int classifyCode;
    private ItemType itemType;
    private final String title;
    private final int price;

    public Item(ItemType itemType, String title, int price) {
        this.itemType = itemType;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemType=" + itemType.getClassfiyCode() +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
