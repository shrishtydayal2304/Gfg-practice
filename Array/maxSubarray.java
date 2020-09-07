Given an integer array of N elements, find the maximum sum contiguous subarray (containing at least one element).

For example –

Example 1 –

Input: { 1, 2, -5, 4, 3, 8 , 5 }

Output: 20




import java.util.*;
public class Main
{ 
    public static int findmax(int arr[])
{
	
	
		int sum=arr[0];
		int maxsum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		    if(sum<0)
		    {
		        sum=arr[i];
		        
		    }
		    else{
		        sum=sum+arr[i];
		    }
		    maxsum=Math.max(sum,maxsum);
		}
		return maxsum;
	}

public static void main(String[] args) {
   	int arr[]= { 1, 2, -5, 4, 3, 8 , 5 };
   	int result =findmax(arr);
   	System.out.println(result);
}}

The time complexity of this approch is O(n)
