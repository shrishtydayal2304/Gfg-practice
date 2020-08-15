/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{   int n = sc.nextInt();
		    String arr[]= new String[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.next();
		    }
		    int max=0;
		    String s=" ";
		    for(int i=0;i<n;i++)
		    {
		       if(arr[i].length()>max)
		       {
		           max=arr[i].length();
		           s=arr[i];
		       }
		    }
		    System.out.println(s);
		}
	}
}
