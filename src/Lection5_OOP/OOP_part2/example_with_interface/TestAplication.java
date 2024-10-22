package Lection5_OOP.OOP_part2.example_with_interface;

public class TestAplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SOLI[D] => principle Dependency Inversion => implements by Dependency Injection
		SpaceShip space1=new SpaceShip("Independens",new SpaceShipControlAudio());
		space1.moveUp(100);
		space1.moveLeft(500);
		SpaceShip space2=new SpaceShip("Independens",new SpaceShipControl());
		space2.moveUp(100);
		space2.moveLeft(500);
		

	}

}
