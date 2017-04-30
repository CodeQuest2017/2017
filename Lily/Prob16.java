// INCOMPLETE
import java.util.*;
import java.io.*;

public class Prob16 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Prob16.in.txt"));
		final int T = scan.nextInt();
		scan.nextLine();
		String input = "";
		for(int i = 0; i < T; i++) {
			input += scan.nextLine() +"!";
		}
		String[] inputs = input.split("!");

		int result = 0;
		String problem = "";
		int[] nums;
		int[] ops;
		int lower = 0;
		int higher = 0;
		int numscount = 0;
		int opscount = 0;
		List<String> newcase;
		String newstr = "";

		for (int i=0;i<inputs.length;i++){
			//each case
			//System.out.println(inputs[i]);
			result = Integer.parseInt(inputs[i].split(":")[0]);
			problem = inputs[i].split(":")[1];
			//nums = new int[];
			higher = ((problem.split(" ").length/2)+1));
			lower = higher - 1;
			nums = new int[higher];
			ops = new int[lower];
			newstr = "";
			newcase = new ArrayList<String>();

			for (int a=0;a<problem.split(" ").length;a++){
				if (inputs[i].split(" ")[a].equals(Integer.parseInt(inputs[i].split(" ")[a]))){ //isint
					nums[numscount] = Integer.parseInt(inputs[i].split(" ")[a]);
					numscount++;
				}
				else{
					ops[opscount] = Integer.parseInt(inputs[i].split(" ")[a]);
					opscount++;
				}
			}

			for (int a=0;a<lower;a++){ //start
				for (int b=0;b<lower;b++){ //count
					newstr = "";
					if (count>newstr)
				}
			}
		}



	}
	public static int eval(){

	}
}
