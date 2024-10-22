package Lection6_OOP.project_lec_OOP_part3;

public class EmployeeOfHour implements Salary  {
	private int countOfHour;
	
	public EmployeeOfHour(int countOfHour) {
		super();
		this.countOfHour = countOfHour;
	}

	@Override
	public double salary() {
		return this.countOfHour*400;
	}

}
