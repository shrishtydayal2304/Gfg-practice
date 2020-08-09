import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int n = scan.nextInt();
        //the no.with which the array will be compared
		    int x = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		    int min=0;
        int max=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]<=x){
		            min++;
		        }
		        if(arr[i]>=x){
		            max++;
		        }
		        
		    }
		    System.out.println(min +" "+ max);
		}
	}
}
