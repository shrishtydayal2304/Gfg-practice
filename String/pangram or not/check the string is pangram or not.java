import java.lang.*;
import java.io.*;


 // } Driver Code Ends


class solve
{
    public static boolean checkPangram  (String s)
    {
        int[] check = new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) >='a' && s.charAt(i)<='z')
                check[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(check[i]==0)
                return false;
        }
        return true;
    }
}

// { Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new solve().checkPangram (s)==true?1:0);
	  }
	  
	 }
}  // } Driver Code Ends
