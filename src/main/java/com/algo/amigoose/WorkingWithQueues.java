package com.algo.amigoose;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person( "John", 21));
        linkedList.add(new Person( "Mariam", 18));
        linkedList.add(1, new Person( "Ali", 40)); // adds at index 1
        linkedList.addLast(new Person( "Ahmed", 25)); // adds at the end
        linkedList.addFirst(new Person( "Sara", 19)); // adds at the beginning
        ListIterator<Person> personListIterator =linkedList.listIterator();


        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println("===========================");
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues(){
        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("John", 21));
        superMarket.add(new Person("Mariam", 18));
        superMarket.add(new Person("Ali", 40));

        System.out.println(superMarket.size());
        System.out.println(superMarket.peek()); // John
        System.out.println(superMarket.poll()); // removes and returns the head of the queue
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek()); // Mariam

    }

    static record Person(String name, int age){}
}
