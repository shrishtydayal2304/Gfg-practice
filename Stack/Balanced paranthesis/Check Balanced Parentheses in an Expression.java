


The time complexity of this approach is O(n) and it’s space complexity is also O(n).


import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
	    String str= "{()}[}]";
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
	}}
	    


