package codechef;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SocialNetwork {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		HashSet<Integer> set = new HashSet();
		while(n-- > 0){
			set.add(scan.nextInt());
		}

		TreeMap<Integer,String> spl_frnd_map = new TreeMap(Collections.reverseOrder());
		TreeMap<Integer,String> other_map = new TreeMap(Collections.reverseOrder());
		while(m-- >  0){
			int f = scan.nextInt();
			int p = scan.nextInt();
			if(set.contains(f))
				spl_frnd_map.put(p,scan.next());
			else
				other_map.put(p,scan.next());
		}

		for(Map.Entry entry:spl_frnd_map.entrySet())
			System.out.println(entry.getValue());

		for(Map.Entry entry:other_map.entrySet())
			System.out.println(entry.getValue());
	}

}
