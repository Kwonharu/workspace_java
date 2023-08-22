package kr.co.himedia.classifycodewithclass.after;

public class ItemType {
    private int classfiyCode;
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    public ItemType(int classifyCode){
        this.classfiyCode = classifyCode;
    }

    public int getClassfiyCode() {
        return classfiyCode;
    }

}
