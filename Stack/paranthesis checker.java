Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”

Input:
The first line of input contains an integer T denoting the number of test cases.  Each test case consists of a string of expression, in a separate line.

Output:
Print 'balanced' without quotes if the pair of parenthesis is balanced else print 'not balanced' in a separate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ |s| ≤ 105

Example:
Input:
3
{([])}
()
([]

Output:
balanced
balanced
not balanced




*******************************************____________________________________________________________________*************************************



import java.util.Stack;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	   // String str= "{()}[}]";
	   int t= sc.nextInt();
	   while(t-->0)
	   {
	   String str =sc.next();
	    Stack<Character> ch = new Stack<>();
	    for(int i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)=='{'|| str.charAt(i)=='(' || str.charAt(i)=='[')
	       { ch.push(str.charAt(i));
	        
	    }
	    else if(!ch.empty() && (
	        (str.charAt(i)==']' && ch.peek()=='[') ||
	        (str.charAt(i)=='}' && ch.peek()=='{')||
	        (str.charAt(i)==')' && ch.peek()=='(')))
	        {
	            ch.pop();
	        }
	        else{
	            ch.push(str.charAt(i));
	        }
	    }
	    if(ch.empty())
	    {
	        System.out.println("balanced");
	    }
	        else 
	        System.out.println("not balanced");
	   }
	}}
	    
