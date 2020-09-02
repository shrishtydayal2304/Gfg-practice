

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
		    String x=sc.next();
		    String s1= new String();
		    String s2=new String();
		    String s3=new String();
		    for(int i=0;i<x.length();i++)
		    {
		        if( Character.isAlphabetic(x.charAt(i)))
            {
            
            s1 += x.charAt(i);
            
            } else if
            ( Character.isDigit(x.charAt(i)))
            {
            
            s2+= x.charAt(i);
            
            }else {
            
            s3 += x.charAt(i);
            
            }
            
            }
            System.out.println(s1);
            
            System.out.println(s2);
            
            System.out.println(s3);
            }
            
            }
            }
