import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
      //first line should contain the test case t
	    int t = sc.nextInt();
	    while(t -->0)
	    {
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i =0 ; i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	    // the element x wrt which the elements of the array will be comapred 
	    int x = sc.nextInt();
	    int flag =0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]<=x)
	        {
	        
	        flag++;
	        }
	    }
	    
		System.out.println(flag);
	    }
	}
}
