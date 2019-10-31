import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TenMinWalkTest {

	@Test
	public void murcs() {
		// assertFalse(TenMinWalk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }), "Should return false");
		assertFalse(TenMinWalk.isValid(new char[] { 'w' }), "Should return false");
		assertFalse(TenMinWalk.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }), "Should return false");
	}

	@Test
	public void oisIsi() {
		assertTrue(TenMinWalk.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }), "Should return true");
		assertTrue(TenMinWalk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }), "Should return true");
		assertTrue(TenMinWalk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'  }), "Should return true");
	}

	@Test
	public void maxRunner() {

		char[] walk2 = WalkGenerator.generateShuffeled();
		assertTrue(TenMinWalk.isValid(walk2), "Should return true");
	}

	@Test
	public void maxRunnerZeitMesse() {

		char[] walk2 = WalkGenerator.generateShuffeled();
		long start = System.nanoTime();
		boolean valid = TenMinWalk.isValid(walk2);
		long delta = System.nanoTime() - start;
		assertTrue(valid, "Should return true");
		System.out.println("Laufzeit nanos: " + delta);
		// System.out.printf("Laufzeit: %.2 ns", delta);
	}

}
