package Sesion;

import java.util.Stack;

public class Equals {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st=new Stack<>();

        st1.push(7);
        st2.push(9);
        for (int i = 0; i <5 ; i++) {
            st1.push(i);
            st2.push(i);
        }
        while(!st1.isEmpty()){
            if(st1.peek() == st2.peek()){
                st.push(st1.pop());
                st2.pop();
            }
            else {
                System.out.println(false);
                break;
            }
        }

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st);
        while(!st.isEmpty()){
            st1.push(st.peek());
            st2.push(st.pop());
        }
        System.out.println(st1);
        System.out.println(st2);

    }
}
