
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=0;tc<t;tc++){
		    String str = sc.next();
		    char[] s = str.toCharArray();
		    Arrays.sort(s);
		    for(int i=0;i<s.length;i++){
		        System.out.print(s[i]);
		    }
		    System.out.println();
		}
	}
}
