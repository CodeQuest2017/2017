// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob07 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob07.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < T; i++) {
			String input =scan.nextLine();
			String[] temp =input.split(":");
			String name = temp[0];
			String bats = input.substring(name.length());
			String[] batting = bats.split(",");
			double atBat=batting.length;
			int single =0;
			int triple =0;
			int doub =0;
			int hr =0;
			for(String record:batting){
				if(record.equals("BB"))
					atBat--;
				if(record.equals("1B"))
					single++;
				if(record.equals("2B"))
					doub++;
				if(record.equals("3B"))
					triple++;
				if(record.equals("HR"))
					hr++;
			}
			double avg = ((1*single)+(2*doub)+(3*triple)+(4*hr))/atBat;

			System.out.println(name+"="+avg);

		}
	}
}
