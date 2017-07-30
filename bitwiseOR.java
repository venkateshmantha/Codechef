import java.util.*;
 
class Solution{
 
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=1;i<=t;i++){
			int len = scan.nextInt();
			scan.nextLine();
			String[] line = scan.nextLine().split(" ");
			int[] arr = new int[line.length];
			for(int j=0;j<line.length;j++){
				arr[j] = Integer.parseInt(line[j]);
			}
			int res = 0;
			for(int num:arr){
				res = res | num ;
			}
			System.out.println(res);
		}	
	}
}