import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class FlappyDotGame extends BasicGame {
	
	private Dot dot;
	public static final int GAME_WIDTH = 640;
	public static final int GAME_HEIGHT = 480;
	public static final float DOT_JUMP_VY = 10;
	public static final float G = (float) 0.3;
	private boolean isStarted;
	   
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
		isStarted = false;
		dot = new Dot(GAME_WIDTH/2, GAME_HEIGHT/2,DOT_JUMP_VY);
		Color background = new Color(135, 206, 255);
	    container.getGraphics().setBackground(background); 
	    
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// TODO Auto-generated method stub
		if(isStarted){
			dot.update();
		}
	}
	
	@Override
	public void keyPressed(int key, char c) {
	    if (key == Input.KEY_SPACE) {
	    	isStarted = true;
	    	dot.jump();
	    }
	}
	
	public static void main(String[] args) {
		try {
		      FlappyDotGame game = new FlappyDotGame("Super Game");
		      AppGameContainer appgc = new AppGameContainer(game);
		      appgc.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
		      appgc.setMinimumLogicUpdateInterval(1000 / 60);
		      appgc.start();
		    } catch (SlickException e) {
		      e.printStackTrace();
		    }

	}

}
