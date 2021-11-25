package com.algo.amigoose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> colorsUnmodifiable =  List.of(
                "blue",
                "yellow"
        );
        System.out.println(Arrays.toString(colorsUnmodifiable.toArray()));

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        System.out.println("Using foreach loop :: ");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Using for each loop");
        colors.forEach(System.out::println);

        System.out.println("Traditional for loop :: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }


}
