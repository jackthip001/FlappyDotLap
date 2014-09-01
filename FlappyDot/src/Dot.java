import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Dot {
	
	private float x;
	private float y;
	private Image image;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 40;
	private float vy;
	private float vjump;
	
	public Dot(float x, float y) throws SlickException {
		this.x = x;
	    this.y = y;
	    image = new Image("res/dot.png");
	}
	
	public Dot(float x, float y, float vjump) throws SlickException {
		this(x,y);
		this.vy = vjump;
		this.vjump = vjump;
	}
		 
	public void update() {
		y += vy;
		vy -= FlappyDotGame.G;
	}	 
	
	public void render() {
	    image.draw(x - WIDTH/2, FlappyDotGame.GAME_HEIGHT - y - (HEIGHT/2));
	}
	
	public void jump() {
		vy = vjump;
	}
}
