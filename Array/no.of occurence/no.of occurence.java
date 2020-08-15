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
		    int n = sc.nextInt();
		     int x= sc.nextInt();
		    int arr[] =  new int[n];
		    for(int i=0;i<n;i++)
		     arr[i]=sc.nextInt();
		   
		    
		    int count =0;
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++)
		    {
		        if(x==arr[i])
		        
		        count++;
		    }
		    if(count>0)
		    System.out.println(count);
		    else
		    System.out.println("-1");
		       
		        
		}
		    
		
	}
}
