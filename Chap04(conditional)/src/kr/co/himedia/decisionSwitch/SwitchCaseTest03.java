package kr.co.himedia.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("reciving: ");
		String day = scan.nextLine();
		
		switch(day) {
			case "Sunday": 
				System.out.println("baseball");
				break;
			case "Monday": 
				System.out.println("basketball");
				break;
			case "Tuseday": 
				System.out.println("swimming");
				break;
			case "Wednseday": 
				System.out.println("circle");
				break;
			case "Friday": 
				System.out.println("soccer");
				break;
			default:
				System.out.println("rest");
				break;
		}
	
		scan.close();
	}
}
