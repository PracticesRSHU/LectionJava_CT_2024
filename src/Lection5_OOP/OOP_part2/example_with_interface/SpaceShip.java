package Lection5_OOP.OOP_part2.example_with_interface;

public class SpaceShip {
	private String nameShape;
	private IControlShip spaceShopControl;
	
	public SpaceShip(String nameShape, IControlShip spaceShopControl) {
		this.nameShape=nameShape;
		this.spaceShopControl=spaceShopControl;
	}
	
	public void moveUp(int kilometers) {
		spaceShopControl.up(kilometers);
	}
	
	public void moveDown(int kilometers) {
		spaceShopControl.down(kilometers);
	}
	public void moveLeft(int kilometers) {
		spaceShopControl.left(kilometers);
	}
	public void moveRight(int kilometers) {
		spaceShopControl.right(kilometers);
	}

	public String getNameShape() {
		return nameShape;
	}

	public void setNameShape(String nameShape) {
		this.nameShape = nameShape;
	}

	@Override
	public String toString() {
		return "SpaceShip " + nameShape;
	}
	

}
