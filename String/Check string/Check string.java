/*package whatever //do not write package name here */

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
		 
		    String s = sc.next();
		   char ch=s.charAt(0);
		int count=0;
		for(int j=1;j<s.length();j++)
		{
		if(ch==s.charAt(j))
		{
		count++;
		}
		}
		if(count==s.length()-1)
		{
		System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
		System.out.println();
   	  }

	}

}
