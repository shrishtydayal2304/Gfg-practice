

//using stack
public class Main {
 
     public static int[] nextGreaterElement(int[] arr) {
         
        int[] output = new int[arr.length];
        //fill()
        Arrays.fill(output, -1);
 
        //Stack declaration
        Stack<Integer> st = new Stack<>();
         
        //Traverse an array 
        for (int i = 0; i < arr.length; i++) {
          
           while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                     output[st.pop()] = arr[i];
            }
 
            st.push(i);
         }
 
        return output;
     }
 
    public static void main(String[] args) {
          int arr[] = { 4, 2, 6, 8, 1 };
          int[] output = nextGreaterElement(arr);
 
          System.out.println(Arrays.toString(output));
    }
}
