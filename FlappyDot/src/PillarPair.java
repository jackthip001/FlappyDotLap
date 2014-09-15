import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class PillarPair {
	
	static public final int WIDTH = 80; 
	static public final int IMAGE_HEIGHT = 600;
	static public final int PILLAR_SPACE = 200;

	private Image topPillar;
	private Image bottomPillar;
	private float x;
	private float y;
	private float vx;
	
	public PillarPair(float x, float y) throws SlickException {
		this.x = x;
	    this.y = y;
	    topPillar = new Image("res/pillar-top.png");
	    bottomPillar = new Image("res/pillar-bottom.png");
	}
	
	public PillarPair(float x, float y, float vx) throws SlickException {
	    this(x,y);
	    this.vx = vx;
	}
	 
	public void render() {
	    topPillar.draw(x - WIDTH, FlappyDotGame.GAME_HEIGHT - (y + 700));
	    bottomPillar.draw(x - WIDTH, FlappyDotGame.GAME_HEIGHT - (y - 100)); 
	  }
	
	public void update() {
		x += vx;
		if(x < 0){
			x = FlappyDotGame.GAME_WIDTH + WIDTH;
			randomY();
		}
	}
	
	public void randomY() {
	    Random random = new Random();
	    y = random.nextInt(FlappyDotGame.GAME_HEIGHT-100);
	    
	}
}
