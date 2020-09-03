Given an array of integers, find the closest (not considering distance, but value) greater on left of every element.
If an element has no greater on the left side, print -1.

code :

import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int top=0;
	    for(int i=0;i<n;i++)
	    { top=-1;
	        for(int j=i-1;j>0;j--)
	        {
	            if(arr[i]<arr[j])
	            top=arr[j];
	            break;
	        }
	    
	    System.out.println(arr[i]+" -- "+top);
	    }
		
	}
}
