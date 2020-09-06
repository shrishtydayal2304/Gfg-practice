Write a java code to find duplicate elements in array.  Print Duplicate in Array 
Solution: We can use bruteforce technique , hashmap or set
i have used set as it cannot store duplicate element. Set is an interface which can be implemented by hashset and treeset



import java.util.Set;
import java.util.HashSet;


public class Main{
    public static void main(String[] args)
    {
        Set<Integer> uniq = new HashSet<>();
        boolean dubli = false;
        
        int arr[]= {1,5,4,3,2,1,3,6};
       
        for(int i=0;i<arr.length;i++)
        {
            if(uniq.contains(arr[i]))
            {
                dubli= true;
                System.out.println("duplicate is : " + arr[i]);
            }
            else
            {
                uniq.add(arr[i]);
            }
        }
        //ifno dublicate is found
        if(!dubli)
        {
            System.out.println("-1");
        }
    }
}import java.util.Set;
import java.util.HashSet;


public class Main{
    public static void main(String[] args)
    {
        Set<Integer> uniq = new HashSet<>();
        boolean dubli = false;
        
        int arr[]= {1,5,4,3,2,1,3,6};
       
        for(int i=0;i<arr.length;i++)
        {
            if(uniq.contains(arr[i]))
            {
                dubli= true;
                System.out.println("duplicate is : " + arr[i]);
            }
            else
            {
                uniq.add(arr[i]);
            }
        }
        //ifno dublicate is found
        if(!dubli)
        {
            System.out.println("-1");
        }
    }
}
