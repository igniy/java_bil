package Sesion;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.Object;
public class Test {
    public static boolean m(Map<String,String> a) {
        Set<Object> s=new HashSet<>();
        for(Map.Entry en: a.entrySet()){
            s.add(en.getValue());
        }
        if(a.size()!=s.size())
            return false;
        else
            return true;
    }

    public LinkedList<Integer> my(LinkedList<Integer> list){
        int i=0;
        for(Object f:list){
            i++;
        }
        return list;
    }


    public static void m() {
        HashMap<String,String> a= new HashMap<>();
        a.put("A","B");
        a.put("B","A");
        a.put("C","A");
        a.put("D","C");
        System.out.println(m(a));
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(11);

        MyLinkList a=new MyLinkList(list);
        a.removeDuplicates();
        a.to();

    }
}
