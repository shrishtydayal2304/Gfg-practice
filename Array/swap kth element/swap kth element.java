

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    } 
		    //we need to swap the kth element from end with the kth element from the beginning
		    int temp =arr[x-1];
		    arr[x-1]= arr[n-x];
		    arr[n-x]=temp;
		    for(int i:arr){
		    System.out.print(i + " ");
		    }
		    System.out.println();
	}}
}
