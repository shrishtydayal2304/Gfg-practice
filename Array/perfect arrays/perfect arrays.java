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
		{
		    int n= sc.nextInt();
		    int arr[]= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		     int count=0;
		    for(int j=0;j<n;j++)
		    {
        //to check the reverse array matches the array
		        if(arr[j]==arr[n-j-1])
		        {
		            count++;
		        }
		    }
		    if(count==n)
		    {
		        System.out.println("PERFECT");
		    }
		    else
		    {
		        System.out.println("NOT PERFECT");
		    }
		}
	}
}
