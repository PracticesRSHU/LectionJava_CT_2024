package Lection6_OOP.project_lec_OOP_part4;

public class Student {
	private String firstname;
	private String secondname;
	private int age;
	
	public Student() {
		super();
		this.firstname = "Nofirstname";
		this.secondname = "Nosecondname";
		this.age = 18;
	}

	public Student(String firstname, String secondname, int age) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return  firstname + " " + secondname + "(" + age + " years)";
	};
	
	

}
