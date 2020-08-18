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
		    String s =sc.next();
		    if(s.charAt(0)>=65 && s.charAt(0)<=90)
		    System.out.println(s.toUpperCase());
		    
		    if(s.charAt(0)>=97 && s.charAt(0)<=122)
		    System.out.println(s.toLowerCase());
		    
		}
	}
}
