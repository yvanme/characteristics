package com.loong.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example_sort {
    public static void main(String[] args) {
//        String[] players = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka", "David Ferrer",
//                "Roger Federer", "Andy Murray",
//                "Tomas Berdych", "Juan Martin Del Potro",
//                "Richard Gasquet", "John Isner"};
        String[] players = {"4", "8",
                "1", "6",
                "7", "5",
                "1", "3",
                "3", "9"};
        Integer[] numbers = {12,32,1,67,98,45,9,45,32,3243,5,76,32,2};

//        // 1.1 使用匿名内部类根据 name 排序 players
//        Arrays.sort(players, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s1.compareTo(s2));
//            }
//        });
//
//        // 1.2 使用 lambda expression 排序 players
//        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
//        Arrays.sort(players, sortByName);

        // 1.3 也可以采用如下形式:
      // Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
       Arrays.sort(numbers, (Integer s1, Integer s2) -> (s1.compareTo(s2)));
//        for (String player:players
//             ) {
//            System.out.println(player);
//        }
        for (Integer player:numbers
                ) {
            System.out.println(player);
        }

    }
}

