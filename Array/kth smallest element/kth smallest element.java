/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0)
	{
	    int n= sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int k= sc.nextInt();
	    Arrays.sort(arr);
	    //we need to find the kth smallest element ,and we know that the index of array starts from zero ,so the 
	       //to get the kth element we need to get the k-1 as the output 
         //example if the array after sorting is arr= [3,4,7,10,15,20] and if the k is 3 then our output will be 10 as arr index starts from 0 thus to get the kth elemnt we need to get k-1 element.
	        int min = arr[k-1];
	        System.out.println(min);
	

	}
}}
