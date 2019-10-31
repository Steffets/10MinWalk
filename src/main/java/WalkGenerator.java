import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WalkGenerator {
	public static char[] generate(int numberOfSteps) {

		String directions1 = "nswesnew";
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Random r = new Random();
		for (int i = 0; i < numberOfSteps; i++) {
			int index = Math.abs(r.nextInt() % 4);
			char c1 = directions1.charAt(index);
			char c2 = directions1.charAt(index + 4);
			sb1.append(c1);
			sb2.append(c2);
		}
		sb1.append(sb2);
		return (sb1.toString()).toCharArray();
	}

	static char[] generateShuffeled() {
		char[] walk = generate(1000);
		List<Character> list = new ArrayList<Character>();
		for (char c : walk) {
			list.add(c);
		}
		Collections.shuffle(list);

		Character[] characters = list.toArray(new Character[0]);
		char[] walk2 = new char[walk.length];
		for (int i = 0; i < characters.length; i++) {
			walk2[i] = characters[i];
		}
		return walk2;
	}
}
