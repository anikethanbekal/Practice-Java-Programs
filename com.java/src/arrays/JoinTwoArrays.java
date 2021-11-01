package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class JoinTwoArrays {
	// m1 using stream
	static void stream(String batsman[], String[] bowlers) {
		Stream<String> sBat = Arrays.stream(batsman);
		Stream<String> bBow = Arrays.stream(bowlers);
		String fullTeam[] = Stream.concat(sBat, bBow).toArray(size -> new String[size]);
		// print
		for (String s : fullTeam) {
			System.out.println(s);
		}
	}

	// m2 using goole guava
	static void guava(String batsman[], String[] bowlers) {
		String allTeam[] = ObjectArrays.concat(batsman, bowlers, String.class);
		for (String s : allTeam) {
			System.out.println(s);
		}

		// For primitive type
		int p1[] = { 1, 2, 3 };
		int p2[] = { 4, 5, 6 };
		int p3[] = Ints.concat(p1, p2);
		for (int i : p3) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		String batsman[] = { "A", "B", "C" };
		String[] bowlers = { "X", "Y", "Z" };

		// m1
		stream(batsman, bowlers);

		// m2
		guava(batsman, bowlers);
	}
}
