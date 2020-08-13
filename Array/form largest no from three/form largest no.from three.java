/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int l=s.nextInt();
		    int a[]=new int[l];
		    for(int m=0;m<l;m++)
		    {
		        a[m]=s.nextInt();
		    }
				Arrays.sort(a);
				for(int i=a.length-1;i>=0;x--)
				{
					System.out.print(a[i]);
				}
         System.out.println();
		
		}
	}
}
