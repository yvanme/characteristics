package com.loong.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_limit {
    public static void main(String[] args) {

        List<Person> javaProgrammers =Constant.javaProgrammers;
        /**
         * 未加limit限制条件之前
         */
        javaProgrammers.forEach(System.out::println);

        System.out.println("------------------------------------------");
        /**
         * 加limit限制条件之后
         */
        javaProgrammers.stream().limit(1).forEach(System.out::println);
    }
}
