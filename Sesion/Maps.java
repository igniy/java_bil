package Sesion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        map.put(12,"AAA");
        map.put(13,"AAC");
        map.put(14,"AAB");
        map.put(15,"AAA");
        for(Map.Entry i:map.entrySet()){
            map2.put(i.getValue().toString(), Integer.parseInt(i.getKey().toString()));
        }
        System.out.println(map2.toString());
    }
}
