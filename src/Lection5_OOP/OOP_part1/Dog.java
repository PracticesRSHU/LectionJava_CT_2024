package  Lection5_OOP.OOP_part1;
public class Dog extends Animal{
	private String vidDog;
	
	public Dog(){
		super();
		this.vidDog="None";
	}
	public Dog(String vidDog, String name, int age) {
		super("Dog",name, age);
		this.vidDog = vidDog;
	}


	public String getVidDog() {
		return vidDog;
	}


	public void setVidDog(String vidDog) {
		this.vidDog = vidDog;
	}
	@Override
	public String toString() {
		return super.toString()+", vidDog="+this.vidDog;
	}

	@Override
	public void eat() {
		System.out.println(super.getName()+" meat and fish!");
	}
	
}
