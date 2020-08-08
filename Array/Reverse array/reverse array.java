/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
			Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
		    int n= sc.nextInt();
		    int arr[] = new int[n];
		    for(int i =0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    } 
		   
		    int arr1[]=new int[n];
		    int x=n-1;
		     for(int i =0;i<n;i++)
		     {
		         arr1[i]=arr[x];
		         x=x-1;
		        
		     }
//The line is iterating over each index of array an taking out its value in a sequence in a i varable.
		    for(int i:arr1)
		     {
		          System.out.print(i+ " ");
		     }
		     System.out.println();
		        
		}
	}
}
