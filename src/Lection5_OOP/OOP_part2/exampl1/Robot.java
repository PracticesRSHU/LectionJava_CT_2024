package Lection5_OOP.OOP_part2.exampl1;

public class Robot {
	public String name;
	public String robFunc;
		
	public Robot(){
		this.name="Я Robot";
		this.robFunc="я просто працюю";
		
	}
	
	public Robot(String name, String robFunc){
		this.name=name;
		this.robFunc=robFunc;
	}
	

	public void work() {
		System.out.println(this.name+" - "+this.robFunc);
	}
	
	public String getName() {
		return this.name;
	}
}
