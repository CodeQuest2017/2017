// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob08 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob08.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			double distance = scan.nextDouble()*1000000;
			double speed = scan.nextDouble();
			double time = distance / speed;
			double days = time / 24;
			double hours = time % 24;
			double minutes = Integer.parseInt(("" + hours).substring(2)) * 60;
			double seconds = Integer.parseInt(("" + minutes).substring(2)) * 60;
			System.out.println("Time to Mars: "+(int)days+"days, "+(int)hours+"hours, "+(int)minutes+"minutes, "+(int)seconds+"seconds");
		}
	}
}
