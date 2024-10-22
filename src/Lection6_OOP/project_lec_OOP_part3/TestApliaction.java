package Lection6_OOP.project_lec_OOP_part3;

public class TestApliaction {
 
	public static void main(String[] args) {
//  Salary emp1=new Salary(); //ERROR!!!!!! NOT INSTANTIATE
	Salary emp1=new EmployeeOfDay(5);
	System.out.println("Salary employee "+ emp1.salary());
	EmployeeOfHour emp2=new EmployeeOfHour(48);
	System.out.println("Salary employee "+ emp2.salary());
	
	}
}
