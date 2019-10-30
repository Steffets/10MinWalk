import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TenMinWalkFinalTest {

	private static final char[][] fail = new char[][] {
			new char[] {'n'},
			new char[] {'n', 's'},
			new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'},
			new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'},
			new char[] {'n','s','n','s','n','s','n','s','n','n'},
			new char[] {'e','e','e','w','n','s','n','s','e','w'},
			new char[] {'n','e','n','e','n','e','n','e','n','e'},
			new char[] {'n','w','n','w','n','w','n','w','n','w'},
			new char[] {'s','e','s','e','s','e','s','e','s','e'},
			new char[] {'s','w','s','w','s','w','s','w','s','w'}
	};

	private static final char[][] pass = new char[][] {
			new char[] {'n','s','n','s','n','s','n','s','n','s'},
			new char[] {'e','w','e','w','n','s','n','s','e','w'},
			new char[] {'n','s','e','w','n','s','e','w','n','s'}
	};

	@Test
	public void Test() {
		assertFalse(TenMinWalk.isValid(fail[0]), "Should return false if walk is too short.  ");
		assertFalse(TenMinWalk.isValid(fail[1]), "Should return false if walk is too short.  ");
		assertFalse(TenMinWalk.isValid(fail[2]), "Should return false if walk is too long.  ");
		assertFalse(TenMinWalk.isValid(fail[3]), "Should return false if walk is too long.  ");
		assertFalse(TenMinWalk.isValid(fail[4]), "Should return false if walk does not bring you back to start.  ");
		assertFalse(TenMinWalk.isValid(fail[5]), "Should return false if walk does not bring you back to start.  ");
		assertFalse(TenMinWalk.isValid(fail[6]), "Should return false if walk does not bring you back to start.  ");
		assertFalse(TenMinWalk.isValid(fail[7]), "Should return false if walk does not bring you back to start.  ");
		assertFalse(TenMinWalk.isValid(fail[8]), "Should return false if walk does not bring you back to start.  ");
		assertFalse(TenMinWalk.isValid(fail[9]), "Should return false if walk does not bring you back to start.  ");
		assertTrue(TenMinWalk.isValid(pass[0]), "Should return true for a valid walk.  ");
		assertTrue(TenMinWalk.isValid(pass[1]), "Should return true for a valid walk.  ");
		assertTrue(TenMinWalk.isValid(pass[2]), "Should return true for a valid walk.  ");
	}
}