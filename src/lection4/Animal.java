package Lection4;

import java.util.Objects;

public class Animal implements Comparable {
	private String type;
	private String name;
	private int age;
	public static int countAnimal;
	
	public Animal(String type, String name, int age) {
		this.type=type;
		this.name=name;
		this.age=age;
		countAnimal++;
	}
	public Animal(){
//		this.type="None";
//		this.name="NoName";
//		this.age=4;
		this("None","NoName",0);
	}
	
	
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
		this.age = age;
	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age);
//	}
	
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Animal other = (Animal) obj;
		if (this.name.equalsIgnoreCase(other.getName())) {
			if (this.age == other.age) {
				return true;
		}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Animal: type=" + type + ", name=" + name + ", age=" + age + ";";
	}

	
	void print() {
		System.out.println("type: "+this.type+" "+this.name+" has "+this.age);
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Animal animal=(Animal) obj;
//		return this.age-animal.age
		
		return this.name.compareToIgnoreCase(animal.name);
	}
	
	

}
