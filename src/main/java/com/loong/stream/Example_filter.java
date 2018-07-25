package com.loong.stream;

import java.util.Arrays;
import java.util.List;

public class Example_filter {
    public static void main(String[] args) {

        List<Person> javaProgrammers =Constant.javaProgrammers;
        /**
         * 未加filter限制条件之前
         */
        javaProgrammers.forEach(System.out::println);
        System.out.println("------------------------------------------");
        /**
         * 加filter限制条件之后
         */
        javaProgrammers.stream().filter(person -> person.getAge()>34).forEach(System.out::println);
    }
}
