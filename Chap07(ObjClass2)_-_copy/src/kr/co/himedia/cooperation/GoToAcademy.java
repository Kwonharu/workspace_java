package kr.co.himedia.cooperation;

public class GoToAcademy {
	public static void main(String[] args) {
		
		Student studentDul = new Student("둘기", 9900);
		Student studentHam = new Student("해미네", 50000);
		
		Bus bus158 = new Bus(158);
		Subway subway8 = new Subway(8);
		
		studentDul.takeBus(bus158);
		studentDul.takeSubway(subway8);
		studentHam.takeSubway(subway8);
		studentHam.takeSubway(subway8);
		studentHam.takeSubway(subway8);
		studentHam.takeSubway(subway8);
		studentHam.takeBus(bus158);
		
		studentDul.showInfo();
		studentHam.showInfo();
		
		bus158.showInfo();
		subway8.showInfo();
	}
}
