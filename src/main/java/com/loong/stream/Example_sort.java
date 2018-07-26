package com.loong.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Example_sort {
    public static void main(String[] args) {

        List<Person> javaProgrammers =Constant.javaProgrammers;

        javaProgrammers.forEach(System.out::println);

        javaProgrammers.stream()
                .sorted( (p, p2) -> (p.getSalary() - p2.getSalary()) )
                .collect(toList()).forEach(System.out::println);

    }
}
