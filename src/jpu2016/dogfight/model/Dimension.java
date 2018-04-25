package jpu2016.dogfight.model;

public class Dimension  {
	
	public int width;
	public int height;
	
	public Dimension(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public Dimension(Dimension dimension) {
		this.width=dimension.width;
		this.height=dimension.height;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
