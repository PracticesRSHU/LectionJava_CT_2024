package Lection5_OOP.OOP_part2.exampl1;

public class RobotDancer extends Robot {
	private String typeDanc;

	public RobotDancer() {
		super("Robot Dancer","я танцюю");
		this.typeDanc = "AllDanc";
	}
	public RobotDancer(String typeDanc) {
		super("Robot Dancer","я танцюю");
		this.typeDanc = typeDanc;
	}
	
	//реалізація поліморфізму = перевизначення work 
	@Override
	public void work() {
		super.work();
		System.out.println("Я танцюю такий вид танцю,як "+this.typeDanc);
	}
	
	public void info() {
		System.out.println("Info robor Dancer!");
	}
	
	
}
