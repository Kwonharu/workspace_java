package kr.co.himedia.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("무-빙");
	}
	
	public void eat() {
		System.out.println("냠냠");
	}
}

class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("동산을 뛰고 뛰어가는 강아지 하나");
	}
	
	public void playball() {
		System.out.println("주인이 던진 공을 물어옵니다");
	}
	
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("흐르는 저하늘을 물어채는 범처럼");
	}
	
	public void hunt() {
		System.out.println("사냥 시작");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("태산에 날아들어 숨어드는 새처럼");
	}
	
	public void pickUp() {
		System.out.println("강하 계시");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal danimal = new Dog();
		Animal tanimal = new Tiger(); 
		Animal eanimal = new Eagle();
		
		danimal.move();
		tanimal.move();
		eanimal.move();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(danimal);
		test.moveAnimal(tanimal);
		test.moveAnimal(eanimal);
		
		System.out.println();
												     //↓ 이거 생략 가능
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(danimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		
		
		for(Animal animal : animalList) {
			animal.move();			
		}
		
		System.out.println();
		
		test.checkDownCast(animalList);
		
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
	public void checkDownCast(ArrayList<Animal> list) {
		for(int i = 0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Dog) {
				Dog danimal = (Dog)animal;
				danimal.playball();
			}else if(animal instanceof Tiger) {
				Tiger tanimal = (Tiger)animal;
				tanimal.hunt();
			}else if(animal instanceof Eagle) {
				Eagle eanimal = (Eagle)animal;
				eanimal.pickUp();
			}else {
				System.out.println("뇨내");
			}
		}
	}
	
}




