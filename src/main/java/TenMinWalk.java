import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TenMinWalk {

	private int countNS = 0;
	private int countWO = 0;

	int getCountNS() {
		return countNS;
	}
	int getCountWO() {
		return countWO;
	}

	public static boolean isValid(char[] walk) {
		TenMinWalk object = new TenMinWalk();
//		if (!object.checkLenght(walk)) return false;

		return object.checkWalk(walk, object);
	}


	public static boolean isValidParallel(char[] walk, int anzahlZerlegungen) {
		TenMinWalk object = new TenMinWalk();
		//		if (!object.checkLenght(walk)) return false;

		List<char[]> walkTeile = object.teile(walk, anzahlZerlegungen);
		ExecutorService executorService = Executors.newFixedThreadPool(5);


		return object.checkWalk(walk, object);
	}

	private boolean checkWalk(char[] walk, TenMinWalk object) {
		for (char c : walk) {
			object.parseChar(c);
		}
		return object.checkDirections();
	}

	private List<char[]> teile(char[] walk, int anzahlZerlegungen) {
		List<char[]> result = new ArrayList<char[]>();
		int teilGroesse = walk.length / anzahlZerlegungen;
		for (int i = 0; i < anzahlZerlegungen; i++){
			char[] teil  = new char[teilGroesse];
			System.arraycopy(walk, i*teilGroesse, teil, 0, teilGroesse);
			result.add(teil);
		}
		return result;
	}

	private boolean checkLenght(char[] walk){
		return walk.length == 10;
	}

	private boolean  checkDirections(){
		return  (countNS == 0 && countWO == 0);
	}

	private void parseChar(char c){
		switch(c){
			case 'n':
				countNS++;
				break;
			case 's':
				countNS--;
				break;
			case 'w':
				countWO--;
				break;
			case 'e':
				countWO++;
				break;
			default:
				throw new IllegalArgumentException(c + " ist Mist");
		}
	}
}
