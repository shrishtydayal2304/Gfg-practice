import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner ob=new Scanner(System.in);
		int T=ob.nextInt();
		while(T-->0)
		{
		    int count=0;
		    int n=ob.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[j]=ob.nextInt();
		    }
		    for(int j=0;j<arr.length;j++)
		    {
        //for index element equal to index
		        if(arr[j]==(j+1))
		        {
		            System.out.print(arr[j] + " ");
		            
		        }
		        else
		        {
		           count++;
		       }}
		    
		    
		   if(count==arr.length)
		    {
		    System.out.print("Not Found");
		    }
		       System.out.println();
		    
		}
	}
}
