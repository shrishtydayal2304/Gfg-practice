#question:
Given a positive integer N. The task is to calculate the factorial of N.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, it contains an integer 'N'.

Output:
For each testcase in a new line, print the factorial of N.

Constraints:
1 <= T <= 19
0 <= N <= 18

Example:
Input:
2
1
4

Output:
1
24

Explanation:
Testcase 2: Factorial of 4 is 4 * 3 * 2 * 1 = 24.



**********************************solution************************************************************


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t--> 0)
		{
		    long fact=1;
		    int n= sc.nextInt();
		    
		    for(int i=1;i<=n;i++)
		   {
		       fact=fact*i;
		       
		   }
		System.out.println(fact);
	}	}
}


