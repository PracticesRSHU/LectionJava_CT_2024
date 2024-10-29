package Lection5_OOP.OOP_part1;

public abstract  class Animal{
	static int countAnimal=0;
	private String type;
	private String name;
	private int age;

	//constructor without parameters
	public Animal() {
//		this.type="None";
//		this.name="None";
//		this.age=0;
		this("None","None",0);
	}
	//custom constructor with parameters
	public Animal(String type, String name, int age) {
		this.type=type;
		this.name=name;
		this.age=age;
		countAnimal++;
	}
	
	//Getters and Setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Error!");
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "type=" + type + ", name=" + name + ", age=" + age;
	}
	
	abstract void eat();

//	public void eat() {
//		System.out.println(this.name + " all eat!");
//	}

	public void voise() {
		System.out.println("Crua-crau!");
	}

}
