package jpu2016.dogfight.model;

public class Missile extends Mobile {
	
	private final static int SPEED = 4;
	private final static int WIDTH = 30;
	private final static int HEIGHT = 10;
	private final static int MAX_DISTANCE_TRAVELED = 1400;
	private final static String IMAGE = "missile";
	private static int distanceTraveled = 0;
	
	public Missile(Direction direction, Position position, Dimension dimension) {
		super(direction, position, dimension, SPEED, IMAGE);
	}
	
	public int getWidthWithADirection(Direction direction) {
		if(direction == Direction.LEFT || direction == Direction.RIGHT)
			return WIDTH;
		else
			return HEIGHT;
	}
	
	public int getHeightWithADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN)
			return HEIGHT;
		else
			return WIDTH;
	}
	
	public void move() {
		
		switch (this.getDirection()) {
		
		case UP : 
			moveUp();
			break;
			
		case DOWN : 
			moveDown();
			break;
			
		case LEFT : 
			moveLeft();
			break;
			
		case RIGHT :
			moveRight();
			break;
		}
		
		distanceTraveled += getSpeed();
		
		if(distanceTraveled >= MAX_DISTANCE_TRAVELED)
			getDogfightModel().removeMobile(this);
	}
	
	public boolean isWeapon() {
		return true;
	}

}
