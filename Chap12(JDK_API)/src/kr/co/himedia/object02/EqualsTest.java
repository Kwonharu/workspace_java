package kr.co.himedia.object02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		String str1 = new String("sanz");
		String str2 = new String("sanz");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println();
		
		Student student1 = new Student(0314, "수아");
		Student student2 = new Student(0314, "수아");
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println();
		
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2));
		
		System.out.println();
		
		student1.setStudentName("미미르");
		Student student3 = (Student)student1.clone();
		
		System.out.println(student1 == student3);
		System.out.println(student1.equals(student3));
		System.out.println(student1.toString());
		System.out.println(student3.toString());
		
	}
}






