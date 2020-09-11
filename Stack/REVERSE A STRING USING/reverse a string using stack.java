class Solution {
    
    public void reverse(String str){
       String s="";
       char ch;
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<str.length();i++)
       {
           ch=str.charAt(i);
           stack.push(ch);
       }
       while(!stack.empty())
       {
           ch=stack.pop();
           s=s+ch;
       }
       System.out.print(s);
       System.out.println();
    }
}
