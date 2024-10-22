package Lection5_OOP.OOP_part1;

public class Test_Application {

	public static void main(String[] args) {
//		Animal an1=new Animal();
//		System.out.println(an1);
//		Animal an2=new Animal("wolf","Alpha",12);
//		System.out.println(an2);
//		int age=(new Animal()).getAge();
//		System.out.println(age);
		Dog dog1=new Dog();
		System.out.println(dog1);
		dog1.setType("Dog");
		dog1.setName("Tom");
		dog1.setAge(8);
		dog1.setVidDog("Taksa");
		System.out.println(dog1);
		System.out.println(Animal.countAnimal);
		Animal an3=new Dog("Dog","Bili",4);
		System.out.println(((Dog) an3).getVidDog());
		((Dog) an3).setVidDog("Buldog");
		System.out.println(an3);
		System.out.println(Animal.countAnimal);
		Animal.countAnimal++;
		System.out.println(Animal.countAnimal);
		dog1.countAnimal++;
		System.out.println(dog1.countAnimal);
		Cat cat1=new Cat("Anithing","Pushok",2);
		System.out.println(cat1);
		System.out.println(Animal.countAnimal);
		dog1.eat();
		
		
	}
}
