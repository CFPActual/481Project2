import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Clock;
import java.util.LinkedList;
import java.time.Clock;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.Direction;
import org.psnbtech.DummyComponent;
import org.psnbtech.Direction;
import org.psnbtech.DummyComponent;
import org.psnbtech.SnakeGame;
import org.psnbtech.TileType;
import org.psnbtech.BoardPanel;

public class SnakeGameTest {
	
//	private SnakeGame newGame;
//	private BoardPanel newBoard;
	SnakeGame newGame = new SnakeGame();
	BoardPanel newBoard = new BoardPanel(newGame);

	@Before
	public void setUp() throws Exception {
//		newGame = new SnakeGame();
//		newBoard = new BoardPanel(newGame);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEnter() {
	    newGame.directions = new LinkedList<>();
//	    newGame.isGameOver = true;
	    newGame.isNewGame = false;

		newGame.startGame();

	    KeyListener keyPress = newGame.getKeyListeners()[0];
	    keyPress.keyPressed(new KeyEvent(newGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER));
//	    Assert.assertEquals(Direction.North, newGame.getDirection());
	}
//	@Test
//	public void testEnter2(){
//		SnakeGame g = new SnakeGame();
//        g.startGame();
//        KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
//        g.getKeyListeners()[0].keyPressed(key);
//	}
	
	@Test
	public void testRightKey() {
	    newGame.directions = new LinkedList<>();


	    KeyListener keyPress = newGame.getKeyListeners()[0];
	    keyPress.keyPressed(new KeyEvent(new DummyComponent(), 0, 0, 0, KeyEvent.VK_RIGHT, 'x'));
	    Assert.assertEquals(Direction.East, newGame.getDirection());
	}
	
	@Test
	public void testLeftKey() {
	    newGame.directions = new LinkedList<>();


	    KeyListener keyPress = newGame.getKeyListeners()[0];
	    keyPress.keyPressed(new KeyEvent(new DummyComponent(), 0, 0, 0, KeyEvent.VK_LEFT, 'x'));
	    Assert.assertEquals(Direction.West, newGame.getDirection());
	}
	
	@Test
	public void testUpKey() {
	    newGame.directions = new LinkedList<>();


	    KeyListener keyPress = newGame.getKeyListeners()[0];
	    keyPress.keyPressed(new KeyEvent(new DummyComponent(), 0, 0, 0, KeyEvent.VK_UP, 'x'));
	    Assert.assertEquals(Direction.North, newGame.getDirection());
	}
//	
	@Test
	public void testDownKey() {
	    newGame.directions = new LinkedList<>();
	    newGame.startGame();


	    KeyListener keyPress = newGame.getKeyListeners()[0];
	    keyPress.keyPressed(new KeyEvent(new DummyComponent(), 0, 0, 0, KeyEvent.VK_DOWN, 'x'));
	    Assert.assertEquals(Direction.South, newGame.getDirection());
	}

	
//	@Test
//	public void testPauseKey() {
////		newGame.isPaused = false;
//		newGame.logicTimer = new Clock(9.0f);
//		newGame.startGame();
//
//	    KeyListener keyPress = newGame.getKeyListeners()[0];
//	    keyPress.keyPressed(new KeyEvent(new DummyComponent(), 0, 0, 0, KeyEvent.VK_P, 'x'));
////	    Assert.assertEquals(Direction.North, newGame.getDirection());
//	}
	
	

//
//	@Test
//	public void testStartGame() {
//
//
////		newGame.logicTimer = new Clock(9.0f);
//		newGame.logicTimer.elapsedCycles = 2;
////		newGame.updateGame();
//		assertEquals(2, newGame.logicTimer.elapsedCycles);
//		assertEquals(true, newGame.logicTimer.hasElapsedCycle());
//
//		newGame.startGame();
//
////		newGame.startGame();
//
////		newGame.logicTimer.update();
////		newGame.updateGame();
////		newGame.logicTimer.update();
//
////		newGame.resetGame();
////		newGame.updateGame();
////		this.newGame.startGame();
////		this.newGame.
////		newGame.logicTimer.setPaused(false);
//
//	}

}
