package com.algo.amigoose;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMap {

    public static void main(String[] args) {


        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("A",1),new Diamond("African Diamond"));
        System.out.println(new Person("A",1).hashCode());
        System.out.println(new Person("A",1).hashCode());
        System.out.println(map.get(new Person("A",1)));


    }

    public static void maps(){
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

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    record Diamond(String name) {}
}
