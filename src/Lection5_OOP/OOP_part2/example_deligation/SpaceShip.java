package Lection5_OOP.OOP_part2.example_deligation;

public class SpaceShip {
	private String nameShape;
	private SpaceShipControl spaceShopControl=new SpaceShipControl();
	
	public SpaceShip(String nameShape) {
		this.nameShape=nameShape;
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
