package jpu2016.dogfight.model;

public class Missile extends Mobile {
	
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Position position, Dimension dimension) {
		super(direction, position, dimension, SPEED, IMAGE);
	}
	
	public int getWidthWithADirection(Direction direction) {
		return 0;
	}
	
	public int getHeightWithADirection(Direction direction) {
		return 0;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		return true;
	}

}
