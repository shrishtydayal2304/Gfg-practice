write a Java Program to find pairs with given sum in a sorted array. Find pairs with given sum in an array.






public class Main{
    public static void main(String[] args)
    {
       int arr[] = {1,3,2,5,7,6,8};
       int sum=9;
       int high=arr.length-1;
       int low =0;
       while(low<high)
       {
           if(arr[high]+arr[low]<sum)
           {
               low++;
           }
           else if(arr[high]+arr[low]>sum)
           {high--;
           }
           else if(arr[high]+arr[low]==sum)
           {
              System.out.println("pair("+ arr[low]+','+ arr[high]+")");
              high--;
              low++;
           }
       }}
          
    }
