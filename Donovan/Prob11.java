// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob11 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob11.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			String[] words = scan.nextLine().split(" ");
			for(int j = 0; j < words.length; j++) {
				System.out.println(reverse(words[j]));
			}
			System.out.println();
		}
	}
	public static String reverse(String word) {
		int len = word.length();
		boolean[] symbol = new boolean[len];
		boolean[] uppercase = new boolean[len];

		for(int i = 0; i < len; i++) {
			String current = String.valueOf(word.charAt(i));
			if(current.toLowerCase() == current.toUpperCase()) {
				symbol[i] = true;
			}

			int num = (int) current.charAt(0);
			if(num >= 65 && num <= 90) {
				uppercase[i] = true;
			}
		}

		int next = len - 1;
		char[] reverse = new char[len];

		// Add the symbols first
		for(int i = 0; i < len; i++) {
			if(symbol[i]) {
				reverse[i] = word.charAt(i);
			}
		}

		// Go in reverse order, skipping indexes already taken
		int current = 0;
		for(int i = next; i > -1; i--) {
			// If neither are symbols, swap them
			if(!symbol[current] && !symbol[i]) {
				reverse[i] = word.charAt(current);
			} else {
				// If the current place we're looking at is a symbol, go on
				if(symbol[i]) {
					continue;
				} else {
					// If we reached a symbol as next, skip it
					while(current < len && symbol[current]) {
						current++;
					}
					if(current != len) {
						reverse[i] = word.charAt(current);
					}
				}
			}
		}

		// if the index is not uppercase, make it lowercase
		for(int i = 0; i < len; i++) {
			char c = reverse[i];
			String str = String.valueOf(c);
			if(uppercase[i]) {
				String x = str.toUpperCase();
				char y = x.charAt(0);
				reverse[i] = y;
			} else {
				String x = str.toLowerCase();
				char y = x.charAt(0);
				reverse[i] = y;
			}
		}

		String ans = "";
		for(int i = 0; i < len; i++) {
			ans += reverse[i];
		}

		return ans;
	}
}
