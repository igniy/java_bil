package Sesion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sec {
    public static void main(String[] args) {
        Queue a=new LinkedList();
        Stack c =new Stack<>();
        a.add("AAAA");
        a.add("AAAB");
        a.add("AAAC");
        a.add("AAAD");
        int i=0;
        for(Object ls:a){
            if(i%2!=0)
                c.push(ls);
            i++;

        }
        for (i=0;i<a.size();i++){
            var s= a.poll();
            if(i%2==0){
                a.add(s);
            }
            else a.add(c.pop());
        }
        System.out.println(a);


    }
}
