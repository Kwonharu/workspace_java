package kr.co.himedia.abstractclass;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer com = new DeskTop();
		com.display();
		com.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
		myNote.display();
		
	}
}
