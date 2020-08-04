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
		    int d = sc.nextInt();
		    int arr [] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
        // set builder is used to perfrom operations on string objects
		    StringBuffer ap =new StringBuffer();
		    for(int i =d;i<n;i++)
		    {
		        ap.append(arr[i]+ " ");
		    }
		     for(int i =0;i<d;i++)
		    {
		        ap.append(arr[i]+ " ");
		    }
		    System.out.println(ap);
		}
	}
}
