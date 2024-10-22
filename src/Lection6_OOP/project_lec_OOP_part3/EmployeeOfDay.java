package Lection6_OOP.project_lec_OOP_part3;

public class EmployeeOfDay implements Salary {
	private int countOfDay;
	
	public EmployeeOfDay(int countOfDay) {
    	super();
		this.countOfDay = countOfDay;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.countOfDay*4000;
	}



}
