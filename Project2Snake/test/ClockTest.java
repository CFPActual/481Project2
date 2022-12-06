import static org.junit.Assert.*;
import org.psnbtech.Clock;
import org.psnbtech.Direction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClockTest {
	Clock newClock = new Clock(1);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		long currUpdate = Clock.getCurrentTime();
		//float delta = (float)(currUpdate - newClock.lastUpdate) + newClock.excessCycles;		
		newClock.isPaused = false;
		newClock.update();
		assertEquals(newClock.lastUpdate, currUpdate );
		
	}
	
	@Test
	public void test2() {
		newClock.setPaused(false);
		assertEquals(false, newClock.isPaused());
		
	}
	
	@Test
	public void testHasElapsedCycle1() {
		newClock.elapsedCycles = 2;
		newClock.peekElapsedCycle();
		assertEquals(true, newClock.hasElapsedCycle());
		
	}
	
	@Test
	public void testHasElapsedCycle2() {
		newClock.elapsedCycles = 0;
		newClock.peekElapsedCycle();
		assertEquals(false, newClock.hasElapsedCycle());
		
	}

}
