// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob07 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob07.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			String[] next = scan.nextLine().split(":");
			// System.out.println(Arrays.toString(next));
			String a = next[0];
			String[] b = next[1].split(",");
			
			int total = 0;
			int singles = 0;
			int doubles = 0;
			int triples = 0;
			int homeruns = 0;

			for(int j = 0, x = b.length; j < x; j++) {
				String s = b[j];
				if(s.equals("BB")) continue;

				if(s.equals("1B")) {
					singles++;
				} else if(s.equals("2B")) {
					doubles++;
				} else if(s.equals("3B")) {
					triples++;
				} else if(s.equals("4B")) {
					homeruns++;
				}

				total++;
			}

			double ans = 0;
			if(total > 0) {
				ans = (double) (singles + (2 * doubles) + (3 * triples) + (4 * homeruns)) / total;
			}

			System.out.println(ans);

		}
	}
}