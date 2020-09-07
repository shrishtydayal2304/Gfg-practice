Given an array of positive integers and a positive number K. Write a code to find the maximum sum of a subarray of size k.

For example:

Input: {2, 1, 5, 1, 3, 2}, K = 3

Output: 9 {5, 1, 3}

I have used the sliding window approch. In this method, the size of the sliding window is fixed to be of size k. 


public class MaximumSubarray {
 
   public static int getSum(int arr[], int k) {
        int start = 0;
        int sum = 0;
        int maxSum = 0;
 
        for(int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
 
            if(end >= k -1) {
               maxSum = Math.max(sum, maxSum);
               sum = sum - arr[start];
               start++;
            }
         }
      
       return maxSum;
   }
 
   public static void main(String[] args) {
     
         int[] arr = {2, 1, 5, 1, 3, 2};
         int k = 3;
 
         int result =getSum(arr, k);
         System.out.println(result);
    }
}
The time complexity of this approch is O(n)


*******************************-------------------------------------------------------******************************************

2nd method : if we use the brute force approch, the time complexity will be O(n*n)


public class Main
{ 
 
 
   public static int getSum(int arr[], int k) {
     
     int maxSum = 0;
 
     //Traverse an array from 0 to n-k
     for(int i = 0; i < arr.length-k; i++) {
 
         int sum = 0;
 
            for(int j=i;j<i+k;j++)
            {
             
               sum = sum + arr[j];
               
            }
              maxSum = Math.max(sum, maxSum);
         }
      
       return maxSum;
   }
 
   public static void main(String[] args) {
     
         int[] arr = {2, 1, 5, 1, 3, 2};
         int k = 3;
 
         int result =getSum(arr, k);
         System.out.println(result);
    }}

