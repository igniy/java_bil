package Sesion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class bil18 {
    public static int longSeq(ArrayList<Integer> list){
        if(list.isEmpty())
            return 0;
        else if (list.size()==1)
            return 1;
        else{
            int leng=1;
            int max_leng=0;
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i)>list.get(i-1)){
                    leng++;
                    if (leng>max_leng){
                        max_leng=leng;
                    }
                }
                else {
                    leng=1;
                }
            }
            return max_leng;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(14);
        a.add(4);
        a.add(124);
        a.add(-14);
        a.add(1);
        a.add(4);
        System.out.println(a);
        System.out.println(longSeq(a));
        Set<Integer> list=new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int cn=0;
        for(int i:list){
            if (i%2==1){
                cn++;
                break;
            }
        }
        if(cn>0){
            System.out.println(false);
        }
    }
}
