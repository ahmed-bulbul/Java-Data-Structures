package com.algo;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {

    public static void main(String[] args) {


        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("A",1));
        map.put(2,new Person("B",2));
        map.put(3,new Person("C",3));
        map.put(3,new Person("C2",3));
        System.out.println(map);
        System.out.println("Size -->"+map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.remove(1); // remove by key
        map.entrySet().forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("-----------------");
        map.forEach((key, person) -> {
            System.out.println(key+" - "+person);
        });
        System.out.println(map.getOrDefault(1,new Person("Default",1)));
        System.out.println(map.values());


    }

    record Person(String name, int age) {}
}
