package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;


public class Mobile {
	
	private int speed;
	private String image;
	private Dimension dimension;
	private Position position;
	private Direction direction;
	
	;
	
	public Mobile (Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.direction = direction;
		this.position = position;
		this.dimension = dimension; 
		this.speed = speed;
		this.image = image;
	}
	
	public Direction getDirection() {
		return new Direction;
	}
	
	public void setDirection(Direction direction) {
			
	}
	
	public Point getPosition() {
		return new Point;
	}
	
	public Dimension getDimension() {
		return new Dimension(1,1);
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getWidth() {
		return this.dimension.getWidth();
	}
	
	public int getHeight() {
		return this.dimension.getHeight();
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
		this.direction = Direction.UP;
	}
	
	private void moveRight() {
		this.direction = Direction.RIGHT;
	}
	
	private void moveDown() {
		this.direction = Direction.DOWN;
	}
	
	private void moveLeft() {
		this.direction = Direction.LEFT;
	}
	
	public Color getColor() {
		return new Color;
	}
	
	public IDogfightModel getIDogfightModel() {
		return new IDogfightModel;
	}
	
	public void setIDogfightModel(IDogfightModel dogfightModel) {
		
	}
	
	public boolean hit() {
		return false;
	}
	
	public boolean isWeapon() {
		return true;
	}
	
	public Image getImage() {
		return this.image;
	}
}

