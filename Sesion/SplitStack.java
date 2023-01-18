package Sesion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {
    public static void SplitStack(Stack<Integer> stack) {
        Queue<Integer> queue=new LinkedList();
        int c;
        int il=stack.size();
        for(int i=0;i<il;i++){
            c=stack.pop();
            queue.add(c);
        }
        for (int i=0;i<il;i++){
            int f=queue.poll();
            if(f<0)
            {
                stack.push(f);
            }
            else{
                queue.add(f);
            }
        }
        il =queue.size();
        for (int i=0;i<il;i++){
            int f=queue.poll();
            stack.push(f);
        }
        System.out.println(stack);
    }




    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(-1);
        stack.push(-12);
        stack.push(11);
        SplitStack(stack);
    }
}
