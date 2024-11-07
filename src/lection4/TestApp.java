package Lection4;

import java.util.Arrays;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal monkey=new Animal();
//		monkey.name="Makaka1";
//		monkey.type="monkey";
		monkey.print();
		System.out.println(monkey);
		System.out.println(monkey.countAnimal);
		System.out.println(Animal.countAnimal);
		Animal wolf=new Animal("wolf","Alpha777",7);
		wolf.print();
		wolf.setName("Omega");
		wolf.print();
		System.out.println(wolf);
		System.out.println(wolf.countAnimal);
		System.out.println(Animal.countAnimal);
		System.out.println(monkey==wolf); //address
		System.out.println(monkey.equals(wolf)); //fields
		Scanner in= new Scanner(System.in);
		
//		Animal[] animals=new Animal[3];
//		//animals[0]=wolf;
//		for (int i = 0; i < animals.length; i++) {
////			animals[i]=new Animal();
////			animals[i].setType("Wolf");
////			System.out.println("Input Name");
////			animals[i].setName(in.next());
////			System.out.println("Input Age");
////			animals[i].setAge(in.nextInt());
//			System.out.println("Input Name");
//			String name=in.next();
//			System.out.println("Input Age");
//			int age=in.nextInt();
//			animals[i]=new Animal("Wolf",name,age);
//			
//		}	
//		
//		printInfoAnimals(animals);
//		
		
		Animal[] monkeys= {
				new Animal("Monkey","Makaka5",6),
				new Animal("Monkey","Makaka5",4),
		};
		printInfoAnimals(monkeys);
//		Arrays.sort(monkeys,(m1,m2)->m1.getName().compareToIgnoreCase(m2.getName()));
		Arrays.sort(monkeys,(m1,m2)->m1.getAge()-m2.getAge());
		
		printInfoAnimals(monkeys);
		monkeys[1].setAge(4);
		System.out.println(monkeys[1]);
		
		System.out.println(monkeys[0].equals(monkeys[1]));
	}
	public static void printInfoAnimals(Animal [] animals) {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}		 
	
	

}

