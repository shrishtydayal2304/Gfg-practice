/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		      Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int num = sc.nextInt();
            String name = "";
            for(int j = 0;j<num;j++)
            {
                char kk = sc.next().charAt(0);
                name = name + kk;
            }
        
            System.out.println(name);
        }
    }

	}
