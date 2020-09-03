Next Greater Element (or the next largest element from the right)
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.

Examples:

For any array, rightmost element always has next greater element as -1.
For an array which is sorted in decreasing order, all elements have next greater element as -1.
For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.
Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
   
   
   
   
 my code:
 
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
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]<arr[j])
	            top=arr[j];
	            break;
	        }
	    
	    System.out.println(arr[i]+" -- "+top);
	    }
		
	}
}





   
