package kr.co.himedia.templatemethod02;

public class PlayerTest {
	public static void main(String[] args) {
		
		Player p = new Player();
		p.play(1);
		
		PlayerLevel pLevel = new IntermediateLevel();
		p.setLevel(pLevel);
		p.play(2);
		
		PlayerLevel ppLevel = new AdvancedLevel();
		p.setLevel(ppLevel);
		p.play(3);
	}
}
