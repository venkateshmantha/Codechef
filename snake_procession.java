package codechef;

import java.util.Scanner;

public class SnakeProcession {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
			int len = scan.nextInt();
			String report = scan.next();
			report = report.replaceAll("\\.", "");
			if(report.matches("(HT)*"))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}

	}

}
