/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int count=0;
		    String s = sc.nextLine();
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)>=65 && s.charAt(i)<=90)
		        count++;
		        
		    }
		    System.out.println(count);
		}
	
	}
}
