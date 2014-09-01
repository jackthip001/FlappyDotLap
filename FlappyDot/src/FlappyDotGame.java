import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class FlappyDotGame extends BasicGame {
	
	private Dot dot;
	public static final int GAME_WIDTH = 640;
	public static final int GAME_HEIGHT = 480;
	
	public FlappyDotGame(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		dot.render();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		dot = new Dot(GAME_WIDTH/2, GAME_HEIGHT/2);
		Color background = new Color(135, 206, 255);
	    container.getGraphics().setBackground(background); 
	    
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		try {
		      FlappyDotGame game = new FlappyDotGame("Super Game");
		      AppGameContainer appgc = new AppGameContainer(game);
		      appgc.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
		      appgc.start();
		    } catch (SlickException e) {
		      e.printStackTrace();
		    }

	}

}
