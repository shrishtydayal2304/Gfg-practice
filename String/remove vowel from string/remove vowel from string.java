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
		    String s = sc.nextLine();
		    System.out.println(s.replaceAll("[aeiouAEIOU]",""));
		}
	}
}
