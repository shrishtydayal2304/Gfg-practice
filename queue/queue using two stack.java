import java.util.Queue; 
import java.util.Stack;
public class Main{
    private Stack stack1 = new Stack<>();
    private Stack stack2 = new Stack<>();
    public void enqueue(int val)
    {
        stack1.push(val);
    }
    public void dequeue()
    
    {
        if(stack2.isEmpty())
        {
        if(stack1.isEmpty())
        {
            System.out.println("no deque operation can be performed");
        }
        else
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
    }
    System.out.println(stack2.pop());
}
    
    public static void main(String[] args) {
 
         Main qu = new Main();
           qu.enqueue(3);
           qu.enqueue(4);
           qu.enqueue(5);
 
           qu.dequeue();
 
           qu.enqueue(6);
           qu.enqueue(7);
 
           qu.dequeue();
           qu.dequeue();
           qu.dequeue();
 
    }

}
