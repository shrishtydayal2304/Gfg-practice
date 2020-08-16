/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n= sc.nextInt();
		    int arr[] = new int[n];
		    int k = sc.nextInt();
		    for (int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		}
        	int pos=0;
	for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
			    pos =i+1;
				System.out.println(pos);
				break;
			}
			if(i==n-1 && arr[i]!=k)
			{
				System.out.println("-1");
			}
		}
		
	}
	System.out.println();
}
}
