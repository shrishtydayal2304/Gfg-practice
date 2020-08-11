/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int a[]= new int[3];
		int b[]= new int[3];
		for(int i=0;i<3;i++)
		{
		    a[i]=sc.nextInt();
		}
			for(int i=0;i<3;i++)
		{
		    b[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<3;i++)
		{ 
		    if(a[i]>b[i])
		    {
		    count1++;
		    }
		    else if(a[i]<b[i])
		    {
		    count2++;
		    }
		   
		}
		System.out.println(count1+" "+ count2);
	}
	}
}
