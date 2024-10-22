package Lection5_OOP.OOP_part1;

public class Cat extends Animal{
	private String porodaCat;
	
	public Cat(){
		super();
		this.porodaCat="None";
	}
	public Cat(String porodaCat, String name, int age) {
		super("Cat",name, age);
		this.porodaCat = porodaCat;
	}


	public String getPorodaCat() {
		return porodaCat;
	}


	public void setPorodaCat(String porodaCat) {
		this.porodaCat = porodaCat;
	}
	
	@Override
	public String toString() {
		return super.toString()+", porodaCat="+this.porodaCat;
	}
	@Override
	void eat() {
		System.out.println("Cat like milk...");
		
	}

	
	
}
