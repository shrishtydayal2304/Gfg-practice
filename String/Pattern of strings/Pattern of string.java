/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    { 
	        String s=sc.next();
	       
	       for(int i=s.length();i>0;i--){
	           System.out.println(s.substring(0,i));
	       }
	    }
		//code
	}
}

					
			
