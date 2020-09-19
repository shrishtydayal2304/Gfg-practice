import java.lang.*;
import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int i=0;i<t;i++)
	{
	    String s=in.next();
	    String ss=s.toLowerCase();
	    ss=ss+"*";
	    int l=ss.length();
	    int c=1;
	   for(int j=0;j<l-1;j++)
	   {
	      if(ss.charAt(j)==ss.charAt(j+1))
	      {
	          c++;
	      }
	      else
	      {
	          System.out.print(c+""+ss.charAt(j));
	          c=1;
	      }
	   }
	  System.out.println();  
	}
	}
}
