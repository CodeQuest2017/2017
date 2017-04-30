import java.util.*;
import java.io.*;

public class Prob02 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob02.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			String word = scan.next();
			int n = scan.nextInt();
			if(n == 0) {
				System.out.println(word.substring(1));
			} else if(n == word.length()) {
				System.out.println(word.substring(0, n));
			} else {
				System.out.println(word.substring(0, n) + word.substring(n + 1));
			}
		}
	}
}