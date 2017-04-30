// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob06 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob06.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('A', "Alpha");
		map.put('B', "Bravo");
		map.put('C', "Charlie");
		map.put('D', "Delta");
		map.put('E', "Echo");
		map.put('F', "Foxtrot");
		map.put('G', "Golf");
		map.put('H', "Hotel");
		map.put('I', "India");
		map.put('J', "Juliet");
		map.put('K', "Kilo");
		map.put('L', "Lima");
		map.put('M', "Mike");
		map.put('N', "November");
		map.put('O', "Oscar");
		map.put('P', "Papa");
		map.put('Q', "Quebec");
		map.put('R', "Romeo");
		map.put('S', "Sierra");
		map.put('T', "Tango");
		map.put('U', "Uniform");
		map.put('V', "Victor");
		map.put('W', "Whiskey");
		map.put('X', "Xray");
		map.put('Y', "Yankee");
		map.put('Z', "Zulu");

		for(int i = 0; i < T; i++) {
			int N = scan.nextInt();
			for(int j = 0; j < N; j++) {
				String[] next = scan.nextLine().split(" ");
				String out = "";
				for(int k = 0, x = next.length; k < x; k++) {
					for(int l = 0, y = next[k].length(); l < y; l++) {
						out += map.get((char) (String.valueOf(next[k].charAt(l)).toUpperCase())) + "- ";
					}
				}
				if(out.length() >= 2) {
					out = out.substring(0, out.length() - 3);
				}
				System.out.println(out);
			}
		}
	}
}
