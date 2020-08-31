/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc= new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0)
	{
	    int n = sc.nextInt();
	    int s=sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++)
	    
	        arr[i]=sc.nextInt();
	    
	    maxsum(arr,n,s);
	}
	}
	static void maxsum(int arr[] , int n, int s)
	{
	    int i=0; 
	    int sum=0;
	    for(int j=0;j<n;j++)
	    {
	        sum=sum+arr[j];
	    
	    while(sum > s)
	    {
	        sum=sum-arr[i++];
	    }
	    if(sum==s)
	    {
	        System.out.println((i+1)+" "+(j+1));
	        return;
	    }
	}
	System.out.println("-1");
}
}
