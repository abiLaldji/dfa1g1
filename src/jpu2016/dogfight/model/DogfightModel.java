package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel implements IDogfightModel {

	private IArea area;

	public DogfightModel() {
		
	}
		
	public IArea getArea() {
		return this.area;
	}
	
	public void buildArea(Dimension dimension) {
		this.area = new Sky(dimension);
	}
	
	public void addMobile(IMobile Mobile) {
		
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return new ArrayList<IMobile>();
	}
	
	public IMobile getMobileByPlayer(int player) {
		return null;
	}
	
	public void setMobilesHaveMoved(){
		
	}
}
