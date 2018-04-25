package jpu2016.dogfight.model;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


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
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
			this.direction = direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Dimension getDimension() {
		return this.dimension;
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
		switch (this.direction) {
		case UP :
			this.position.setY(this.position.getY() - this.getSpeed());
			break;
			
		case DOWN : 
			this.position.setY(this.position.getY() + this.getSpeed());
			break;
			
		case LEFT : 
			this.position.setX(this.position.getX() - this.getSpeed());
			break;
			
		case RIGHT : 
			this.position.setX(this.position.getX() + this.getSpeed());
			break;
		}
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	protected void moveUp() {
		this.direction = Direction.UP;
	}
	
	protected void moveRight() {
		this.direction = Direction.RIGHT;
	}
	
	protected void moveDown() {
		this.direction = Direction.DOWN;
	}
	
	protected void moveLeft() {
		this.direction = Direction.LEFT;
	}
	
	public Color getColor() {
		return null;
	}
	
	public IDogfightModel getDogfightModel() {
		return null;
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		
	}
	
	public boolean hit() {
		return false;
	}
	
	public boolean isWeapon() {
		return false;
	}
	
	public Image getImage() {
		Image output = null;
		
		try {
			
			output = ImageIO.read(new File (this.image));
		} 
		
		catch (IOException exception) {
			
			exception.printStackTrace();
		}
		
		return output;
	}
}

