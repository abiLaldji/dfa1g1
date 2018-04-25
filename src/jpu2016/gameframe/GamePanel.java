package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;


public abstract class GamePanel implements Observer{
	
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		
	}

	public void update(Observable observable) {
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	} 


}
