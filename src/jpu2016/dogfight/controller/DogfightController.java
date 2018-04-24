package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	
	final private int TIME_SLEEP = 30;
	IViewSystem viewSystem = new IViewSystem();
	IDogfightModel dogfightModel = new IDogfightModel();
	Missile missile = new Missile();
	
	
	
	public DogfightController(IDogfightModel dogfightModel) {
		
	}
	
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play(){
		
	}
	
	public void setViewSytem(IViewSystem viewSystem) {
		
	}
	
	private void lauchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}
	
	

}
