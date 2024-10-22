package Lection5_OOP.OOP_part2.example_with_interface;

public class SpaceShipControlAudio implements IControlShip {
	public void up(int kilometers) {
		System.out.println("Audio. SpaceShip is moving UP on " + kilometers);
	}

	public void down(int kilometers) {
		System.out.println("Audio. SpaceShip is moving DOWN on " + kilometers);
	}

	public void left(int kilometers) {
		System.out.println("Audio.  SpaceShip is moving LEFT on " + kilometers);
	}

	public void right(int kilometers) {
		System.out.println(" Audio. SpaceShip is moving RIGHT on " + kilometers);
	}

}
