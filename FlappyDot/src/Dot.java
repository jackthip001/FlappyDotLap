import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Dot {
	
	private float x;
	private float y;
	private Image image;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 40;
	 
	public Dot(float x, float y) throws SlickException {
		this.x = x;
	    this.y = y;
	    image = new Image("res/dot.png");
	}
	 
	public void render() {
	    image.draw(x - WIDTH/2, FlappyDotGame.GAME_HEIGHT - y - (HEIGHT/2));
	}
	
}
