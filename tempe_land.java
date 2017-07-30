import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,i,j,n,flag;
		String teamName;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		t = Integer.parseInt(buffer.readLine().trim());
		String line;
		int[] a = new int[100];
		while(t-->0)
		{
		    n = Integer.parseInt(buffer.readLine().trim());
		    line = buffer.readLine();
		    String str[] = line.trim().split("\\s+");
		    for(i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(str[i]);
		        //System.out.print(a[i]+" ");
		    }
		    //System.out.println();
		    
		 
    		 if(n%2==0)
    		    System.out.println("no");
    		 else
    		 {
    		     flag=0;
    		     if(a[0]==1)
    		     {
    		         for(i=1;i<=n/2;i++)
    		         {
    		             if(a[i]!=a[i-1]+1)
    		             {
    		                 flag=1;
    		                 break;
    		             }
    		         }
    		         if(flag==0)
    		         {
    		             for(i=n/2+1;i<n;i++)
    		             {
    		                 if(a[i]!=a[i-1]-1)
    		                 {
    		                     flag=1;
    		                     break;
    		                 }
    		             }
    		         }
    		         if(flag==0)
    		         {
    		             for(i=0;i<=n/2;i++)
    		             {
    		                 if(a[i]!=a[n-i-1])
    		                 {
    		                     flag=1;
    		                     break;
    		                 }
    		             }
    		         }
    		         if(flag==0)
    		            System.out.println("yes");
    		         else
    		            System.out.println("no");
    		     }
    		     else
    		        System.out.println("no");
    		 }
		}
	}
}
 