package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSetMain {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Spring Framework");
        map.put(2, "JDK");
        map.put(1, "Java");
        map.put(5, "Java中文社群");
        map.put(4, "MyBatis framework");
        /*//EntrySet遍历
        System.out.println("============EntrySet===============");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
        //KeySet
        System.out.println("===========KeySet===========");
        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.print(key);
            System.out.print(map.get(key));
        }
        //ForEach EntrySet
        System.out.println("=========ForEach EntrySet=========");
        for (Map.Entry<Integer, String> iterator2: map.entrySet()) {
            System.out.println(iterator2.getKey());
            System.out.println(iterator2.getValue());
        }*/
        //parallelStream
        map.entrySet().parallelStream()
                .forEach((entry)->{
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                });
        /*map.keySet().parallelStream()
                .forEach(i->{
                    System.out.print(i);
                    System.out.println(map.get(i));
                });*/
    }
}
