import java.util.*;
import java.io.*;

public class Prob03 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob03.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = a + b;
			long d = a * b;
			System.out.println(c + " " + d);
		}
	}
}