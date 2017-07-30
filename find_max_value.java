/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=t;i++){
		    String[] line = scan.nextLine().split(" ");
		    int[] numbers = new int[line.length];
		    for(int j=0;j<line.length;j++){
		        numbers[j] = Integer.parseInt(line[j]);
		    }
		    int len = numbers.length;
		    int max =0;
		    boolean N_set = false;
		    for(int num:numbers){
		        if(num == len-1 && !N_set)
		            N_set = true;
		        else
		            max = Math.max(num,max);
		    }
		    System.out.println(max);
		}
	}
}
