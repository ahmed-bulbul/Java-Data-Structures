package com.algo;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("TOP ->"+stack.peek()); // return the top of the stack
        System.out.println("SIZE ->"+stack.size());
        System.out.println("POP-> "+stack.pop()); // remove the top of the stack
        System.out.println("SIZE ->"+stack.size());
        System.out.println(stack.empty()); // check if the stack is empty
    }
}
