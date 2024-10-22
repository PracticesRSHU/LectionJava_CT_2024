package Lection7_8.compareOBJ;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		if(age>0) {
			this.age = age;
		}
	}
	@Override
	public String toString() {
		return "Student: " + name + ", age: " + age + "]";
	}
//	@Override
//	public int compareTo(Student student) {
//		if (this.name.compareToIgnoreCase(student.name)>0)
//			return 1;
//		else if (this.name.compareToIgnoreCase(student.name)<0)
//			return -1;
//					
//		return 0;
//	}
//	@Override
//	public int compareTo(Student student) {
//		if (this.age-student.age>0)
//			return 1;
//		else if (this.age<student.age)
//			return -1;
//					
//		return 0;
//	}
	@Override
	public int compareTo(Student student) {
		if (this.name.compareToIgnoreCase(student.name)>0)
			return 1;
		else if (this.name.compareToIgnoreCase(student.name)<0)
			return -1;
			
		return 0;
	
	}
	
}
