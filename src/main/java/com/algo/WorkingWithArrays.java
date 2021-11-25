package com.algo;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors  = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
//        System.out.println(colors[5]);

        colors[2]= "green";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200,300,400,500};

        System.out.println(colors.length);

        System.out.println("1st Way to Print (Normal For Loop) :: ");
        for (int i=0;i< colors.length;i++){
            System.out.println(colors[i]);
        }

        System.out.println("1st Way to Print Reverse (Normal For Loop) :: ");
        for (int i= colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }

        System.out.println("2nd Way to Print (Traditional Foreach) :: ");
        for (String color : colors){
            System.out.println(color);
        }

        System.out.println("3rd Way to Print (Using Stream) :: ");
        Arrays.stream(colors).forEach(System.out::println);


    }
}
