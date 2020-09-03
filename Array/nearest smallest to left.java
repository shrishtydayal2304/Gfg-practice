Given an array of integers, find the closest (not considering distance, but value) smaller on left of every element. 
If an element has no smaller on the left side, print -1.



code:

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
	    int top=-1;
	    for(int i=0;i<n;i++)
	    { 
	        for(int j=i-1;j>=0;j--)
	        {
	            if(arr[j]<arr[i])
	            top=arr[j];
	            break;
	        }
	    
	    System.out.println(arr[i]+" -- "+top);
	    }
		
	}
}
