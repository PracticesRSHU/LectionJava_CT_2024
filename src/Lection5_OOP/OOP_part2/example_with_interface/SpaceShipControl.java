package Lection5_OOP.OOP_part2.example_with_interface;

public class SpaceShipControl implements IControlShip {
	public void up(int kilometers) {
		System.out.println("SpaceShip is moving UP on " + kilometers);
	}

	public void down(int kilometers) {
		System.out.println("SpaceShip is moving DOWN on " + kilometers);
	}

	public void left(int kilometers) {
		System.out.println("SpaceShip is moving LEFT on " + kilometers);
	}

	public void right(int kilometers) {
		System.out.println("SpaceShip is moving RIGHT on " + kilometers);
	}

}
